public class Circle {
    String colour;
    double radius;
    public Circle(String colour, double radius){
       this.radius = radius;
       this.colour = colour;
    }
    public double getRadius(){
        return radius;
    }
    public double getDiameter(){
        return 2 * radius;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public String getcolour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
}