package web_server.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileRead {
    private String str;
    private static final Logger logger = LogManager.getLogger(FileRead.class.getName());

    public String read(String fileName){
            try(BufferedInputStream buf = new BufferedInputStream(new FileInputStream("static/" + fileName))){
          str = new String(buf.readAllBytes(), StandardCharsets.UTF_8);

        }catch(IOException e){
            logger.error(e);
        }
        return str;
    }
}
