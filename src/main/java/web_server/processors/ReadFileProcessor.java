package web_server.processors;

import web_server.HttpRequest;
import web_server.app.FileRead;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class ReadFileProcessor implements RequestProcessor {
    private FileRead file;

    public ReadFileProcessor(FileRead file) {
        this.file = file;
    }

    @Override
    public void execute(HttpRequest request, OutputStream out) throws IOException {
       byte[] str = file.read(request.getFileName());

//        String response =  "" +
//                "HTTP/1.1 200 OK\r\n" +
//                "Content-Type: txt\r\n" +
//                "\r\n" +
//                "<html><body><h1>" +  "</h1></body></html>";
//        out.write(response.getBytes(StandardCharsets.UTF_8));


String contetntDisposition = "Content-Disposition: attachment; filename=\"" + request.getFileName() + "\"";
        String response = "HTTP/1.1 200 OK\r\n" +
                "Content-Length: " + str.length + "\r\n" +
                "Cache-Control: no-cache, no-store, must-revalidate\r\n" +
                contetntDisposition + "\r\n";
         out.write(response.getBytes(StandardCharsets.UTF_8));
        out.write(str);
    }
}

