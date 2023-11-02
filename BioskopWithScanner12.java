import java.util.Scanner;

public class BioskopWithScanner12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        String [][] penonton = new String[4][2];
        
        while (true) {
            
        System.out.println("\n======");
        System.out.println(" Menu");
        System.out.println("======");
        System.out.println("1. Input Data Penonton");
        System.out.println("2. Tampilkan Daftar Penonton");
        System.out.println("3. Exit");

        System.out.print("Pilih Menu: ");
        int menu = input12.nextInt();

        input12.nextLine();


switch(menu) {
        case 1:
            System.out.print("\nMasukkan nama: ");
            String nama = input12.nextLine();
            System.out.print("Masukkan baris: ");
            int baris = input12.nextInt();
            System.out.print("Masukkan kolom: ");
            int kolom = input12.nextInt();
            input12.nextLine();

            penonton[baris-1][kolom-1] = nama;
                break;
            
    
        case 2:
        for (int i=0; i < penonton.length;i++) {
                System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
            }
        
        break;

        case 3:
        System.exit(0);

        default:
        System.out.println("==================================");
        System.out.println(" Menu yang anda pilih tidak valid");
        System.out.println("==================================");
    }

}
}
}
