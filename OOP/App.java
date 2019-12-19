public class App{
    public static void main (String[] args){
        //Membuat objek (Instansiasi)
        //Nama class


        mobil mobilToyota =new mobil();
        mobilToyota.merk = "Toyota";
        mobilToyota.warna = "Biru";
        mobilToyota.platnomor = "B 7777 VNH";
        mobilToyota.jumlahroda = 4;
        mobilToyota.jumlahpintu = 5;
        System.out.println(mobilToyota.merk);
        mobilToyota.nyalakanmesin();
        mobilToyota.maju();
        mobilToyota.mundur();

    }
}

class mobil{ //Membuat blueprint object
    //Di bawah ini adalah Attribute dari class mobil
    String merk;
    String warna;
    String platnomor;
    int jumlahroda;
    int jumlahpintu;
    boolean nyala = false;

    //Di bawah ini adalah Method dari class mobil
    public void nyalakanmesin(){
        nyala=false;
    }
    
    public void maju(){
        if(nyala==true){
            System.out.println("Mobil Maju");
        }
        else{
            System.out.println("Nyalakan mesin terlebih dahulu");
        }
    }

    public void mundur(){
        if(nyala==true){
            System.out.println("Mobil Mundur");
        }
        else{
            System.out.println("Nyalakan mesin terlebih dahulu");
        }
    }
}