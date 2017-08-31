package workjson.task_2;

public class Product {
    private String name;
    private String price;

    public Product(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public void show(){
        System.out.println("название " + name);
        System.out.println("цена " + price);
    }
}
