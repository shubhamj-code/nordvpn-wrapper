package com.shubhamj.nordvpn.api;

import com.shubhamj.nordvpn.pojo.HostInfo;

import java.util.List;
import java.util.Map;

public class NordClient implements Client {
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
