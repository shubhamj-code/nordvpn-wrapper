package com.shubhamj.nordvpn.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shubhamj.nordvpn.pojo.NordServer;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class NordClient implements Client {

    private final String API_URL = "https://api.nordvpn.com/";
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final CloseableHttpClient client = HttpClients.createDefault();
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void close() throws IOException {
        this.client.close();
    }

    @Override
    public List<NordServer> getNordServers() throws IOException {
        String nordServers = API_URL + "server";
        String json = this.getText(nordServers);
        return this.objectMapper.readValue(json, new TypeReference<List<NordServer>>(){});
    }

    @Override
    public Set<String> getCountries() throws IOException {

        Set<String> countries = new HashSet<>();
        List<NordServer> servers = this.getNordServers();

        countries = servers.stream().map(NordServer::getCountry).collect(Collectors.toSet());

        return countries;
    }

    private String getText(String url) throws IOException {

        String tR = "";

        logger.log(Level.INFO, "Calling: {0}", url);
        CloseableHttpResponse response = getResponse(url);
        HttpEntity entity = response.getEntity();

        if (entity != null) {
            tR = EntityUtils.toString(entity);
        }

        response.close();

        return tR;
    }

    private CloseableHttpResponse getResponse(String url) throws IOException {
        HttpGet request = new HttpGet(url);
        return this.client.execute(request);
    }

    public static void main(String[] args) throws IOException {
        NordClient client = new NordClient();
        System.out.println(client.getCountries());
    }

}
