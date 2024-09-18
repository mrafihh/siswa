import java.util.Scanner;

public class TesSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nama");
        String nama = in.nextLine();
        System.out.println("id");
        int id = in.nextInt();
        System.err.println("ipk");
        double ipk = in.nextDouble();

        Siswa rafi = new Siswa(id , nama, ipk);

        //nilai diatas 75 lulus
        if(rafi.getIpk() >= 75){
            System.out.println(rafi.getNama() + " Anda dinyatakan lulus ");
        }else{
            System.out.println(rafi.getNama() + " Anda dinyatakan tidak lulus ");
        }

        //nilai huruf
        if(rafi.getIpk() < 60){
            System.out.println("Mendapatkan nila E");
        }else if (rafi.getIpk() > 60 && rafi.getIpk() <= 70){
            System.out.println("Mendapatkan nilai D");
        }else if (rafi.getIpk() >71 && rafi.getIpk() <= 80){
            System.out.println("Mendapatkan nilai C");
        }else if (rafi.getIpk() > 81 && rafi.getIpk() <= 90){
            System.out.println("Mendapatkan nilai B");
        }else if (rafi.getIpk() > 91 && rafi.getIpk() <= 100){
            System.out.println("Mendapatkan nilai A");
        }

        in.close();
        
    }
}