import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string A dan B
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        
        // Hitung panjang string A dan B
        int lengthA = A.length();
        int lengthB = B.length();
        
        // Jumlahkan panjang string A dan B
        int sumLength = lengthA + lengthB;
        
        // Bandingkan string A dan B secara leksikografis
        String result = A.compareTo(B) > 0 ? "Yes" : "No";
        
        // Ubah huruf pertama string A dan B menjadi huruf kapital
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        
        // Cetak hasil
        System.out.println(sumLength);
        System.out.println(result);
        System.out.println(capitalizedA + " " + capitalizedB);
        
        scanner.close();
    }
}
