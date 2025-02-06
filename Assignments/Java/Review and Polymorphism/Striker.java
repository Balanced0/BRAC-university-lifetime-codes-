public class Striker extends Football{
    public int goals;
    public int shots_on_target;
    public Striker(String name, int age, int stamina, int goals, int target){
        super(name, age, stamina);
        this.goals = goals;
        this.shots_on_target = target;
    }
    public void display(){
        super.display();
        System.out.println("Goals: " + goals);
        System.out.println("Shots on target: " + shots_on_target);
    }
    public void calculatePerformance(){
        double per = goals/(double)shots_on_target;
        System.out.println("Performance: " + per);
    }
}