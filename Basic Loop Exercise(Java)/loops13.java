public class loops13{
    public static void main(String[] args){
        int i = 1;
        while(i <= 500){
             int number = i;
             int sum = 0;
             int digit;
            while(number > 0){
                digit = number%10;
                sum += digit * digit * digit;
                number /= 10;
            }
            if(sum == i){
                System.out.println(i);
            }
            i++;
        }
        
    }
}