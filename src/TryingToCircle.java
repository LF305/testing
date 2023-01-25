public class TryingToCircle { 
     public static void main(String[] args) throws Exception {
        String colour;
        double radius;
        Circle one = new Circle("purple", 5);
        Circle two = new Circle("yellow", 2);
        one.getCircumference();
        two.getDiameter();
        two.getRadius();
        one.getcolour();
        one.setColour("pink");
        System.out.println(one.getcolour());
    }
}   