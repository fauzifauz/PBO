package praktikum.sesi12.Quiz.PublicTransportasi;

public interface Transportasi {
    // Atribut di interface tidak bisa bersifat non-final, diubah menjadi final
    int idz = 0;

    // Method dalam interface bersifat abstract
    void tampil();
    void setData();
    int getId();
}
