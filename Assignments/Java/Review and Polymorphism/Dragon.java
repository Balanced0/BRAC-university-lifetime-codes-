public class Dragon extends MagicalCreature{
    public int power_level;
    public Dragon(String name, int age, int power){
        super(name, age);
        this.power_level = power;
    }
    public void displayInfo(){
        super.displayInfo();
    }
    public void makeSound(){
        System.out.println(name + "roars with a fiery breath!");
    }
    public void performMagic(){
        System.out.println(name + " breathes fire with power level: " + power_level);
    }
    public void fly(){
        System.out.println(name + " flies through the sky.");
    }
}