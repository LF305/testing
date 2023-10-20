public class Moves {
    String moveName;
    double power;

    public Moves(String moveName, double power){
        this.power = power;
        this.moveName = moveName;
    }

    public String getMoves(){
        return moveName;
    }
    public double getBasePower(){
        return power;
    }
}
