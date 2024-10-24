class Siswa {
    void belajar() {
        System.out.println("Siswa belajar");
    }
}

class Rizal extends Siswa {
    @Override
    void tidur() {
        System.out.println("Rizal tidur");
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan siswa = new Rizal();
        siswa.belajar(); // Output: Rizal belajar
    }
}