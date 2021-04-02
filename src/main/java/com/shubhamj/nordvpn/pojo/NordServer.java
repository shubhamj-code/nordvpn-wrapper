package com.shubhamj.nordvpn.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NordServer {

    @JsonProperty("id")
    private int id;
    @JsonProperty("ip_address")
    private String ipAddress;
    @JsonProperty("search_keywords")
    private List<String> searchKeywords;
    @JsonProperty("categories")
    private List<Categories> categories;
    @JsonProperty("name")
    private String name;
    @JsonProperty("domain")
    private String domain;
    @JsonProperty("price")
    private double price;
    @JsonProperty("flag")
    private String flag;
    @JsonProperty("country")
    private String country;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("load")
    private int load;
    @JsonProperty("features")
    private Features features;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public List<String> getSearchKeywords() {
        return searchKeywords;
    }

    public void setSearchKeywords(List<String> searchKeywords) {
        this.searchKeywords = searchKeywords;
    }

    public List<Categories> getCategories() {
        return categories;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "NordServer{" +
                "id=" + id +
                ", ipAddress='" + ipAddress + '\'' +
                ", searchKeywords=" + searchKeywords +
                ", categories=" + categories +
                ", name='" + name + '\'' +
                ", domain='" + domain + '\'' +
                ", price=" + price +
                ", flag='" + flag + '\'' +
                ", country='" + country + '\'' +
                ", location=" + location +
                ", load=" + load +
                ", features=" + features +
                '}';
    }
}
