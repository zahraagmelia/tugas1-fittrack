/**
 * Merepresentasikan satu member yang terdaftar di sistem FitTrack.
 * Class ini mendefinisikan konstanta nilai default dan atribut 
 * untuk menyimpan data pribadi member.
 */
public class Member {
    private static final int MIN_PANJANG_TELEPON = 10;
    private static final String AWALAN_TELEPON = "0";
    private static final String DEFAULT_PAKET = "Basic";
    private static final String DEFAULT_NAMA = "Tidak Valid";
    private static final String DEFAULT_TELEPON = "0000000000";
    private static final String DEFAULT_TANGGAL = "01-01-2026";

    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;
    
    /**
     * Constructor lengkap
     */
    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
        this.nama = DEFAULT_NAMA;
        this.noTelepon = DEFAULT_TELEPON;
        this.tanggalDaftar = DEFAULT_TANGGAL;
        this.jenisPaket = DEFAULT_PAKET;

        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    /**
     * Constructor khusus buat member yang daftar tanpa pilih paket.
     * Nanti jenis paketnya otomatis ditaruh paket Basic.
     *
     * @param nama nama lengkap member
     * @param noTelepon nomor HP aktif member
     * @param tanggalDaftar tanggal pertama kali bergabung
     */
    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, DEFAULT_PAKET);
    }

    /**
     * Method buat ngambil data nama member.
     *
     * @return nama member saat ini
     */
    public String getNama() {
        return nama;
    }

    /**
     * Method buat ngubah nama member.
     * Ada pengecekan supaya nama gak boleh kosong atau cuma spasi doang.
     *
     * @param nama masukan nama baru yang mau disimpan
     */
    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("[Gagal Set Nama]: Nama tidak boleh kosong atau hanya berisi spasi.");
        }
    }
}
