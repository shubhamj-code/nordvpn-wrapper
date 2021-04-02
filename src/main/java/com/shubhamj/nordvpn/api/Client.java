package com.shubhamj.nordvpn.api;


import com.shubhamj.nordvpn.pojo.NordServer;

import java.io.IOException;
import java.util.List;

public interface Client {

    public void close() throws IOException;
    public List<String> getCountryList();
    public List<NordServer> getNordServers() throws IOException;

}
