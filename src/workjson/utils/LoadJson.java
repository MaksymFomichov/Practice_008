package workjson.utils;


import com.alibaba.fastjson.JSON;
import workjson.task_1.Lines;
import workjson.task_2.AllStores;
import workjson.task_3.LoadData;

import java.io.IOException;

public class LoadJson {

    public static void load_1(String pathToJsonFile) {
        String json = null;
        try {
            json = FileUtils.readFromFile(pathToJsonFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Lines list = JSON.parseObject(json, Lines.class);
        list.show();
    }

    public static void load_2(String pathToJsonFile) {
        String json = null;
        try {
            json = FileUtils.readFromFile(pathToJsonFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        AllStores aSuper = JSON.parseObject(json, AllStores.class);
        aSuper.show();
    }

    public static void load_3(String pathToJsonFile) {
        String json = null;
        try {
            json = FileUtils.readFromFile(pathToJsonFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        LoadData loadData = JSON.parseObject(json, LoadData.class);
        loadData.show();
    }


}
