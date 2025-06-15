public class ThrowExample {

    public static void main(String[] args) {
        int x = 0; // Nilai x di set ke 0 untuk di uji

        try {
            if (x == 1) {
                // Jika x bernilai 0, maka dianggap tidak valid dan dilempar sebagai exception
                throw new ArithmeticException("Nilai x tidak boleh nol.");
            }

            // Jika tidak ada error, maka nilai x akan ditampilkan ke layar (output)
            System.out.println("x = " + x);
        } catch (ArithmeticException e) {
            // Menangani exception yang dilempar dari blok try

            // Menampilkan pesan error yang lebih mudah dimengerti
            System.out.println("Terjadi exception: " + e.getMessage());
        }
    }
}
