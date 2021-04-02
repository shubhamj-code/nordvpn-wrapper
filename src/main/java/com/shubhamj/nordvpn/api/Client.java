package com.shubhamj.nordvpn.api;

import com.shubhamj.nordvpn.pojo.HostInfo;

import java.util.List;
import java.util.Map;

public interface Client {

    public void close();
    public String currentIp();
    public List<String> dnsServers();
    public Map<String, HostInfo> getHostInfo();
    public Map<String, Integer> getHostLoad();
    public List<String> getRankedHosts();
    public boolean isCredentialsValid(String username, String password);

}
