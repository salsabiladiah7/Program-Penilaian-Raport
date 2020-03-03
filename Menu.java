package PenilaianRapot;
public class Menu {
    public void Pembuka(){
        System.out.println("_________________________________________________");
        System.out.println();
        System.out.println("   SELAMAT DATANG DI SYSTEM PENILAIAN KAMI");
        System.out.println("_________________________________________________");
        System.out.println();
    }
    
    public void pilih(){
        System.out.println("-----------------------MENU----------------------");
        System.out.println("1.Isi Data Nilai");
        System.out.println("2.Tampilkan Data");
        System.out.println("3.Exit");
        System.out.println();
    }
    public void data_siswa(){
        System.out.println("_______________________Pengisian Data_____________________");
    }
    public void Tabel(){
        System.out.println("------------------HASIL PENILAIAN SEMESTER GANJIL-----------------");
        System.out.println("                      TAHUN AJARAN 2019/2020                 ");
        System.out.println("_______________________________________________________________");
        System.out.println("NO   NAMA       MATA PELAJARAN    NILAI AKHIR    PREDIKAT");
    }
}
