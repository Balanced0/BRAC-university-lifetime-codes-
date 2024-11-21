public class Course{
    public String courseName;
    public String courseCode;
    public int courseCredit;
    public void updateDetails(String name, String code, int credit){
        this.courseName = name;
        this.courseCode = code;
        this.courseCredit = credit;
    }
    public void displayCourse(){
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Course Code: " + this.courseCode);
        System.out.println("Course Credit: " + this.courseCredit);
    }
}