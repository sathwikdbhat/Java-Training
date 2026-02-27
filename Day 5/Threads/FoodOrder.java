public class FoodOrder extends Thread {
    String task;
    FoodOrder(String task) {
        this.task=task;
    }
    public void run(){
        System.out.println(task+" started");
    }
    public static void main(String[] args) {
        FoodOrder cook=new FoodOrder("Cooking");
        FoodOrder pack=new FoodOrder("Packing");
        FoodOrder delivery=new FoodOrder("Assigning Delivery Agent");
        cook.start();
        pack.start();
        delivery.start();
    }
}


/*
➡️Points to Remember
Extend Thread
Override run()
Use start()
It is less flexible because of inheritance limitation.
*/