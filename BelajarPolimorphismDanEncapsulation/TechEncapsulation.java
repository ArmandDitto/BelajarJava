public class TechEncapsulation{
    public String AppName;

    public static void main(String[]args){
        Application app = new Application();
        app.setAppName ("Contoh Enkapsulasi2");
        System.out.println(app.getAppName());

        
    }
}

class Musisi{
    protected String nama;

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }

    public void menyanyi(){
        System.out.println(this.nama+ " Menyanyi");
    }

    public void manggung(){
        this.menyanyi();
    }
}

class Pianis extends Musisi{
    public void setNamaPianis(String nm){
        this.nama=nm;
    }
}

class Application{
    private String appName;

    //Setter
    public void setAppName(String nama){
        this.appName = nama;
    }
    //Getter
    public String getAppName(){
        return this.appName;
    }
}