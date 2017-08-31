package workjson.task_2;

import java.util.ArrayList;

public class Store<T extends Product> {
    private String name;
    private String address;
    private ArrayList<T> products;

    public Store(String name, String address, ArrayList<T> products) {
        this.name = name;
        this.address = address;
        this.products = products;
    }

    public void show() {
        System.out.println("название магазина " + name);
        System.out.println("адрес магазина " + address);
        System.out.println("товары:");
        for (T value : products) {
            value.show();
        }
        System.out.println();
    }
}
