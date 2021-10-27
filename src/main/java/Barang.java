public class Barang {
    private String id_barang;
    private String nama_barang;
    private Integer jumlah;
    private Integer harga;

    public Barang() {

    }

    public Barang(String id_barang, String nama_barang, Integer jumlah, Integer harga) {
        this.id_barang = id_barang;
        this.nama_barang = nama_barang;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getId_barang() {
        return id_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setId_barang(String id_barang) {
        this.id_barang = id_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }
}
