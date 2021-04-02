package com.shubhamj.nordvpn.pojo;

public class ServerBandwidth {

    private String hostname;
    private Integer percent;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "ServerBandwidth{" +
                "hostname='" + hostname + '\'' +
                ", percent=" + percent +
                '}';
    }
}
