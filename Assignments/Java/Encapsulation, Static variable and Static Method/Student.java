public class Student{
    public static int total_student = 0;
    public static int cse_student = 0;
    public static int other_dep_student = 0;
    public static int id = 1;
    public String name;
    public double cgpa;
    public String dep = "CSE";
    public Student(String name, double cgpa){
        this.name = name;
        this.cgpa = cgpa;
        Student.total_student++;
        Student.cse_student++;
    }
    public Student(String name, double cgpa, String dep){
        this.name = name;
        this.cgpa = cgpa;
        this.dep = dep;
        Student.total_student++;
        Student.other_dep_student++;
    }
    public void individualDetail(){
        System.out.println("ID: " + Student.id);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Department: " + dep);
        Student.id++;
    }
    public static void printDetails(){
        System.out.println("Total Student(s): " + Student.total_student);
        System.out.println("CSE Student(s): " + Student.cse_student);
        System.out.println("Other Department Student(s): " + Student.other_dep_student);
    }
}