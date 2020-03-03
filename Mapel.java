/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PenilaianRapot;
import java.util.Scanner;
/**
 *
 * @author Salsabila Diah
 */
public class Mapel extends Menu{
    Scanner sc= new Scanner(System.in);
    int a;
    String pelajaran;
    @Override
    public void data_siswa(){
            System.out.println("Masukkan Mata Pelajaran");
            this.pelajaran=sc.nextLine();
        
    }
    public String getMapel(){
        return this.pelajaran;
    }
}
