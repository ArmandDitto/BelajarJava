public class TugasPrima{
    public static void main (String [] args){
        int bil = Integer.parseInt(args[0]);
        boolean prima = true;

        //Mengecek Status Keprimaan bilangan
        for(int div=2; div<bil; div++){
            if ((bil%div)==0){
                prima=false;
                break;
            }
        }

        if (prima==true && (bil>0)&&(bil!=1)){
            System.out.println("Bilangan Prima");
        }
        else{
            System.out.println("Bukan Bilangan Prima");
        }
    }
}