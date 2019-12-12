public class ArrayXTerkecil{
    public static void main (String []args){
        int[] data = {9,88,200,1,576,242};
        int lowestData = data[0];
        int lowestindex = 0;
        int highestData = data[0];
        int highestindex = 0;

        for(int i=0; i<data.length; i++){
            if(data[lowestindex]>data[i]){
                lowestData=data[i];
                lowestindex=i;
            }
        }
        System.out.println("Data terkecil adalah " +lowestData +" dan berada pada index nomor " +lowestindex);
        
        for(int j=0; j<data.length; j++){
            if(data[highestindex]<data[j]){
                highestData=data[j];
                highestindex=j;
            }
        }
        System.out.println("Data terkecil adalah " +highestData +" dan berada pada index nomor " +highestindex);
    }
}