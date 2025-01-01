public class Cargo{
    public static double cargo_capacity = 10.0;
    public static int count = 0;
    public String name;
    public double weight;
    public int id;
    public boolean load = false;
    public Cargo(String name, double weight){
        this.name = name;
        this.weight = weight;
        Cargo.count++;
        this.id = Cargo.count;
        this.load = false;
    }
    public void details(){
        System.out.print("Cargo ID: " + id + ", Contents: " + name + ", Weight: " + weight + ", Loaded: " + load);
        System.out.println();
    }
    public static double capacity(){
        return cargo_capacity;
    }
    public void load(){
        double a = Cargo.cargo_capacity - weight;
        if(a < 0){
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
        else{
            Cargo.cargo_capacity = a;
            System.out.println("Cargo " + id + " loaded for transport.");
            load = true;
        }
    }
    public void unload(){
        double a = Cargo.cargo_capacity + weight;
        Cargo.cargo_capacity = a;
        System.out.println("Cargo " + id + " unloaded.");
        load = false;
    }
}