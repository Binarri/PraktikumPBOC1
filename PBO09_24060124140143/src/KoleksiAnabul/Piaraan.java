/* Nama File    : Piaraan.java
 Deskripsi      : Kelas untuk mengelola antrean objek Anabul menggunakan Queue
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 14 Mei 2026
*/

package KoleksiAnabul;

import java.util.Queue;
import java.util.LinkedList;

public class Piaraan {
    /*************ATRIBUT********************/
    private int nbelm;
    private Queue<Anabul> Lanabul;


    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public Piaraan(){
        this.nbelm = 0;
        this.Lanabul = new LinkedList<>();
    }

    /*================SELEKTOR================*/
    //2b i. getNbelm()
    //mengembalikan jumlah elemen
    public int getNbelm(){
        return nbelm;
    }
    //2b iv. getAnabul()
    //Mengambil data anabul pertama dalam antrean
    public Anabul getAnabul(){
        if(nbelm>0){
            return Lanabul.peek();
        } else{
            System.out.println("Error: Antrian kosong!");
            return null;
        }
    }

    /*================MUTATOR================*/
    //2b ii.enqueueAnabul(anabul)
    //menambah elemen di akhir antrian
    public void enqueueAnabul(Anabul anabul){
        if(anabul != null){
            Lanabul.add(anabul);
            nbelm++;
        } else {
            System.out.println("Error: Anabul tidak boleh null");
        }
    }
    //2b v. dequeueAnabul()
    //Mengambil anabul pertama sekaligus mengeluarkannya dari antrean
    public Anabul dequeueAnabul(){
        if(nbelm > 0){
            Anabul anabul = Lanabul.poll();
            nbelm--;
            return anabul;
        } else{
            System.out.println("Error: Antrian kosong!");
            return null;
        }
    }

    /*============Method Lainnya============*/
    //2b iii. isMember(anabul)
    //Untuk mengecek apakah anabul ada dalam antrian
    public boolean isMember(Anabul anabul){
        return Lanabul.contains(anabul);
    }
    //2c. showAnabul()
    //Menampilkan nama-nama panggilan para anabul dalam antrean
    public void showAnabul(){
        if(nbelm == 0){
            System.out.println("Tidak ada hewan dalam antrean");
        } else{
            System.out.println("Daftar hewan anabul: ");
            int nomor = 1;
            for(Anabul anabul: Lanabul){
                System.out.println(nomor + ". " + anabul.getNama());
                nomor++;
            }
        }
    }
    //2d. countKucing()
    //Menghitung banyak keluarga kucing dalam antrean
    public int countKucing(){
        int jumlah = 0;
        for(Anabul anabul:Lanabul){
            if(anabul instanceof Kucing){
                jumlah++;
            }
        }
        return jumlah;
    }
    //2e. bobotKucing()
    //Menghitung bobot keluarga kucing dalam antrean
    public double bobotKucing(){
        double totalBobot = 0.0;
        for(Anabul anabul :Lanabul){
            if(anabul instanceof Kucing){
                Kucing kucing = (Kucing)anabul;
                totalBobot += kucing.getBobot();
            }
        }
        return totalBobot;
    }
    //2f. showJenisAnabul
    //Menampilkan nama-nama panggilan para anabul dalam antrean
    public void showJenisAnabul(){
        if(nbelm==0){
            System.out.println("Tidak ada hewan dalam antrean");
        } else{
            System.out.println("Daftar hewan anabul (jenis): ");
            int nomor = 1;
            for (Anabul anabul:Lanabul){
                String jenisHewan = anabul.getClass().getName();
                jenisHewan = jenisHewan.substring(jenisHewan.lastIndexOf(".")+1);
                System.out.println(nomor + "." + anabul.getNama() + " (" + jenisHewan + ")");
                nomor++;
            }
        }
    }

} //end of class Piaraan
