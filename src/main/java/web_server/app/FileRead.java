package web_server.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileRead {
//    private String str;
    private static final Logger logger = LogManager.getLogger(FileRead.class.getName());

    public byte[] read(String fileName){
        byte[] strrr = new byte[2048];
        try {
             strrr = Files.readAllBytes(Paths.get("static/" + fileName));
        } catch (IOException e) {
            logger.error("Файл не найден", e);
        }
        System.out.println(Arrays.toString(new String[]{Arrays.toString(strrr)}));
        return strrr;
    }






}
