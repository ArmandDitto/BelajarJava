public class ArraySortAscending{
    public static void main (String [] args){
        int[] data = {9,88,200,1,576,-2, 7, 24};

        for(int index=0;index<data.length;index++){
            
            int lowestindex = index;
            for(int i=index; i<data.length; i++){
                if(data[lowestindex]>data[i]){
                    lowestindex=i;
                }
            }

            int temp = data[index];
            data[index]=data[lowestindex];
            data[lowestindex]=temp;
        }

        for(int j=0; j<data.length; j++){
            System.out.println(data[j]);
        }
    }
}