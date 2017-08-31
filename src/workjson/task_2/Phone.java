package workjson.task_2;

public class Phone extends Product{
    private String description;
    private int guaranteeDuration;

    public Phone(String name, String price, String description, int guaranteeDuration) {
        super(name, price);
        this.description = description;
        this.guaranteeDuration = guaranteeDuration;
    }

    public void show(){
        super.show();
        System.out.println("описание " + description);
        System.out.println("гарантия " + guaranteeDuration);
    }

}
