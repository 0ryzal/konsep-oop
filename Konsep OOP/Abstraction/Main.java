abstract class Kendaraan {
    abstract void bergerak(); // Metode abstrak, tanpa implementasi
}

class Mobil extends Kendaraan {
    @Override
    void bergerak() {
        System.out.println("Mobil bergerak dengan roda");
    }
}

public static class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        mobil.bergerak(); // Output: Mobil bergerak dengan roda
    }
}