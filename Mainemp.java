/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

import java.util.Scanner;

/**
 *
 * @author MOKLET
 */
public class Mainemp {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Masukkan nama = ");
        String nama = scan.nextLine();
        
        System.out.println("Masukkan Nip = ");
        int nip = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Masukkan Jabatan = ");
        String jabatan = scan.nextLine();
        Boss boss = new Boss();
        Manager manager = new Manager();
        CS cs = new CS();
        Internship magang = new Internship();
        
        int gajitotal = 0;
        
        if (jabatan.equalsIgnoreCase(boss.jabatan)){
            System.out.println("Lama waktu bekerja = ");
            int lamakerja = scan.nextInt();
            gajitotal = boss.rumus(boss.gaji,lamakerja);
            System.out.println("Gaji = "+boss.gaji);
        }
        else if (jabatan.equalsIgnoreCase(cs.jabatan)){
            System.out.println("Lama waktu bekerja = ");
            int lamakerja = scan.nextInt();
            gajitotal = boss.rumus(cs.gaji,lamakerja);
            System.out.println("Gaji = "+cs.gaji);
        }
        else if (jabatan.equalsIgnoreCase(manager.jabatan)){
            System.out.println("Lama waktu bekerja = ");
            int lamakerja = scan.nextInt();
            gajitotal = boss.rumus(manager.gaji,lamakerja);
            System.out.println("Gaji = "+manager.gaji);
            System.out.println("Potongan = "+manager.potongan);
        }
        else if (jabatan.equalsIgnoreCase(magang.jabatan)){
            System.out.println("Lama waktu bekerja = ");
            int lamakerja = scan.nextInt();
            gajitotal = boss.rumus(magang.gaji,lamakerja);
            System.out.println("Gaji = "+magang.gaji);
            System.out.println("Potongan = "+magang.potongan);
        }
        System.out.println("Gaji total anda = "+gajitotal);
        
}
}