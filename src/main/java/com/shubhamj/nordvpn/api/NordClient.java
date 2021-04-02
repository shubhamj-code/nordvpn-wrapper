package com.shubhamj.nordvpn.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shubhamj.nordvpn.pojo.NordServer;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.DataInput;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public List<String> getCountryList() {
        return null;
    }

    @Override
    public List<NordServer> getNordServers() throws IOException {
        String nordServers = API_URL + "server";
        String json = this.getText(nordServers);
        return this.objectMapper.readValue(json, new TypeReference<List<NordServer>>(){});
    }

    private String getText(String endPoint) throws IOException {
        String tR = "";

        logger.info("Calling " + endPoint);

        CloseableHttpResponse response = getResponse(endPoint);
        HttpEntity entity = response.getEntity();

        if (entity != null) {
            tR = EntityUtils.toString(entity);
        }

        response.close();

        return tR;
    }

    public CloseableHttpResponse getResponse(String url) throws IOException {
        HttpGet request = new HttpGet(url);
        return this.client.execute(request);
    }

    public static void main(String[] args) throws IOException {
        NordClient client = new NordClient();
        List<NordServer> servers = client.getNordServers();
        System.out.println(servers.size());
        System.out.println(servers.get(servers.size() - 1));
    }

}
