/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PenilaianRapot;
import java.util.Scanner;
public class Data extends Menu {
    Scanner sc= new Scanner(System.in);
    int a;
    String nama;
    @Override
    public void data_siswa(){
            System.out.println("Masukkan Nama Siswa: ");
            this.nama=sc.nextLine();
        
    }
    public String getNama(){
        return this.nama;
    }
}
