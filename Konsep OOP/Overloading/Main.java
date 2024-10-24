class Calculator {
    int tambah(int a, int b) {
        return a + b;
    }

    int tambah(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.tambah(5, 10)); // Output: 15
        System.out.println(calc.tambah(5, 10, 20)); // Output: 35
    }
}