public class PengulanganDoWhile{
    public static void main (String[] args){
        int battery = 100;

        do{
            System.out.println("Nyalain HP");
            battery--;
        }while(battery>0);
    }
}