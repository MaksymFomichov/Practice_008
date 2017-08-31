package workjson.task_2;

public class Animal extends Product {
    private int age;

    public Animal(String name, String price, int age) {
        super(name, price);
        this.age = age;
    }

    public void show(){
        super.show();
        System.out.println("возраст " + age);
    }
}
