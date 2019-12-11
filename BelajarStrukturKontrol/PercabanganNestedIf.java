public class PercabanganNestedIf{
    public static void main (String [] args){
        boolean badai = true;
        boolean kapal = true;
        if(badai==true){
            if(kapal==true){ //Kalau kondisi badai dan ada kapal
                System.out.println("Boleh Berlayar");
            }
            else{ //Kalau kondisi badai namun tidak ada kapal
                System.out.println("Jangan Berlayar");
            }
        }
        else{
            if(kapal==true){ //Kalau kondisi cerah dan ada kapal
                System.out.println("Disarankan Berlayar");
            }
            else{ //Kalau kondisi cerah namun tidak ada kapal
                System.out.println("Istirahat di Rumah saja");
            }
        }
    }
}