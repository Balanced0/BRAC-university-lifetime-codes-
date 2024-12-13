public class Teacher{
    public String name;
    public String initial;
    public String maxCourse[] = new String[3];
    public int index = 0;
    public Teacher(String name, String initial){
        this.name = name;
        this.initial = initial;
        System.out.println("A new teacher has been created");
    }
    public void addCourse(Course object){
        maxCourse[index] = object.course;
        index++;
    }
    public void printDetail(){
        System.out.println("Name: " + name);
        System.out.println("Initial: " + initial);
        System.out.println("List of courses:");
        for(int i = 0; i < index; i++){
            System.out.println(maxCourse[i]);
        }
    }
}