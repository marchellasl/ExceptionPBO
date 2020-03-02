package exceptionpbo;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionPBO {
    public static void main(String[] args) {
       do{
           try{
        System.out.println("1. Balok 2. Kerucut 3. Limas Segitiga");
        Scanner pilih = new Scanner(System.in);
        System.out.println("Masukkan Pilihan : ");
        int Pilih = pilih.nextInt();
        switch (Pilih) {
            case 1:
                {
                boolean inputan = false;
                    try{
                        System.out.println("BALOK");
                        Balok balok = new Balok();
                        Scanner sisi = new Scanner(System.in);
                        System.out.print("Masukkan panjang : ");
                        double Panjang = sisi.nextDouble();
                        System.out.print("Masukkan lebar : ");
                        double Lebar = sisi.nextDouble();
                        System.out.print("Masukkan tinggi : ");
                        double Tinggi = sisi.nextDouble();
                        double volume = balok.volume(Panjang, Lebar, Tinggi);
                        System.out.println("Volume : " + volume);
                        double luas = balok.luas(Panjang, Lebar, Tinggi);
                        System.out.println("Luas Permukaan : " + luas);
                    }
                    catch (InputMismatchException e){
                        System.out.println(e);
                        System.out.println("Harus integer!!!");
                    }
                    break;
                }

            case 2:
                {
                    try{
                        System.out.println("KERUCUT");
                        Kerucut kerucut = new Kerucut();
                        Scanner sisi = new Scanner(System.in);
                        System.out.println("Masukkan jari-jari : ");
                        double Jari = sisi.nextDouble();
                        System.out.println("Masukkan panjang selimut : ");
                        double Selimut = sisi.nextDouble();
                        System.out.println("Masukkan tinggi : ");
                        double Tinggi = sisi.nextDouble();
                        double volume = kerucut.volume(Jari, Selimut, Tinggi);
                        System.out.println("Volume : " + volume);
                        double luas = kerucut.luas(Jari, Selimut);
                        System.out.println("Luas Permukaan : " + luas);
                    }
                    catch (InputMismatchException e){
                        System.out.println(e);
                        System.out.println("Harus integer!!!");
                    }
                    break;
                }
            case 3:
                {
                    try{
                        System.out.println("LIMAS SEGITIGA");
                        Limas limas = new Limas();
                        Scanner sisi = new Scanner(System.in);
                        System.out.println("Masukkan panjang alas : ");
                        double Alas = sisi.nextDouble();
                        System.out.println("Masukkan tinggi alas : ");
                        double Tinggi_alas = sisi.nextDouble();
                        System.out.println("Masukkan tinggi limas : ");
                        double Tinggi = sisi.nextDouble();
                        System.out.println("Masukkan tinggi sisi limas : ");
                        double Tinggi_sisi = sisi.nextDouble();

                        double volume = limas.volume(Alas, Tinggi_alas, Tinggi);
                        System.out.println("Volume : " + volume);
                        double luas = limas.luas(Alas, Tinggi_alas, Tinggi_sisi);
                        System.out.println("Luas : " + luas);
                    }
                    catch (InputMismatchException e){
                        System.out.println(e);
                        System.out.println("Harus integer!!!");
                    }
                    break;
                }
                
            default:
                System.out.println("TIDAK ADA DALAM PILIHAN");
                break;
        }
    }
           catch(InputMismatchException f){
               System.out.println("MENU TIDAK TERSEDIA!");
               System.out.println("HARUS INTEGER");
           }
       }while(true);
       }
}