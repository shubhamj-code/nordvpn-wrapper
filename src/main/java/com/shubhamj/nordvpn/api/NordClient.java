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
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * The following class can be used to retrieve public information of NordVPN servers and can be used in your Java
 * application as a proxy using your own credentials.
 *
 * @author Shubham Jain
 * @version v1.0
 */
public class NordClient {

    private final String API_URL = "https://api.nordvpn.com/";
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final CloseableHttpClient client = HttpClients.createDefault();
    private final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Close the existing http connection to the API_URL to release the resource.
     */
    public void close() throws IOException {
        this.client.close();
    }

    /**
     * Gets the list of all the available nord vpn servers
     *
     * @throws IOException Throws IOException if the retrived json could not be converted to list of nord servers
     **/
    public List<NordServer> getNordServers() throws IOException {

        String nordUrl = API_URL + "server";
        String json = this.getText(nordUrl);
        return this.objectMapper.readValue(json, new TypeReference<List<NordServer>>() {
        });
    }

    /**
     * Gets the list of unique countries where nord vpn server exists
     *
     * @throws IOException Throws IOException if the nord vpn server list couldn't be retrieved
     */
    public Set<String> getCountries() throws IOException {

        Set<String> countries = new HashSet<>();
        List<NordServer> servers = this.getNordServers();

        countries = servers.stream().map(NordServer::getCountry).collect(Collectors.toSet());

        return countries;
    }

    /**
     * Fetches all the number of servers available in all the countries
     *
     * @throws IOException throws IOException if the nord vpn server list couldn't be retrieved
     */
    public Map<String, Integer> numberOfServersInCountry() throws IOException {
        Map<String, Integer> serversInCountries = new HashMap<>();

        List<NordServer> servers = this.getNordServers();

        for (NordServer server : servers) {
            serversInCountries.put(server.getCountry(), serversInCountries.getOrDefault(server.getCountry(), 0) + 1);
        }

        return serversInCountries;
    }

    /**
     * Fetches all the available domains of the vpn servers
     *
     * @throws IOException throws IOException if the nord vpn server list couldn't be retrieved
     */
    public List<String> getAvailableVpnServers() throws IOException {

        List<String> availableServers = new ArrayList<>();
        availableServers = this.getNordServers().stream().map(NordServer::getDomain).collect(Collectors.toList());
        return availableServers;

    }

    /**
     * Fetches all the available servers of a particular country
     *
     * @param flag Requires an ISO code of a particular country
     * @throws IOException throws IOException if the nord vpn server list couldn't be retrieved
     */
    public List<String> getVpnServersByCountry(String flag) throws IOException {

        return this.getNordServers().stream().filter(n -> n.getFlag().equalsIgnoreCase(flag)).map(NordServer::getDomain)
                .collect(Collectors.toList());

    }

    /**
     * Returns a random server from a list of nord vpn servers if a particular server could be a proxy otherwise
     * returns null
     *
     * @throws IOException throws IOException if the nord vpn server list couldn't be retrieved
     */
    public NordServer getRandomProxy() throws IOException {
        List<NordServer> servers = this.getNordServers();
        Collections.shuffle(servers);
        for (NordServer server : servers) {
            if (server.getFeatures().canBeProxy()) {
                return server;
            }
        }
        logger.log(Level.SEVERE, "Could not find any random proxy, please try again. ");
        return null;
    }

    /**
     * Returns a list of all the available servers which can be proxy
     *
     * @throws IOException throws IOException if the nord vpn server list couldn't be retrieved
     */
    public List<NordServer> getProxies() throws IOException {
        return this.getNordServers().stream().filter(e -> e.getFeatures().canBeProxy()).collect(Collectors.toList());
    }

    /**
     * Makes an API call and retrieves the json document from the URL
     *
     * @return Returns a json text from the webpage
     * @throws IOException throws IOException if there was a problem while parsing the JSON from the webpage
     */
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
        System.out.println(client.getAvailableVpnServers());
    }

}
