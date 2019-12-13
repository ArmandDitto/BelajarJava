public class Intro{
    public static void main (String[] args){ //merupakan prosedur juga (main prosedur)
        int a=10;
        int b=2;
        int r=7;
        HitungLuasSegitiga(3,4);
        HitungLuasSegitiga(a,b);
        double luaslingkaran1 = HitungLuasLingkaran(7);
        System.out.println(luaslingkaran1);
        HitungLuasTabung(7,10);
    }

    public static void HitungLuasSegitiga(int alas, int tinggi){
        double luas = alas*tinggi*0.5;
        System.out.println(luas);
    }

    public static double HitungLuasLingkaran(double r){
        double phi = 3.14;
        double luas = phi*r*r;
        return luas;
    }

    public static void HitungLuasTabung(double r, double t){
        double luaslingkaran = HitungLuasLingkaran(r);
        double volume = luaslingkaran*t;
        System.out.println(volume);
    }
}