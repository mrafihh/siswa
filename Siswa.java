//Object Class
public class Siswa {
    int id;
    String nama;
    double ipk;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    /*constructor nama sama dengan nama class */
    public Siswa(){
        id = 0;
        nama = "";
        ipk = 0.0;
    }
    
    //Constructor parameter
    public Siswa (int id, String nama, double ipk){
        this.id = id;
        this.nama = nama;
        this.ipk= ipk;
    }


    //method
    public void print() {
        System.out.println("Ini Data Dari Siswa");
        System.out.println("ID : "+ id);
        System.out.println("Nama : "+ nama);
        System.out.println("IPK "+ ipk);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("");
    }

    //method yang menghasilkan value
    public String print2() {
        return "ID : " +id
        + "\nNama : " +nama
        + "\nIPK :" +ipk;
    }

}