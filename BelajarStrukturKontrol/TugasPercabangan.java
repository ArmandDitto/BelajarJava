public class TugasPercabangan{
    public static void main (String[] args){
        try{
            double bil = Double.parseDouble(args[0]);
            if (bil>=85 && bil<=100){
                System.out.println("A");
            }
            else if (bil>=75 && bil<=84){
                System.out.println("B");
            }
            else if (bil>=65 && bil<=74){
                System.out.println("C");
            }
            else if (bil>=45 && bil<=64){
                System.out.println("D");
            }
            else if (bil>=0 && bil<=44){
                System.out.println("E");
            }
            else{
                System.out.println("Nilai tidak Valid");
            }
        }
        catch (Exception e){
            System.out.println("Harus Angka");

        }
    }
   
}