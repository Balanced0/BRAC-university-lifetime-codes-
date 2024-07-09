public class loops18i{
    public static void main(String[] args){
        int horizontal = 10;
        int vertical = 4;
        String character = "*";
        for(int i = 0; i < vertical; i++){
            for(int j = 0; j < horizontal; j++){
                System.out.print(character);
            }
            System.out.println();
        }
    }
}