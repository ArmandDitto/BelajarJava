public class ArrayXGanjil{
    public static void main (String args[]){
        int dataGanjil[] = {30,22,39,36,27,99,100};
        
        for(int i=0;i<dataGanjil.length;i++){
            if(dataGanjil[i]%2!=0){
                System.out.println(dataGanjil[i]);
            } 
        }
    }
}