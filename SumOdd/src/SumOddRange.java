public class SumOddRange {
    public static void main(String[] args) {
        boolean odd = isOdd(3);
        System.out.println(odd);
        int sum_odd = sumOdd(100,1000);
        System.out.println(sum_odd);
    }
    public static boolean isOdd(int number){
        if( (number % 2 == 1) && (number > 0)){
            return true;
        }else{
            return false;
        }
    }
    public static int sumOdd(int start , int end){
        int sum = 0;
       if ((end >= start) && start >0 && end > 0){
           for (int i  =start ; i <= end; i++){
               if (isOdd(i)){
                   sum += i;
                   i++;
               }
           }
            return  sum;
       }
        return -1;
    }
}

//start > 0 && end > 0 && end >= start
