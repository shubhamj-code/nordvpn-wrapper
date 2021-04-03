package com.shubhamj.nordvpn.pojo;

public class City {

    private int id;
    private double latitude;
    private double longitude;
    private String dnsName;
    private int hubScore;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getDnsName() {
        return dnsName;
    }

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    public int getHubScore() {
        return hubScore;
    }

    public void setHubScore(int hubScore) {
        this.hubScore = hubScore;
    }
}
