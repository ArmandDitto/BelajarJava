public class TugasInheritance{
    public static void main(String []args){
        Persegi Persegi = new Persegi();
        Persegi.namaBangun("Persegi: ");
        Persegi.sisi = 2;
        Persegi.hitungLuas();
        Persegi.hitungKeliling();
        Cetak.x("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        PersegiPanjang PersegiPanjang = new PersegiPanjang();
        PersegiPanjang.namaBangun("Persegi Panjang: ");
        PersegiPanjang.panjang = 2;
        PersegiPanjang.lebar = 4;
        PersegiPanjang.hitungLuas();
        PersegiPanjang.hitungKeliling();
        Cetak.x("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        LayangLayang LayangLayang = new LayangLayang();
        LayangLayang.namaBangun("Layang-Layang: ");
        LayangLayang.diagonal1 = 4;
        LayangLayang.diagonal2 = 8;
        LayangLayang.sisi = 4;
        LayangLayang.hitungLuas();
        LayangLayang.hitungKeliling();
        Cetak.x("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        BelahKetupat BelahKetupat = new BelahKetupat();
        BelahKetupat.namaBangun("Belah Ketupat: ");
        BelahKetupat.diagonal1 = 6;
        BelahKetupat.diagonal2 = 8;
        BelahKetupat.sisi = 10;
        BelahKetupat.hitungLuas();
        BelahKetupat.hitungKeliling();
        Cetak.x("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

class Cetak{
    public static void x (Object obj){
        System.out.println(obj);
    }
    public static void y (Object obj){
        System.out.print(obj);
    }
}

class Bangundatar{
    String nama;
    double luas;
    double keliling;

    void hitungLuas(){
        Cetak.y("Luas ");
    }

    void hitungKeliling(){
        Cetak.y("Keliling ");
    }

    void namaBangun (String nama){
        this.nama=nama;
    }

    String getNama(){
        return this.nama;
    }
}

class Persegi extends Bangundatar{
    double sisi;

    @Override
    void hitungLuas(){
        super.hitungLuas();
        double luas=sisi*sisi;
        Cetak.x(this.nama +luas);
    }

    @Override
    void hitungKeliling(){    
        super.hitungKeliling();
        double keliling=4*sisi;
        Cetak.x(this.nama +keliling);
    }
}

class PersegiPanjang extends Bangundatar{
    double panjang;
    double lebar;

    @Override
    void hitungLuas(){
        super.hitungLuas();
        double luas=panjang*lebar;
        Cetak.x(this.nama +luas);
    }

    @Override
    void hitungKeliling(){
        super.hitungKeliling();
        double keliling=(2*panjang)+(2*lebar);
        Cetak.x(this.nama +keliling);
    }
}

class LayangLayang extends Bangundatar{
    double diagonal1;
    double diagonal2;
    double sisi;

    @Override
    void hitungLuas(){
        super.hitungLuas();
        double luas=0.5*diagonal1*diagonal2;
        Cetak.x(this.nama +luas);
    }

    @Override
    void hitungKeliling(){
        super.hitungKeliling();
        double keliling=4*sisi;
        Cetak.x(this.nama +keliling);
    }
}

class BelahKetupat extends Bangundatar{
    double diagonal1;
    double diagonal2;
    double sisi;

    @Override
    void hitungLuas(){
        super.hitungLuas();
        double luas = 0.5*diagonal1*diagonal2;
        Cetak.x(this.nama +luas);
    }

    @Override
    void hitungKeliling(){
        super.hitungKeliling();
        double keliling = 4*sisi;
        Cetak.x(this.nama +keliling);
    }
}