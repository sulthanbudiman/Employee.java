/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author MOKLET
 */
public class CS extends Employee{
    String jabatan = "Cleaning Services";
    int gaji = 10000000;
    
    @Override
    int rumus(int gaji, int jamkerja){
        int potongan = (super.jamkerja - jamkerja)*super.potongan;
        int hasil = gaji - potongan;
        return hasil;
    }
    
}
