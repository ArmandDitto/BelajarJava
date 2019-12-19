import java.util.Scanner;

public class LuasSegitiga{
    public static void main(String args[]){
        int a;
        int t;
        double luas;

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan alas: ");
        a=scan.nextInt();
        System.out.print("Masukkan tinggi: ");
        t=scan.nextInt();

        luas=((a*t)/2);
        System.out.println("Luas Segitiga: " +luas);
    }
}