import java.util.Scanner;

public class InputOutput{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String nama;
        int tahunLahir;
        int umur;
        int tahun;
        tahun = 2020;

        System.out.print("Masukkan nama anda: ");
        nama = scanner.nextLine();
        System.out.println("Hai, " +nama);
        
        System.out.print("Masukkan Tahun Anda Lahir: ");
        tahunLahir = scanner.nextInt();
        
        umur = tahun - tahunLahir;
        System.out.print("Umur Anda Adalah: " +umur);
    }
}