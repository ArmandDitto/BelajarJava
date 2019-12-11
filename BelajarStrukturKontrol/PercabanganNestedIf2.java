public class PercabanganNestedIf2{
    public static void main(String [] args){
        String username = "1";
        String password = "2";

        if(username=="1"){
            if(password=="2"){ //Username: True && Pass: True
                System.out.println("Berhasil Login");
            }
            else{ //Username: True && Pass: False
                System.out.println("Password anda Salah");
            }
        }
        else{ //Username: False && Pass: False atau Username: False && Pass:True
            System.out.println("Username tidak ditemukan");
        }
    }
}