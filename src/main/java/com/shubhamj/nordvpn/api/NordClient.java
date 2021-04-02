package com.shubhamj.nordvpn.api;

import com.shubhamj.nordvpn.pojo.HostInfo;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class NordClient implements Client {

    private final String API_URL = "https://api.nordvpn.com/";
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final CloseableHttpClient client = HttpClients.createDefault();


    public NordClient() throws IOException {
    }

    @Override
    public void close() throws IOException {
        this.client.close();
    }

    @Override
    public String currentIp() {
        return null;
    }

    @Override
    public List<String> dnsServers() {
        return null;
    }

    @Override
    public Map<String, HostInfo> getHostInfo() {
        return null;
    }

    @Override
    public Map<String, Integer> getHostLoad() {
        return null;
    }

    @Override
    public List<String> getRankedHosts() {
        return null;
    }

    @Override
    public boolean isCredentialsValid(String username, String password) {
        return false;
    }

    private String getText(String endPoint) throws IOException {
        String tR = "";

        endPoint = this.API_URL + endPoint;

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
        client.getText("server/stats");
    }
}
