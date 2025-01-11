public class Manager extends Employee{
    public int bonus;
    public double finalSalary;
    public Manager(String name, double baseSalary, int hoursWorked, int bonus){
        super(name, baseSalary, hoursWorked);
        this.bonus = bonus;
    }
    public void calculateSalary(){
        if(getHoursWorked() > 40){
            finalSalary = getBaseSalary() + (getBaseSalary() * (bonus/100.0));
        }
    }
    public void requestIncrement(int increment){
        double temp = getBaseSalary();
        if(getHoursWorked() > 100){
            temp = temp + increment;
            setBaseSalary(temp);
            System.out.println("$" + increment + " Increment approved.");
        }
        else{
            if(getHoursWorked() > 80){
                temp = temp + (increment/2);
                setBaseSalary(temp);
                System.out.println("$" + (increment/2) + " Increment approved.");
            }
            else{
                System.out.println("Increment denied.");
            }
        }
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bonus: " + bonus + ".0%");
        System.out.println("Final Salary: $" + finalSalary);
    }
}