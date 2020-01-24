import java.util.Scanner;
import java.io.*;

public class MesinATM{
    public static void CekSaldo(){
        System.out.println("\tSisa saldo anda adalah "+ InformasiSaldo.getSaldo());
    }
    public static void TarikTunai(){
        if(InformasiSaldo.saldo==0){
            System.out.println("\tSisa saldo anda 0.");
            System.out.println("\tAnda tidak dapat Tarik Tunai.");
            System.out.println("\tAnda perlu Setor terlebih dahulu.");
        }
        else if(InformasiSaldo.saldo<=500){
            System.out.println("\tAnda tidak mempunyai cukup saldo untuk Tarik Tunai.");
            System.out.println("\tCek sisa saldo anda.");
        }
        else if(TarikTunai.tariktunai>InformasiSaldo.saldo){
            System.out.println("\tJumlah tarik tunai anda lebih besar dari saldo anda.");
            System.out.println("\tSilahkan cek saldo anda.");
        }
        else{
            InformasiSaldo.Saldo = InformasiSaldo.Saldo - TarikTunai.tariktunai;
            System.out.println("\n\tAnda tarik tunai sebesar "+ TarikTunai.tariktunai);
        }
    }
    public static void InformasiSaldo(){
        System.out.println("\tSaldo anda bertambah sebesar "+ InformasiSaldo.getSaldo());
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int select = 0;
        int choice = 0;

        System.out.println("====================================================");
        System.out.println("\tSelamat Datang");
        System.out.println("\tATM Bersama Kita Teguh");
        System.out.println("====================================================");
        System.out.println();

        do{
            try{
                do{
                    System.out.println("\tSilahkan pilih transaksi");
                    System.out.println("\tPress [1] Setor");
                    System.out.println("\tPress [2] Tarik Tunai");
                    System.out.println("\tPress [3] Informasi Saldo");
                    System.out.println("\tPress [4] Keluar");
               
                    System.out.print("\n\tApa yang akan anda lakukan? ");
                    select = read.nextInt();

                    if(select>4){
                            System.out.println("\n\tSilahkan pilih transaksi.");
                        }
                        else{
                        
                        switch (select){
                            case 1:
                                System.out.print("\n\tSilahkan input uang untuk setor: ");
                                Setor.setor = read.nextDouble();
                                InformasiSaldo.saldo = Setor.setor + InformasiSaldo.saldo;
                                setor();
                                break;

                            case 2:
                                System.out.print("\n\tUntuk tarik tunai, pastikan saldo cukup.");
                                System.out.println();
                                System.out.print("\tMasukkan jumlah uang yang akan tarik tunai: ");
                                TarikTunai.tariktunai() = read.Double();
                                TarikTunai();
                                break;      
                            
                            case 3:
                                InformasiSaldo();
                                break;
                           
                            default:
                                System.out.print("\n\tTransaksi selesai.");
                                break;                          
                        }

                    }       
                }
                while (select>4); 
                do{
                   try{
                    System.out.println("\n\tApakah anda ingin transaksi lain?");
                    System.out.println("\n\tTekan [1] Ya \n\tTekan [2] Tidak");
                    System.out.print("\tMasukkan pilihan: ");
                    choice = read.nextInt();
               
                        if(choice>2){
                            System.out.print("\n\tMasukkan pilihan yang benar.");
                        }
                   } 
                   catch(Exception e){
                        System.out.println("\tError Input! Masukkan angka.");
                        read = new Scanner(System.in);
                        System.out.println("\tMasukkan pilihan anda:");
                        choice = read.nextInt();
                    }
            } while(choice>2);
        }
        catch(Exception e)
                {
                    System.out.println("\tError Input! Masukkan angka.");
                    read = new Scanner(System.in);
                    System.out.println("\tMasukkan pilihan anda:");
                    select = read.nextInt();
                }
               
        }while(choice<=1);
       
        System.out.println("\n\tTerima kasih telah menggunakan ATM ini.");
        }
    

}
