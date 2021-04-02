package com.shubhamj.nordvpn.api;

import com.shubhamj.nordvpn.pojo.HostInfo;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class NordClient implements Client {

    private final String API_URL= "https://api.nordvpn.com";
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    public NordClient() {
    }

    @Override
    public void close() {

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
}
