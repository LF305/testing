public class Cat {
    String catName;
    public Cat(String catName){
        this.catName = catName;
    }
    public void scratch(){
        System.out.println(catName+" scratches");
    }
    public void purr(){
        System.out.println(catName + " purrs");
    }
    public void bite(){
        System.out.println(catName+" bites");
    }
    public void meow(){
        System.out.println(catName+" meows");
    }
}