public class Student{
    public int id;
    public double cgpa;
    public String course[];
    public int index = 0;
    public Student(int id){
        this.id = id;
        this.course = new String[4];
        System.out.println("A student with ID " + id + " has been created.");
    }
    public Student(int id, double cgpa){
        this.id = id;
        this.cgpa = cgpa;
        this.course = new String[4];
        System.out.println("A student with ID " + id + " and cgpa " + cgpa + " has been created.");
    }
    public void addCourse(String course){
        if(cgpa == 0){
            System.out.println("Failed to add " + course);
            System.out.println("Set CG first");
        }
        int maxCourses;
        if(cgpa < 3.0){
            maxCourses = 3;
        }
        else{
            maxCourses = 4;
        }
        if(index < maxCourses){
            this.course[index] = course;
            index++;
        }
        else{
            System.out.println("Failed to add " + course);
            if(cgpa < 3.0){
                System.out.println(" CG is low. Can't add more than 3 courses.");
            }
            else{
                System.out.println("Maximum 4 courses allowed.");
            }
        }
    }
    public void addCourse(String course[]){
        for(int i = 0 ; i < course.length; i++){
            addCourse(course[i]);
        }
    }
    public void storeID(int id){
        this.id = id;
    }
    public void storeCG(double cg){
        this.cgpa = cg;
    }
    public void removeAllCourse(){
        for(int i = 0; i < course.length; i++){
            course[i] = null;
        }
        index = 0;
    }
    public void showAdvisee(){
        System.out.println("Student ID: " + id + ", CGPA: " + cgpa);
        if(index == 0){
            System.out.println("No courses added.");
            
        }
        else{
            System.out.println("Added courses are:");
            for(int i = 0; i < index; i++){
                System.out.print(course[i] + " ");
            }
            System.out.println();
        }
    }
}