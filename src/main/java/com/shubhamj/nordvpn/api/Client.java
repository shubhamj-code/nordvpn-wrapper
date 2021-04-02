package com.shubhamj.nordvpn.api;


import com.shubhamj.nordvpn.pojo.NordServer;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Client {

    public void close() throws IOException;
    public List<NordServer> getNordServers() throws IOException;
    public Set<String> getCountries() throws IOException;
    public Map<String, Integer> numberOfServersInCountry() throws IOException;
    public List<String> getAvailableVpnServers() throws IOException;
    public List<String> getVpnServersByCountry(String flag) throws IOException;
}
