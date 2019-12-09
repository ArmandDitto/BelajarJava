public class OperatorTernary{
    public static void main(String[] args){
        boolean hujan = true;
        System.out.println(hujan? "bawa payung" : "tidak perlu bawa paung");

        String nama = "Ditto";
        String access = nama == "Ditto" ? "Halo Admin" : "Kamu bukan Admin";
        System.out.println(access); 

        
    }
}