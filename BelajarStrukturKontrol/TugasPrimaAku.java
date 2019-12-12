public class TugasPrimaAku{
    public static void main (String[] args){
        int x= Integer.parseInt(args[0]);
        int i;
        boolean isPrime = true;

        for(i=2;i<x;i++){
            if(x%i==0){
                isPrime=false;
            }
        }

        if(isPrime==true&&(x!=1&&x>0)){
            System.out.println("Prime");
        } 
        else{
            System.out.println("Not Prime");
        }
    }
}