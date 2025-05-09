package film;

/**
 * Class untuk mendeskripsikan objek Film.
 * 
 * @author Devi Paramita
 * tgl: 9 Mei 2025
 */
public class Film {
    private String judul;
    private String genre;
    private String sutradara;
    private int tahun;

    // Konstruktor tanpa parameter
    public Film() {
        this.judul = "";
        this.genre = "";
        this.sutradara = "";
        this.tahun = 0;
    }

    // Konstruktor dengan parameter
    public Film(String judul, String genre, String sutradara, int tahun) {
        this.judul = judul;
        this.genre = genre;
        this.sutradara = sutradara;
        this.tahun = tahun;
    }

    // Method untuk menampilkan data film
    @Override
    public String toString() {
        return "Judul: " + judul + ", Genre: " + genre + ", Sutradara: " + sutradara + ", Tahun: " + tahun;
    }

    // Getter dan Setter
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
        }
}
