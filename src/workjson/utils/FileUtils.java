package workjson.utils;

import java.io.*;
import java.util.Scanner;

public class FileUtils {

    private FileUtils() {
    }

    public static void writeToFile(String json, String path) throws IOException {
        System.out.println("\nФайл сохранён: " + path);
        FileWriter writer = new FileWriter(path);
        writer.write(json);
        writer.flush();
        writer.close();
    }

    public static String readFromFile(String path) throws IOException {
        System.out.println("\nФайл загружен: " + path);
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String json = new Scanner(new File(path)).useDelimiter("\\Z").next();
        return json;
    }
}
