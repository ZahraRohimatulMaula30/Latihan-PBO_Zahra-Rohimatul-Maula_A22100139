/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class Bank {
    int saldo, simUang,ambilUang;
public Bank (int saldo){
this.saldo += saldo;
System.out.println("Selamat datang di Bank ABC");
System.out.println("Saldo saat ini: Rp " + this.saldo+ "\n");
}
void simUang(int simUang){
System.out.println("Simpan uang Rp " + simUang);
System.out.println("Saldo saat ini: Rp " + saldo);
}
int ambilUang(int saldo){
System.out.println("Ambil uang: Rp. " + saldo);
if (this.saldo >= saldo) {
this.saldo -= saldo;
System.out.println("Saldo saat ini: Rp. " + this.saldo);
} else {
System.out.println("Saldo saat ini tidak mencukupi");
}
return this.saldo;
}
}


