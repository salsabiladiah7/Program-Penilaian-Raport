/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PenilaianRapot;
import java.util.Scanner;
public class Input extends Menu {
     Scanner sn= new Scanner(System.in);
    String predikat;
    int nilai;
    double b,c,d,na;
     @Override
    public void data_siswa(){
        System.out.print("Masukkan nilai: ");
        this.nilai=sn.nextInt();
    }
        public void setPredikat(){
        if(this.nilai>=75){
            this.predikat="Lulus";
        }
        else if(this.nilai<75){
            this.predikat="Tidak Lulus";
        }
    }
    public int getNilai(){
        return this.nilai;
    }
    public String getPredikat(){
        return this.predikat;
    }
}
