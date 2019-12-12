public class TugasPrima2{
    public static void main(String[] args){
        int remainder;
        boolean isPrime=true;
        int numberToCheck=Integer.parseInt(args[0]); // Enter the numberToCheckber you want to check for prime
        
        //Loop to check whether the numberToCheckber is divisible any numberToCheckber other than 1 and iteself
        for(int i=2;i<=numberToCheck;i++){
        //numberToCheckber is dived by itself
            remainder=numberToCheck%i;
            System.out.println(numberToCheck+" Divided by "+ i + " gives a remainder "+remainder);        
            //if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
            if(remainder==0){
                isPrime=false;
                break;
            }
        }
            // Check value true or false,if isprime is true then numberToCheckber is prime otherwise not prime
        if(isPrime && (numberToCheck>0&&numberToCheck!=1)){
            System.out.println(numberToCheck + " is a Prime number");
        }
        else{
            System.out.println(numberToCheck + " is not a Prime number");
        }
    }
}