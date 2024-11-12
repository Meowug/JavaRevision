import java.util.Scanner;

public class pakejTravel {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilOrang, bilHari;
        double bajet, jumBajet;
        String Ucapan;

        //Tajuk
        System.out.println("\nSISTEM CADANGAN PAKEJ PELANCONGAN");
        System.out.println("HAPPY VACATION & TRAVEL SERVICES SDN.BHD.");
        System.out.println("=========================================");

        int x=0;
        for (int i=0;i<=x;i++) {
            //2nd round : i=1,x=1, i=x, i!=x,
            //3rd round: i=2, x=1, i!=x
            //Input data pengguna
            System.out.print("Masukkan bajet perseorangan (RM) : ");
            bajet = sc.nextDouble();
            System.out.print("Masukkan bilangan orang: ");
            bilOrang = sc.nextInt();
            System.out.print("Masukkan bilangan hari: ");
            bilHari = sc.nextInt();

            //kira jumlah bajet
            jumBajet = bajet * bilHari * bilOrang;

            //Pilihan Pakej
            if (jumBajet <= 10000)
                Ucapan = "Pakej Dalam Negara: Sabah atau Sarawak";
            else if (jumBajet <= 15000)
                Ucapan = "Pakej Dalam Negara: Melaka atau Pulau Langkawi";
            else if (jumBajet <= 30000)
                Ucapan = "Pakej Antarabangsa: Korea Selatan atau Jepun";
            else if (jumBajet <= 35000)
                Ucapan = "Pakej Antarabangsa: New York atau Australia";
            else
                Ucapan = "Pakej Ekslusif: Eropah atau Amerika Syarikat";

            System.out.println("\nRM" + jumBajet);
            System.out.println("\n" + Ucapan);

            System.out.print("Adakah anda ingin meneruskan? (Y/N) : ");
            char pilihan = sc.next().charAt(0);
            //Y huruf besar atau y huruf kecil
            if (pilihan == 'Y' || pilihan == 'y')
                x++;
        }
        System.out.println("Terima Kasih kerana telah mencuba.");
    }
}
