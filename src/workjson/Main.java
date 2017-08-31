package workjson;

import workjson.utils.LoadJson;

public class Main {

    public static void main(String[] args) {
        LoadJson.load_1("files/json_1.txt");

        LoadJson.load_2("files/json_2.txt");

        LoadJson.load_3("files/json_3_1.txt");
        LoadJson.load_3("files/json_3_2.txt");
        LoadJson.load_3("files/json_3_3.txt");
        LoadJson.load_3("files/json_3_4.txt");
    }
}
