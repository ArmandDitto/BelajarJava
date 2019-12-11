public class TugasOperator{
    public static void main(String[] args){
        int bil = Integer.parseInt(args[0]);
        String ver = bil%2==0 ? "Genap" : "Ganjil";
        String ver2 = bil%2==1 ? "Ganjil" : "Genap";
        String ver3 = bil%2!=0 ? "Ganjil" : "Genap";
        String ver4 = bil%2!=1 ? "Genap" : "Ganjil"; 

        System.out.println(ver);
        System.out.println(ver2);
        System.out.println(ver3);
        System.out.println(ver4); 
    }
}