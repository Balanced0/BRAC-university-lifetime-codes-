public class UniversityTester{
    public static void main(String[] args){
        // a
        University uni1 = new University();
        University uni2 = new University();
        System.out.println(uni1);
        System.out.println(uni2);
        System.out.println(uni1.name);
        System.out.println(uni1.country);
        System.out.println(uni2.name);
        System.out.println(uni2.country);
        //No the location of the objects are not the same
        
        //b
        uni1.name = "Imperial College London";
        uni1.country = "England";
        uni2.name = "Brac University";
        uni2.country = "Bangladesh";
        System.out.println(uni1.name);
        System.out.println(uni1.country);
        System.out.println(uni2.name);
        System.out.println(uni2.country);
    }
}