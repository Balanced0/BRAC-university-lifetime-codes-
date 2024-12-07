public class Student{
    public double cgpa = 0.0;
    public int credit = 9;
    public String name = "Not Set";
    public String dep = "CSE";
    public String status = "Not Set";
    public void updateDetails(String name, double cgpa){
        this.name = name;
        this.cgpa = cgpa;
    }
    public void updateDetails(String name, double cgpa, int credit){
        this.name = name;
        this.cgpa = cgpa;
        this.credit = credit;
    }
    public void updateDetails(String name, double cgpa, int credit, String dep){
        this.name = name;
        this.cgpa = cgpa;
        this.credit = credit;
        this.dep = dep;
    }
    public void checkScholarshipEligibility(){
        if(this.credit > 10){
            if(this.cgpa >= 2.5 & this.cgpa < 3.7){
                System.out.println(this.name + " is eligible for Need based scholarship");
                this.status = "Need based scholarship";
            }
            else if(this.cgpa >=3.7){
                System.out.println(this.name + " is eligible for Merit based scholarship");
                this.status = "Merit based scholarship";
            }
            else {
                System.out.println(this.name + " is not eligible for scholarship");
                this.status = "No scholarship";
            }
        }
        else {
            if (this.cgpa >= 3.5 && this.cgpa < 3.7) {
                this.status = "No scholarship";
            } 
            System.out.println(this.name + " is not eligible for scholarship");
            this.status = "No scholarship";
        }
    }
    public void showDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.dep);
        System.out.println("CGPA: " + this.cgpa);
        System.out.println("Credits: " + this.credit);
        if(this.status.equals("Not Set")){
            System.out.println("Scholarship Status: Not Set");
        }
        else if(this.status.equals("Need based scholarship")){
            System.out.println("Scholarship Status: " + this.status);
        }
        else if(this.status.equals("Merit based scholarship")){
            System.out.println("Scholarship Status: " + this.status);
        }
        else if(this.status.equals("No scholarship")){
            System.out.println("Scholarship Status: " + this.status);
        }
    }
    
}