public class TugasPrimaKompleks{
    public static void main(String[] args){
        int data[] = {9,10,89,7,0,1,3,5,9,2};
        
        for(int j=0;j<data.length;j++){

            int x = data[j];
            boolean isPrime=true;

            for(int i=2;i<x;i++){
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