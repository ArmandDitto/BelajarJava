public class Inheritance{
    public static void main(String[]args){
        Musisi roby = new Musisi();
        roby.diberiNama("Roby");
        roby.menyanyi();
        roby.manggung();

        Pianis steve = new Pianis();
        steve.diberiNama("Steve");
        steve.menyanyi();
        steve.bacaNada();
        steve.mainPiano();
        steve.manggung();
        steve.speak(roby.getNama());
    }
}

class Musisi{
    String nama;

    void menyanyi(){
        System.out.println(this.nama+" Menyanyi");
    }

    void speak(String words){
        System.out.println(words);
    }

    //Setter
    void diberiNama(String nama){
        this.nama=nama;
    }

    //Getter
    String getNama(){
        return this.nama;
    }

    void bacaNada(){
        System.out.println(this.nama+" Baca nada");
    }

    void manggung(){
        this.menyanyi();
    }
}

class Pianis extends Musisi{
    void speak(String words){
        System.out.println(words);
    }    

    @Override
    void manggung(){
        //super.manggung();
        this.mainPiano();
    }

    void mainPiano(){
        System.out.println(this.nama+" Main Piano");
    }
}

