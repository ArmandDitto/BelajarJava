public class PercabanganIf{
    public static void main (String[] args){
        //Percabangan If
        boolean hujan = true;
        if(hujan==true){
            System.out.println("Bawa Payung");
        }

        //Percabangan If-Else
        int nilai = 90;
        if(nilai>80){
            System.out.println("Anda Lulus");
        }
        else{
            System.out.println("Anda Tidak Lulus");
        }

        //Percabangan If-Else If-Else
        boolean badai = false;
        boolean kapal = true;
        if(badai==true && kapal==true){
            System.out.println("Boleh berlayar");
        }
        else if(badai==true && kapal==false){
            System.out.println("Jangan Berlayar");
        }
        else if(badai==false && kapal==true){
            System.out.println("Dianjurkan berlayar karena hari sedang cerah");
        }
        else{
            System.out.println("Istirahat Di rumah saja");
        }
    }
}