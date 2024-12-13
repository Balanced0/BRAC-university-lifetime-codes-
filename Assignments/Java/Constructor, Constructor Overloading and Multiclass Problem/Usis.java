public class Usis{
    public int totalAdvisee;
    public Student stuArr[] = new Student[5];
    int index = 0;
    public Usis(){
        System.out.println("Usis is ready to use!");
    }
    public void login(Student s){
        if(s.email != null && s.password != null){
            s.status = true;
        }
        if(s.status == false){
            System.out.println("Email and password need to be set.");
        }
        else{
            System.out.println("Login successful");
        }
    }
    public void advising(Student s){
        if(s.email != null && s.password != null){
            s.status = true;
        }
        if(s.status == false){
            System.out.println("Please login to advise courses!");
        }
        else{
            if(s.courses[0] == null){
                System.out.println("You haven't selected any courses.");
            }
        }
    }
    public void advising(Student s, String c0, String c1, String c2, String c3){
        System.out.println("You need special approval to take more than 3 courses.");
    }
    public void advising(Student s, String c0, String c1, String c2){
        if(s.status == true){
            if(index < 5){
                totalAdvisee++;
                stuArr[index] = s;
                s.courses[0] = c0;
                s.courses[1] = c1;
                s.courses[2] = c2;
                System.out.println("Advising successful!");
                index++;
            }
        }
    }
    public void allAdviseeInfo(){
        System.out.println("Total Advisee: " + totalAdvisee);
        for(int i = 0; i < index; i++){
            System.out.println("Name: " + stuArr[i].name + " ID: " + stuArr[i].id);
            System.out.println("Department: " + stuArr[i].dep);
            System.out.println("Advised Courses:");
            System.out.println(stuArr[i].courses[0] + " " + stuArr[i].courses[1] + " " + stuArr[i].courses[2]);
            System.out.println("==============");
        }
    }
}