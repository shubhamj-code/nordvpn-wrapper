package com.shubhamj.nordvpn.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Categories {
    @JsonProperty()
    private String name;

    @Override
    public String toString() {
        return "Categories{" +
                "name='" + name + '\'' +
                '}';
    }
}
