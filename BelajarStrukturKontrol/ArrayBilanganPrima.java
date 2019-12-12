public class ArrayBilanganPrima{
    public static void main(String []args){
        int data[]={7,8,2,3,23,21,99,0,-1};

        for(int j=0; j<data.length; j++){
            int x= data[j];
            int i;
            boolean isPrime = true;

            for(i=2;i<x;i++){
                if(x%i==0){
                    isPrime=false;
                }
            }

            if(isPrime==true&&(x!=1&&x>0)){
                System.out.println(x);
            }
        }
    }
}