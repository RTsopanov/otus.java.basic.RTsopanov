package web_server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class HttpRequest {
    private String rawRequest;
    private String uri;
    private web_server.HttpMethod method;
    private Long id;
    private Map<String, String> parameters;
    private Map<String, String> heading;
    private String body;
    private String title;
    private BigDecimal price;
    private String fileName;
    private int startIndex;
    private int endIndex;

    private static final Logger logger = LogManager.getLogger(HttpRequest.class.getName());

    public String getTitle() {
        return title;
    }

    public String getFileName() {
        return fileName;
    }

    public BigDecimal getPrice() {
        return price;
    }


    public Long getId() {
        return id;
    }

    public String getRoutingKey() {
        return method + " " + uri;
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
        startIndex = rawRequest.indexOf(' ');
        endIndex = rawRequest.indexOf(' ', startIndex + 1);
        this.uri = rawRequest.substring(startIndex + 1, endIndex);
        this.method = HttpMethod.valueOf(rawRequest.substring(0, startIndex));
        this.parameters = new HashMap<>();


        if (method == HttpMethod.GET && uri.contains("=")) {

//      TODO удалить коммент 76-79
//            String[] elements = uri.split("[=]");
//            this.uri = elements[0];
//            this.id = Long.parseLong(elements[1]);
//            this.parameters.put(elements[0], elements[1]);


            this.id = Long.parseLong(uri.substring(uri.indexOf("=") + 1, uri.length()));
            this.uri = uri.substring(uri.indexOf("\\") + 1, uri.indexOf("=", startIndex + 1));
            this.parameters.put(uri, id.toString());


        } else if (uri.contains("?")) {

//  TODO
//            String[] elements = uri.split("[?]");
//            this.uri = elements[0];
//            String[] keysValues = elements[1].split("&");
//            for (String o : keysValues) {
//                String[] keyValue = o.split("=");
//                this.parameters.put(keyValue[0], keyValue[1]);
//            }


            this.id = Long.parseLong(uri.substring(uri.indexOf("=") + 1, uri.length()));
            this.parameters.put(uri.substring(uri.indexOf("?") + 1, uri.indexOf("=")), id.toString());
            this.uri = uri.substring(0, uri.indexOf("?"));

        }


        if (method == HttpMethod.GET && uri.contains(".txt")) {
            this.uri = ".txt";
            this.fileName = rawRequest.substring(rawRequest.indexOf(" /") + 2, rawRequest.indexOf(" ", rawRequest.indexOf(" /") + 1));
        }


        if (method == HttpMethod.POST) {
            this.body = rawRequest.substring(
                    rawRequest.indexOf("\r\n\r\n") + 4
            );
            this.title = body.substring(body.indexOf("\":") + 4, body.indexOf("\","));
            this.price = BigDecimal.valueOf(Long.parseLong(body.substring(body.indexOf("price") + 7, body.indexOf("}") - 2).strip()));
        }


        if (method == HttpMethod.DELETE) {
            this.id = Long.valueOf(rawRequest.substring(rawRequest.indexOf("=") + 1, rawRequest.indexOf(" H")));
            this.body = rawRequest.substring(rawRequest.indexOf("/") + 1, rawRequest.indexOf(" H"));


            this.heading = new HashMap<>();
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


        if (method == HttpMethod.PUT) {
            this.body = rawRequest.replaceAll(" ", "");
            this.id = Long.valueOf(body.substring(body.indexOf("id") + 4, body.indexOf(",\r\n")));
            this.title = body.substring(body.indexOf("title") + 8, body.indexOf("\"", body.indexOf("title") + 8));
            this.price = BigDecimal.valueOf(Long.parseLong(body.substring(body.indexOf("price") + 7, body.indexOf("\r\n", body.indexOf("price") + 7))));
        }


    }



    public void printInfo() {
        logger.info("uri: " + uri);
        logger.info("method: " + method);
        logger.info("body: " + body);
        logger.debug(rawRequest);

    }
}
