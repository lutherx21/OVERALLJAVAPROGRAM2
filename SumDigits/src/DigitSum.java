public class DigitSum {
    public static void main(String[] args) {
        System.out.println("The sum of digits is " + sumDigits(125) );
        System.out.println("The sum of digits is " + sumDigits(-125) );
        System.out.println("The sum of digits is " + sumDigits(4) );
        System.out.println("The sum of digits is " + sumDigits(32123) );

    }
    public static int sumDigits(int number){
        if ((number < 10) ){
         return -1;
    }
        int sum = 0;
        while(number >0){
            int digit = number %10;
            sum += digit;
            number /= 10;
            }
            return sum;
        }

}
