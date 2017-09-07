package workjson.task_3;

import java.util.Collection;
import java.util.HashMap;

public class LoadData {
    private String title;
    private HashMap<String, String> data;

    public LoadData(String title, HashMap<String, String> data) {
        this.title = title;
        this.data = data;
    }

    public void show() {
        System.out.println(title);
        for (String key : data.keySet()) {
            System.out.println(key + " " + data.get(key));
        }
    }
}
