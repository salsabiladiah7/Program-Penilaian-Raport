/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PenilaianRapot;
import java.util.Scanner;
public class panggil {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Menu mn = new Menu();
        Data[] dt= new Data[50];
        Input[] in=new Input[50];
        Mapel[] mp= new Mapel[50];
        int menu=0, z=0,a;
        mn.Pembuka();
        while(menu!=3){
            mn.pilih();
            menu=sc.nextInt();
            if(menu==1){
                z++;
                mn.data_siswa();
                dt[z]=new Data();
                mp[z]= new Mapel();
                in[z]=new Input();
                dt[z].data_siswa();
                mp[z].data_siswa();
                in[z].data_siswa();
            }
            else if(menu==2){
                a=0;
                mn.Tabel();
                    while(a<z){
                        a++;
                        System.out.print(a+".   ");
                        System.out.print(dt[a].getNama()+"          ");
                        System.out.print(mp[a].getMapel()+"          ");
                        System.out.print(in[a].getNilai()+"          ");
                        in[a].setPredikat();;
                        System.out.print(in[a].getPredikat());
                        System.out.println();
                    }
                    System.out.println("_______________________________________________________________");
            }
            else if(menu==3){
                System.out.println("EXIT PROGRAM...");
            }
            else{
                System.out.println("ERROR!");
            }
        }
    }
}
