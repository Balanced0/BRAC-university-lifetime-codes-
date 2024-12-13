public class BracuStudent{
    public String name;
    public String place;
    public boolean pass = false;
    public BracuStudent(String name, String place){
        this.name = name;
        this.place = place;
    }
    public void showDetails(){
        System.out.println("Student Name: " + name);
        System.out.println("Lives in " + place);
        System.out.println("Have Bus Pass? " + pass);
    }
    
    public void getPass(){
        this.pass = true;
    }
    public void updateHome(String place){
        this.place = place;
    }
}