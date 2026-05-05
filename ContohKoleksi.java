import java.util.ArrayList;
import java.util.ArrayDeque;

public class ContohKoleksi {
    public static void main(String[] args) {
        
        ArrayList<String> daftarTeknologi = new ArrayList<>();
        daftarTeknologi.add("Java");
        daftarTeknologi.add("Python");
        daftarTeknologi.add("Next.js");

        System.out.println("Daftar Teknologi (ArrayList):");
        for (String teknologi : daftarTeknologi) {
            System.out.println("- " + teknologi);
        }

        System.out.println();

        ArrayDeque<String> antrianTugas = new ArrayDeque<>();
        antrianTugas.add("Konfigurasi Server Ubuntu");
        antrianTugas.add("Deploy Web Hosting");
        antrianTugas.add("Analisis Data Sentimen");

        System.out.println("Tugas yang sedang dikerjakan: " + antrianTugas.poll());

        System.out.println("Sisa Antrian Tugas (ArrayDeque):");
        for (String tugas : antrianTugas) {
            System.out.println("- " + tugas);
        }
    }
}