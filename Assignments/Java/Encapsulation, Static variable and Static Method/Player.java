public class Player{
    public static int total = 0;
    public static String players[] = new String[11];
    public static int index = 0;
    public String name;
    public int number;
    public String country;
    public Player(String name, String country, int number){
        this.name = name;
        this.country = country;
        this.number = number;
        Player.total++;
        Player.players[Player.index++] = name;
    }
    public String player_detail(){
        return "Player Name: " + name + "\nJersey Number: " + number + "\nCountry: " + country;
    }
    public static void info(){
        System.out.println("Total number of players: " + Player.total);
        System.out.print("Players enlisted so far: ");
        for(int i = 0; i < Player.index; i++){
            if (i < Player.index - 1) {
            System.out.print(Player.players[i] + ", ");
            } else {
                System.out.print(Player.players[i]);
            }
        }
        System.out.println();
    }
}