public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean teen = hasTeen(22,23,34);
        System.out.println(teen);
        boolean secondteen = isTeen(13);
        System.out.println(secondteen);

    }
    public static boolean hasTeen(int age1 ,int age2, int age3){
       if((age1 >=13 )&& (age1 <=19) ){
           return  true;

        }if((age2 >=13) && (age2<=19)){
           return true;

        }if((age3 >=13 ) && age3<=19){
           return true;

        }
        else{
            return  false;
        }

    }
    public static boolean isTeen(int age){
        if ((age >=13) && (age<=19)){
            return true;

        }else{
            return false;
        }

    }
}
