/* Nama File    : Teman.java
 Deskripsi      : Kelas untuk mengelola koleksi nama teman menggunakan List
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 7 Mei 2026
*/

import java.util.List;
import java.util.ArrayList;

public class Teman {
    /*************ATRIBUT********************/
    private int nbelm;
    private List<String> Lnama;
    

    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public Teman(){
        this.nbelm = 0;
        this.Lnama = new ArrayList<>();
    }

    /*============SELEKTOR============*/
    //1a. getNbelm()
    //Mengembalikan nilai jumlah elemen dalam list
    public int getNbelm(){
        return this.nbelm;
    }
    //1b. getNama(indeks)
    //Mengembalikan nama berdasarkan indeks
    public String getNama(int indeks){
        if (indeks >=0 && indeks<nbelm){
            return Lnama.get(indeks);
        } else {
            throw new IndexOutOfBoundsException("Indeks" + indeks + "di luar batas (0 -" + (nbelm-1) + ")");
        }
    }

    /*============MUTATOR============*/
    //1c. SetNama(indeks, nama)
    //Mengubah nama berdasarkan indeks
    public void setNama(int indeks, String nama){
        if(indeks >= 0 && indeks < nbelm){
            Lnama.set(indeks, nama);
        } else{
            throw new IndexOutOfBoundsException("Indeks " + indeks + "di luar batas (0-" + (nbelm - 1) + ")");
        }
    }

    
    /*============Method Lainnya============*/
    //1d. addNama(nama)
    //untuk menambahkan nama ke dalam list
    public void addNama(String nama){
        if(nama != null && !nama.isEmpty()){
            Lnama.add(nama);
            nbelm++;
        } else{
            System.out.println("Error: Nama tidak boleh kosong!");
        }
    }
    //1e. delNama(nama)
    //Menghapus nama dari list
    public boolean delNama(String nama){
        if(Lnama.remove(nama)){
            nbelm--;
            return true;
        }
        return false;
    }
    //1f. isMember(nama)
    //Mengecek apakah nama termasuk member
    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }
    //1g. gantiNama(nama, namabaru)
    //Mengganti nama menjadi nama baru
    public boolean gantiNama(String nama, String namabaru){
        int indeks = Lnama.indexOf(nama);
        if(indeks != -1){
            Lnama.set(indeks, namabaru);
            return true;
        }
        return false;
    }
    //1h. countNama(nama)
    //Menghitung banyaknya nama
    public int countNama(String nama){
        int count=0;
        for(String n : Lnama){
            if(n.equals(nama)){
                count++;
            }
        }
        return count;
    }
    //1i. showTeman()
    //Menampilkan semua nama teman
    public void showTeman(){
        if(nbelm==0){
            System.out.println("Tidak ada nama teman");
        } else{
            System.out.println("Daftar Teman: ");
            for(int i=0; i<nbelm; i++){
                System.out.println((i+1) + ". " + Lnama.get(i));
            }
        }
    }
} // end of class Teman
