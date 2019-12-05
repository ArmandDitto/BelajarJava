public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World !");
        mobil Toyota = new mobil();
        Toyota.merk = "Toyota Kijang";
        Toyota.maju();
    }
    
}

class mobil{
    public String merk;

    public void maju(){
        System.out.println("Mobil "+this.merk+" maju GOOO");
    }
}