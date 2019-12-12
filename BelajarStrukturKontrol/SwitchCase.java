public class SwitchCase{
    public static void main(String []args){
        int Bulan=Integer.parseInt(args[0]);
        String Hari=args[1];
        switch(Bulan){
            case 1:
            System.out.println("Januari");
            break;
            case 2:
            System.out.println("Februari");
            break;
            case 3:
            System.out.println("Maret");
            break;
            case 4:
            System.out.println("April");
            break;
            default:
            System.out.println("Muharam");
            break;
        }

        switch(Hari){
            case "Senin":
            System.out.println("Upacara");
            break;
            case "Selasa":
            System.out.println("Berenang");
            break;
            case "Rabu":
            System.out.println("Sepakbola");
            break;
            default:
            System.out.println("Libur");
            break;
            
        }
    }
}