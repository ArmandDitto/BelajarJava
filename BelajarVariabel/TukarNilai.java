public class TukarNilai{
    public static void main (String[] args){
        String A = "Merah";
        String B = "Biru";
        String C;

        C=A;
        A=B;
        B=C;

        System.out.println ("A isinya " +A);
        System.out.println ("B isinya " +B);

        int x = 1;
        int y = 2;

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println ("X isinya "+x);
        System.out.println ("Y isinya "+y);
    }
}