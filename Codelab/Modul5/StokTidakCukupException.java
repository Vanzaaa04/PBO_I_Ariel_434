public class StokTidakCukupException extends Exception {  // Class exception kustom, mewarisi dari Exception
    public StokTidakCukupException(String message){       // Konstruktor yang menerima pesan error
        super(message);                                   // Memanggil konstruktor superclass (Exception) dengan pesan error
    }
}
