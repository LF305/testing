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



 /*Create a Cat() class that can meow(), scratch(), purr(), and bite() (they will print 
    “[Cat’s name here] meows”, “[Cat’s name here] scratches”, “[Cat’s name here] purrs”, 
    and “[Cat’s name here] bites” to the console). Make sure the class has a constructor 
    that takes the name of the cat. Demonstrate the usage of all of these methods in a different */
