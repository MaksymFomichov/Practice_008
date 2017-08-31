package workjson.task_2;

public class Fruit extends Product {
    private int weight;

    public Fruit(String name, String price, int weight) {
        super(name, price);
        this.weight = weight;
    }

    public void show(){
        super.show();
        System.out.println("вес " + weight);
    }
}
