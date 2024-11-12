import java.util.Scanner;

public class pakejTravel_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilOrang, bilHari;
        double bajet, jumBajet;
        String Ucapan;
        boolean loop = true;

        tajuk();

        do {
            System.out.print("Masukkan bajet perseorangan (RM) : ");
            bajet = sc.nextDouble();
            System.out.print("Masukkan bilangan orang: ");
            bilOrang = sc.nextInt();
            System.out.print("Masukkan bilangan hari: ");
            bilHari = sc.nextInt();

            //kira jumlah bajet
            jumBajet = kiraJumBajet(bajet, bilHari, bilOrang);

            //Pilihan Pakej
            Ucapan = pilihanPakej(jumBajet);

            //paparan1
            paparan1(jumBajet, Ucapan);

            //loop
            System.out.print("Adakah anda ingin meneruskan? (Y/N) : ");
            char pilihan = sc.next().charAt(0);
            if (pilihan == 'n' || pilihan == 'N') {
                loop = false;
            }
        } while (loop);

        //paparan maklumat agen
        maklumatAgen();
    }

    public static void tajuk() {
        System.out.println("\n\tSISTEM CADANGAN PAKEJ PELANCONGAN");
        System.out.println("HAPPY VACATION & TRAVEL SERVICES SDN.BHD.");
        int lineLength = "HAPPY VACATION & TRAVEL SERVICES SDN.BHD.".length();
        for (int x = 0; x < lineLength; x++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public static double kiraJumBajet(double bajet, int bilHari, int bilOrang) {
        return bajet * bilHari * bilOrang;
    }

    public static String pilihanPakej(double jumBajet) {
        if (jumBajet <= 10000)
            return "Pakej Dalam Negara: Sabah atau Sarawak";
        else if (jumBajet <= 15000)
            return "Pakej Dalam Negara: Melaka atau Pulau Langkawi";
        else if (jumBajet <= 30000)
            return "Pakej Antarabangsa: Korea Selatan atau Jepun";
        else if (jumBajet <= 35000)
            return "Pakej Antarabangsa: New York atau Australia";
        else
            return "Pakej Ekslusif: Eropah atau Amerika Syarikat";
    }

    public static void paparan1(double jumBajet, String Ucapan) {
        System.out.println("\nRM" + jumBajet);
        System.out.println("\n" + Ucapan);
    }

    public static void maklumatAgen() {
        System.out.println("\nTerima kasih kerana menggunakan sistem cadangan pakej pelancongan kami. Anda sangat kami hargai. Maaf atas segala kesilapan yang berlaku.\nUntuk maklumat lanjut, sila hubungi agen berikut:");
        System.out.println("1) Encik Lontong\n   No Tel. : 0127895672");
        System.out.println("2) Encik Danie\n   No Tel. : 0107835629");
    }
}
