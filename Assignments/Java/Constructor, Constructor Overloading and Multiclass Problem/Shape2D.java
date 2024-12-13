public class Shape2D{
    public int length;
    public int breadth;
    public int height;
    public int base;
    public String shape;
    public int a;
    public int b;
    public int c;
    public Shape2D(){
        this.shape = "sq";
        this.length = 5;
        System.out.println("A Square has been created with length: " + this.length);
    }
    public void area(){
        double area = 0.0;
        if(this.shape.equals("sq")){
            area = this.length * this.length;
            System.out.println("The area of the square is: " + area);
        }
        else if(this.shape.equals("rec")){
            area = this.length * this.breadth;
            System.out.println("The area of the Rectangle is: " + area);
        }
        else if(this.shape.equals("tri")){
            area = 0.5 * this.height * this.base;
            System.out.println("The area of the Triangle is: " + area);
        }
        else if(this.shape.equals("rec1")){
            double s = (this.a + this.b + this.c)/2;
            area = Math.sqrt(s*(s - this.a)*(s - this.b)*(s - this.c));
            System.out.printf("The area of the Triangle is: %.2f\n", area);
        }
    }
    public Shape2D(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
        this.shape = "rec";
        System.out.println("A Rectangle has been created with length: " + length + " and breadth: " + breadth);
    }
    public Shape2D(int height, int base, String shape){
        this.height = height;
        this.base = base;
        this.shape = "tri";
        System.out.println("A " + shape + " has been created with height: " + height + " and base: " + base);
    }
    public Shape2D(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.shape = "rec1";
        System.out.println("A Triangle has been created with the following sides: " + a + ", " + b + ", " + c);
    }
}