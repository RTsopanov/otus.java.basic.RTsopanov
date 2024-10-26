package web_server.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.smartcardio.ATR;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileRead {

    private static final Logger logger = LogManager.getLogger(FileRead.class.getName());


    public byte[] read(String fileName){
        byte[] str = new byte[8192];
        try {
             str = Files.readAllBytes(Paths.get("static/" + fileName));
        } catch (IOException e) {

            logger.error("Файл не найден", e);
        }
        return str;
    }






}
