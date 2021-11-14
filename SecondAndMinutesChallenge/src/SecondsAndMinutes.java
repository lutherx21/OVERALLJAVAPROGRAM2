public class SecondsAndMinutes {
    public static void main(String[] args) {
        getDurationString(65,45);
        getDurationString(3945L);
    }
    public static int getDurationString(long minutes , long seconds){
        if (minutes >= 0 || seconds >=0 || seconds <=59){
            long hours = minutes / 60;
            long remainingminutes = minutes % 60;
            System.out.println(hours + "h " + remainingminutes +"m " + seconds +"s");
            
        }else{
            System.out.println("Invalid Value");
        }
        return -1;

    }
    public static int getDurationString(long seconds){
        if(seconds >= 0){
            long haha = seconds / 60;
            long remainingseconds = seconds % 60;
            return getDurationString(haha, remainingseconds);

        }else{
            System.out.println("Invalid Valiue");;
        }
        return -1;

    }

}
