package workjson.task_1;

import java.util.List;

public class Lines {
    private List<String> lines;

    public Lines(List<String> lines) {
        this.lines = lines;
    }

    public void show() {
        for (String value : lines) {
            System.out.println(value);
        }
    }
}
