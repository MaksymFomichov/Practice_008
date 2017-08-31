package workjson.task_2;

public class AllStores {
    private Store<Phone> techStore;
    private Store<Fruit> fruitStore;
    private Store<Animal> animalStore;

    public AllStores(Store<Phone> techStore, Store<Fruit> fruitStore, Store<Animal> animalStore) {
        this.techStore = techStore;
        this.fruitStore = fruitStore;
        this.animalStore = animalStore;
    }

    public void show(){
        techStore.show();
        fruitStore.show();
        fruitStore.show();
    }
}
