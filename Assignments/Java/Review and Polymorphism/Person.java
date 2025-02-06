public class Person{
    public String name;
    public int age;
    public String type = "General Citizen";
    public int count = 0;
    public String vaccine;
    public int second_dose;
    
    
    public Person(String name, int age, String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }
    
    
    public Person(String name, int age){
        this(name, age, "General Citizen");
    }
    
    
    public void pushVaccine(Vaccine v){
//        if(!type.equals("Student")){
//            if(age < 25){
//                System.out.println("Sorry " + name + ", Minimum age for taking vaccine is 25 years now.");
//            }
//            else{
//                this.vaccine = v.get_vac_name();
//                this.second_dose = v.get_sec_dose();
//                if(count <= 2){
//                    count++;
//                    System.out.println(count + "st dose done for " + name);
//                }
//                else{
//                    System.out.println("Sorry " + name +", you already received both doses.");
//                }
//            }
//        }
//        else{
//            this.vaccine = v.get_vac_name();
//            this.second_dose = v.get_sec_dose();
//            if(count <= 2){
//                count++;
//                System.out.println(count + "st dose done for " + name);
//            }
//            else{
//                System.out.println("Sorry " + name +", you already received both doses.");
//            }
//        }
        if (type.equals("Student")) {
            this.vaccine = v.get_vac_name();
            this.second_dose = v.get_sec_dose();
            if (count == 0) {
                count++;
                System.out.println(count + "st dose done for " + name);
            } else if (count == 1) {
                count++;
                System.out.println(count + "nd dose done for " + name);
            } else {
                System.out.println("Sorry " + name + ", you already received both doses.");
            }
        } else {
            if (age < 25) {
                System.out.println("Sorry " + name + ", Minimum age for taking vaccines is 25 years now.");
            } else {
                this.vaccine = v.get_vac_name();
                this.second_dose = v.get_sec_dose();
                if (count == 0) {
                    count++;
                    System.out.println(count + "st dose done for " + name);
                } else if (count == 1) {
                    count++;
                    System.out.println(count + "nd dose done for " + name);
                } else {
                    System.out.println("Sorry " + name + ", you already received both doses.");
                }
            }
        }
    }
    public void pushVaccine(Vaccine v, String dose){
        if(!v.get_vac_name().equals(vaccine)){
            System.out.println("Sorry " + name + " , you can't take 2 different vaccines");
            return;
        }
        
        if (dose.equals("2nd Dose")) {
            if (count == 0) {
                System.out.println("Sorry " + name + ", invalid dose request.");
            } else if (count == 1) {
                count++;
                System.out.println("2nd dose done for " + name);
            } else {
                System.out.println("Sorry " + name + ", you already received both doses.");
            }
        }
    }
    public void showDetail(){
        System.out.println("Name: " + name + "Age: " + age + " Type: " + type);
        System.out.println("Vaccine name: " + vaccine);
        if(count == 1){
            System.out.println("1st dose: Given");
            System.out.println("Please come after " + second_dose + " days");
        }
        else if(count == 2){
            System.out.println("1st dose: Given");
            System.out.println("1st dose: Given");
        }
    }
}