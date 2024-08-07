package web_server.processors;

import web_server.HttpRequest;
import web_server.app.FileRead;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class readFileProcessor implements RequestProcessor {
    private FileRead file;

    public readFileProcessor(FileRead file) {
        this.file = file;
    }

    @Override
    public void execute(HttpRequest request, OutputStream out) throws IOException {
        file.read(request.getFileName());
        String response = "" +
                "HTTP/1.1 200 OK\r\n" +
                "Content-Type: text/html\r\n" +
                "\r\n" +
                "<html><body><h1>" + file.read(request.getFileName()) + "</h1></body></html>";
        out.write(response.getBytes(StandardCharsets.UTF_8));
    }

}
