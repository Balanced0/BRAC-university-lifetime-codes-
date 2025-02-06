public class Phoenix extends MagicalCreature{
    public int cycle;
    public Phoenix(String name, int age, int cycle){
        super(name, age);
        this.cycle = cycle;
    }
    public void displayInfo(){
        super.displayInfo();
    }
    public void makeSound(){
        System.out.println(name + " sings an enchancting song.");
    }
    public void performMagic(){
        System.out.println(name + " is reborn with " + cycle + " rebirth cycles");
    }
    public void regenerate(){
        System.out.println(name + "regenerrates its body in a burst of flames.");
    }
}