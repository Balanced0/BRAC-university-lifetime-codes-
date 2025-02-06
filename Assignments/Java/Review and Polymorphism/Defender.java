public class Defender extends Football{
    public int tackles;
    public int interceptions;
    public Defender(String name, int age, int stamina, int tackles, int interceptions){
        super(name, age, stamina);
        this.tackles = tackles;
        this.interceptions = interceptions;
    }
    public void display(){
        super.display();
        System.out.println("Tackles: " + tackles);
        System.out.println("Interceptions: " + interceptions);
    }
    public void calculatePerformance(){
        System.out.println("Performance: " + (interceptions/(double)tackles));
    }
}