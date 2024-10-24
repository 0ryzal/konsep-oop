class Siswa {
    void belajar() {
        System.out.println("Siswa sedang belajar");
    }
}

class Rizal extends Siswa {
    void tidur() {
        System.out.println("Rizal tidur");
    }
}

public class Main {
    public static void main(String[] args) {
        Rizal rizal = new Rizal();
        rizal.tidur(); // Memanggil metode dari parent class
        rizal.belajar(); // Memanggil metode dari child class
    }
}