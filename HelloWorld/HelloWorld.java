public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World !");
        mobil Toyota = new mobil();
        Toyota.merk = "Toyota Kijang";
        Toyota.maju();

        mobil Honda = new mobil();
        Honda.merk = "Honda Civiv";
        Honda.maju();
        
        System.out.println(args[1]+args[2]);
    }
    
}

class mobil{
    //Atribut
    public String merk;
    //Method
    public void maju(){
        System.out.println("Mobil "+this.merk+" maju GOOO");
    }
}