package web_server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class HttpRequest {
    private String rawRequest;
    private String uri;
    private HttpMethod method;
    private Long id;
    private Map<String, String> parameters;
    private Map<String, String> heading;
    private String body;
    private String title;
    private BigDecimal price;
    private static final Logger logger = LogManager.getLogger(HttpRequest.class.getName());

    public String getTitle() {
        return title;
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

         //TODO Продолжить с условия
        if(method == HttpMethod.GET && uri.contains("=")){
            String[] elements = uri.split("[=]");
            this.uri = elements[0];
            this.id = Long.parseLong(elements[1]);
            this.parameters.put(elements[0], elements[1]);
        }




        if (method == HttpMethod.POST) {
            this.body = rawRequest.substring(
                    rawRequest.indexOf("\r\n\r\n") + 4
            );
            int indexOne = body.indexOf("\":");
            int indexTwo = body.indexOf("\",");
            this.title = body.substring(indexOne + 3, indexTwo);
            int indexThree = body.indexOf("price") + 7 ;
            int indexFour = body.indexOf("}") -2 ;
            this.price =  BigDecimal.valueOf(Long.parseLong(body.substring(indexThree , indexFour).strip()));
            //  TODO Заменить sout на logger
            System.out.println(title + " " + price);
        }



        if (method == HttpMethod.DELETE) {
            int s = rawRequest.indexOf("=");
            int t = rawRequest.indexOf(" H");
            this.id = Long.valueOf(rawRequest.substring(s + 1, t));


            String bod = rawRequest.substring(rawRequest.indexOf("\"id\": ") + 6);
            String[] bodArr = bod.split("\r\n");
            this.body = bodArr[0];
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


        if(method == HttpMethod.PUT){
            this.body = rawRequest.substring(
                    rawRequest.indexOf("\r\n\r\n") + 4);
            System.out.println(body);
            int s = body.indexOf("id") + 5;
            int t = body.indexOf(",\r\n");
            this.id = Long.valueOf(body.substring(s, t));

            int s2 = body.indexOf("title") + 8;
            int t2 = body.indexOf("\"", s2) ;
            this.title = body.substring(s2, t2 );




            int s3 = body.indexOf("price") + 7;
            int t3 = body.indexOf("\r\n", s3) ;
            this.price = BigDecimal.valueOf(Long.parseLong(body.substring(s3, t3)));
            // TODO Удалить sout
            System.out.println("id " + id + " title " +  title + " price " + price);

        }


    }


    public boolean containsParameter(String key) {
        return parameters.containsKey(key);
    }

    public String getParameter(String key) {
        return parameters.get(key);
    }

    public void printInfo() {
        logger.info("uri: " + uri);
        logger.info("method: " + method);
        logger.info("body: " + body);
            logger.debug(rawRequest);

    }
}
