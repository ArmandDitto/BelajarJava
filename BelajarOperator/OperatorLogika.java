public class OperatorLogika{
    public static void main (String[] args){
        boolean a = true;
        boolean b = false;
        boolean hujan = false; //operator Ternar

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!a && b);
        System.out.println(!b || a);
        System.out.println(hujan ?"bawa payung" : "tidak usah bawa payung"); //operator Ternary

    }
}