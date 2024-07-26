package oop.hw15_2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;


public class HttpRequest {
    private String rawRequest;
    private String uri;
    private HttpMethod method;
    private Map<String, String> parameters;
    private LinkedHashMap<String, String> heading;
    private String body;
    Logger logger = LogManager.getLogger(HttpRequest.class.getName());

    public String getRoutingKey() {
        return method + " " + uri;
    }

    public String getUri() {
        return uri;
    }

    public String getBody() {
        return body;
    }

    public HttpRequest(String rawRequest) {
        this.rawRequest = rawRequest;
        this.parse();
    }


    public HttpRequest() {
    }


    private void parse() {
        int startIndex = rawRequest.indexOf(' ');
        int endIndex = rawRequest.indexOf(' ', startIndex + 1);
        this.uri = rawRequest.substring(startIndex + 1, endIndex);
        this.method = HttpMethod.valueOf(rawRequest.substring(0, startIndex));
        this.parameters = new HashMap<>();
        if (uri.contains("?")) {
            String[] elements = uri.split("[?]");
            this.uri = elements[0];
            String[] keysValues = elements[1].split("&");
            for (String o : keysValues) {
                String[] keyValue = o.split("=");
                this.parameters.put(keyValue[0], keyValue[1]);
            }
        }
        if (method == HttpMethod.POST) {
            this.body = rawRequest.substring(
                    rawRequest.indexOf("\r\n\r\n") + 4
            );
        }
        if (method == HttpMethod.DELETE) {
            String bod = rawRequest.substring(rawRequest.indexOf("\"id\": ") + 6);
            String[] bodArr = bod.split("\r\n");
            this.body = bodArr[0];
        }


        this.heading = new LinkedHashMap<>();
        int sim = rawRequest.indexOf("\r\n");
        int sim2 = rawRequest.indexOf(": ", sim);
        int sim3 = rawRequest.indexOf("\r\n", sim2);
        String str = rawRequest.substring(sim + 1, sim2);
        String str2 = rawRequest.substring(sim2 + 2, sim3);
        heading.put(str, str2);
        rawRequest = rawRequest.substring(sim3 + 1, rawRequest.length());

        for (int i = 0; i < rawRequest.length(); i++) {
            sim = rawRequest.indexOf(0);
            sim2 = rawRequest.indexOf(": ", sim);
            sim3 = rawRequest.indexOf("\r\n", sim2);
            str = rawRequest.substring(sim + 1, sim2);
            str2 = rawRequest.substring(sim2 + 2, sim3);
            heading.put(str, str2);
            rawRequest = rawRequest.substring(sim3 + 1, rawRequest.length());
        }
        logger.info("heading: " + heading);

    }


    public boolean containsParameter(String key) {
        return parameters.containsKey(key);
    }

    public String getParameter(String key) {
        return parameters.get(key);
    }

    public void printInfo(boolean showRawRequest) {
        System.out.println("uri: " + uri);
        System.out.println("method: " + method);
        System.out.println("body: " + body);
        if (showRawRequest) {
            logger.info(rawRequest);
        }
    }
}
