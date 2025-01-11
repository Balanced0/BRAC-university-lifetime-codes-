public class Developer extends Employee{
    public String language;
    public double finalSalary;
    public Developer(String name, double baseSalary, int hoursWorked, String language){
        super(name, baseSalary, hoursWorked);
        this.language = language;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Language: " + language);
        System.out.println("Final Salary: $" + finalSalary);
    }
    public void calculateSalary(){
        if(language.equals("Java")){
            double temp = getBaseSalary();
            temp = temp + 700.0;
            finalSalary = temp;;
        }
        else{
            finalSalary = getBaseSalary();
        }
    }
}