public class Triangle{
    public int a;
    public int b;
    public int c;
    public int s;
    public void updateSides(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void triangleDetails(){
        System.out.println("Three sides of the triangle are: " + a + ", " + b + ", " + c);
        s = a + b + c;
        System.out.println("Perimeter: " + s);
    }
    public String printTriangleType(){
        if(a == b && b == c){
            return "This is an Equilateral Triangle.";
        }
        else if(a != b && b != c && c != a){
            return "This is a Scalene Triangle.";
        }
        else{
            return "This is an Isosceles Triangle.";
        }
    }
    public void compareTrinagles(Triangle object){
        if(this == object){
            System.out.println("These two triangle objects have the same address.");
        }
        else{
            if(a == object.a && b == object.b && c == object.c){
                System.out.println("Addresses are different but the sides of the triangles are equal.");
            }
            else{
                if(s != object.s){
                    System.out.println("Addresses, length of the sides and perimeter all are different.");
                }
                else{
                    System.out.println("Only the perimeter of both triangles is equal.");
                }
            }
        }
    }
}