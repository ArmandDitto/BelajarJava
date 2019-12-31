public class TechPolymorphism{
    public static void main(String [] args){
        Matematika obj = new Matematika();
        obj.perkalian(2,3);
        obj.perkalian(3.0,1.5);
        obj.perkalian(3,4,5);
        obj.perkalian(3.0,1.5,3);
    }
}

class Matematika{
    public void perkalian(int num1, int num2){
        int result=num1*num2;
        System.out.println(result);
    }

    public void perkalian(double num1, double num2){
        double result=num1*num2;
        System.out.println(result);
    }

    public void perkalian(int num1, int num2, int num3){
        int result=num1*num2*num3;
        System.out.println(result);
    }

    public void perkalian(double num1, double num2, double num3){
        double result=num1*num2*num3;
        System.out.println(result);
    }
}