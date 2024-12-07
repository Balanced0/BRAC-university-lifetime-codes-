public class Shape{
    public String shape;
    public double r;
    public double h;
    public double b;
    public void setParameters(String shape, int r){
        this.shape = shape;
        this.r = r;
    }
    public void setParameters(String shape, double h, double b){
        this.shape = shape;
        this.h = h;
        this.b = b;
    }
    public String details(){
        double a = 0;
        if(this.shape.equals("Circle")){
            a = 3.14d * this.r * this.r;
        }
        else if(this.shape.equals("Triangle")){
            a = 0.5d * this.b * this.h;
        }
        else if(this.shape.equals("Rectangle")){
            a = this.b * this.h;
        }
        return "Shape Name: " + this.shape + "\nArea: " + a;
    }
}