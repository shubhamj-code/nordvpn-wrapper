package com.shubhamj.nordvpn.pojo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Features {

    @JsonProperty("ikev2")
    private boolean isIkev2;

    @JsonProperty("openvpn_udp")
    private boolean isOpenvpnUdp;

    @JsonProperty("openvpn_tcp")
    private boolean isOpenvpnTcp;

    @JsonProperty("socks")
    private boolean isSocks;

    @JsonProperty("proxy")
    private boolean isProxy;

    @JsonProperty("pptp")
    private boolean isPptp;

    @JsonProperty("l2tp")
    private boolean isL2tp;

    @JsonProperty("openvpn_xor_udp")
    private boolean isOpenvpnXorUdp;

    @JsonProperty("openvpn_xor_tcp")
    private boolean isOpenvpnXorTcp;

    @JsonProperty("proxy_cybersec")
    private boolean isProxyCyberSec;

    @JsonProperty("proxy_ssl")
    private boolean isProxySsl;

    @JsonProperty("proxy_ssl_cybersec")
    private boolean isProxySslCyberSec;

    @JsonProperty("ikev2_v6")
    private boolean isIkev2V6;

    @JsonProperty("openvpn_udp_v6")
    private boolean isOpenvpnUdpV6;

    @JsonProperty("openvpn_tcp_v6")
    private boolean isOpenvpnTcpV6;

    @JsonProperty("wireguard_udp")
    private boolean isWireguardUdp;

    @JsonProperty("openvpn_udp_tls_crypt")
    private boolean isOpenvpnUdpTlsCrypt;

    @JsonProperty("openvpn_tcp_tls_crypt")
    private boolean isOpenvpnTcpTlsCrypt;

    @JsonProperty("openvpn_dedicated_udp")
    private boolean isOpenvpnDedicatedUdp;

    @JsonProperty("openvpn_dedicated_tcp")
    private boolean isOpenvpnDedicatedTcp;

    @JsonProperty("skylark")
    private boolean isSkylark;

    public boolean isIkev2() {
        return isIkev2;
    }

    public boolean isOpenvpnUdp() {
        return isOpenvpnUdp;
    }

    public boolean isOpenvpnTcp() {
        return isOpenvpnTcp;
    }

    public boolean isSocks() {
        return isSocks;
    }

    public boolean isProxy() {
        return isProxy;
    }

    public boolean isPptp() {
        return isPptp;
    }

    public boolean isL2tp() {
        return isL2tp;
    }

    public boolean isOpenvpnXorUdp() {
        return isOpenvpnXorUdp;
    }

    public boolean isOpenvpnXorTcp() {
        return isOpenvpnXorTcp;
    }

    public boolean isProxyCyberSec() {
        return isProxyCyberSec;
    }

    public boolean isProxySsl() {
        return isProxySsl;
    }

    public boolean isProxySslCyberSec() {
        return isProxySslCyberSec;
    }

    public boolean isIkev2V6() {
        return isIkev2V6;
    }

    public boolean isOpenvpnUdpV6() {
        return isOpenvpnUdpV6;
    }

    public boolean isOpenvpnTcpV6() {
        return isOpenvpnTcpV6;
    }

    public boolean isWireguardUdp() {
        return isWireguardUdp;
    }

    public boolean isOpenvpnUdpTlsCrypt() {
        return isOpenvpnUdpTlsCrypt;
    }

    public boolean isOpenvpnTcpTlsCrypt() {
        return isOpenvpnTcpTlsCrypt;
    }

    public boolean isOpenvpnDedicatedUdp() {
        return isOpenvpnDedicatedUdp;
    }

    public boolean isOpenvpnDedicatedTcp() {
        return isOpenvpnDedicatedTcp;
    }

    public boolean isSkylark() {
        return isSkylark;
    }

    public void setIkev2(boolean ikev2) {
        isIkev2 = ikev2;
    }

    public void setOpenvpnUdp(boolean openvpnUdp) {
        isOpenvpnUdp = openvpnUdp;
    }

    public void setOpenvpnTcp(boolean openvpnTcp) {
        isOpenvpnTcp = openvpnTcp;
    }

    public void setSocks(boolean socks) {
        isSocks = socks;
    }

    public void setProxy(boolean proxy) {
        isProxy = proxy;
    }

    public void setPptp(boolean pptp) {
        isPptp = pptp;
    }

    public void setL2tp(boolean l2tp) {
        isL2tp = l2tp;
    }

    public void setOpenvpnXorUdp(boolean openvpnXorUdp) {
        isOpenvpnXorUdp = openvpnXorUdp;
    }

    public void setOpenvpnXorTcp(boolean openvpnXorTcp) {
        isOpenvpnXorTcp = openvpnXorTcp;
    }

    public void setProxyCyberSec(boolean proxyCyberSec) {
        isProxyCyberSec = proxyCyberSec;
    }

    public void setProxySsl(boolean proxySsl) {
        isProxySsl = proxySsl;
    }

    public void setProxySslCyberSec(boolean proxySslCyberSec) {
        isProxySslCyberSec = proxySslCyberSec;
    }

    public void setIkev2V6(boolean ikev2V6) {
        isIkev2V6 = ikev2V6;
    }

    public void setOpenvpnUdpV6(boolean openvpnUdpV6) {
        isOpenvpnUdpV6 = openvpnUdpV6;
    }

    public void setOpenvpnTcpV6(boolean openvpnTcpV6) {
        isOpenvpnTcpV6 = openvpnTcpV6;
    }

    public void setWireguardUdp(boolean wireguardUdp) {
        isWireguardUdp = wireguardUdp;
    }

    public void setOpenvpnUdpTlsCrypt(boolean openvpnUdpTlsCrypt) {
        isOpenvpnUdpTlsCrypt = openvpnUdpTlsCrypt;
    }

    public void setOpenvpnTcpTlsCrypt(boolean openvpnTcpTlsCrypt) {
        isOpenvpnTcpTlsCrypt = openvpnTcpTlsCrypt;
    }

    public void setOpenvpnDedicatedUdp(boolean openvpnDedicatedUdp) {
        isOpenvpnDedicatedUdp = openvpnDedicatedUdp;
    }

    public void setOpenvpnDedicatedTcp(boolean openvpnDedicatedTcp) {
        isOpenvpnDedicatedTcp = openvpnDedicatedTcp;
    }

    public void setSkylark(boolean skylark) {
        isSkylark = skylark;
    }

    public boolean canBeProxy(){
        return this.isProxy || this.isProxyCyberSec || this.isProxySsl || this.isProxySslCyberSec;
    }

    @Override
    public String toString() {
        return "Features{" +
                "isIkev2=" + isIkev2 +
                ", isOpenvpnUdp=" + isOpenvpnUdp +
                ", isOpenvpnTcp=" + isOpenvpnTcp +
                ", isSocks=" + isSocks +
                ", isProxy=" + isProxy +
                ", isPptp=" + isPptp +
                ", isL2tp=" + isL2tp +
                ", isOpenvpnXorUdp=" + isOpenvpnXorUdp +
                ", isOpenvpnXorTcp=" + isOpenvpnXorTcp +
                ", isProxyCyberSec=" + isProxyCyberSec +
                ", isProxySsl=" + isProxySsl +
                ", isProxySslCyberSec=" + isProxySslCyberSec +
                ", isIkev2V6=" + isIkev2V6 +
                ", isOpenvpnUdpV6=" + isOpenvpnUdpV6 +
                ", isOpenvpnTcpV6=" + isOpenvpnTcpV6 +
                ", isWireguardUdp=" + isWireguardUdp +
                ", isOpenvpnUdpTlsCrypt=" + isOpenvpnUdpTlsCrypt +
                ", isOpenvpnTcpTlsCrypt=" + isOpenvpnTcpTlsCrypt +
                ", isOpenvpnDedicatedUdp=" + isOpenvpnDedicatedUdp +
                ", isOpenvpnDedicatedTcp=" + isOpenvpnDedicatedTcp +
                ", isSkylark=" + isSkylark +
                '}';
    }
}
