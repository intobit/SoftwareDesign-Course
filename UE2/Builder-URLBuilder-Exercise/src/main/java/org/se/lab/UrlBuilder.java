package org.se.lab;

import java.util.ArrayList;
import java.util.List;

public class UrlBuilder
{
    private String protocol;
    private int port = -1;
    private String host;
    private String application;
    private final List<String> parameters = new ArrayList<>();

    public UrlBuilder() {}
    public UrlBuilder http() {this.protocol = "http://"; return this;}
    public UrlBuilder https() {this.protocol = "https://"; return this;}
    public UrlBuilder ftp() {this.protocol = "ftp://"; return this;}
    public UrlBuilder host(String host) { this.host = host; return this;}
    public UrlBuilder port(int port) { this.port = port; return this;}
    public UrlBuilder application(String application) { this.application = application; return this;}
    public UrlBuilder parameter(String param1, String param2) {
        this.parameters.add(param1 + "=" + param2); return this;}

    public String build() {
        StringBuilder url = new StringBuilder();

            url.append(protocol).append(host);
            if (port != -1) {
                url.append(":").append(port);
            }
            url.append("/").append(application);
            if(parameters.isEmpty()) {
                url.append("/");
            } else {
                url.append(generateQuery(parameters));
            }
        return url.toString();
    }

    private String generateQuery(List<String> parameters)
    {
        StringBuilder query = new StringBuilder();
        query.append('?');
        for(String p: parameters)
        {
            query.append(p).append('&');
        }
        return query.substring(0, query.length()-1);
    }
}
