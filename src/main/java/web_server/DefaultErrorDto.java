package web_server;

import java.time.LocalDateTime;

public class DefaultErrorDto {
    private String code;
    private String message;
    private String date;



    public DefaultErrorDto(String code, String message) {
        this.code = code;
        this.message = message;
        this.date = LocalDateTime.now().toString();
    }
}
