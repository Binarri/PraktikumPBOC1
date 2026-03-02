/* Nama File    : Titik.java
   Deskripsi    : berisi atribut dan method dalam class Titik
   Pembuat      : Binar Ridha Wiritanaya
   Tanggal      : 26 Februari 2026
*/
public class Titik {
    /*************ATRIBUT********************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /***************METHOD******************/
    //konstruksi untuk membuat titik (0,0)
    // Titik(){
    //     absis = 0;
    //     ordinat = 0;
    //     counterTitik++;
    // }

    //konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    Titik(){
        this(0,0);
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // void printCounterTitik(){
    //     System.out.println(this.counterTitik);
    // }

    int getKuadran(){
        if (absis > 0 && ordinat >0){
            return 1;
        } else if (absis <0 && ordinat >0){
            return 2;
        } else if(absis <0 && ordinat <0){
            return 3;
        } else if(absis>0 && ordinat <0){
            return 4;
        } else{
            return 0;
        }
    }
    
    double getJarakPusat(){
        return Math.sqrt((absis*absis)+(ordinat*ordinat));
    }

    double getJarak(Titik T){
        return Math.sqrt(((absis- T.getAbsis())*(absis- T.getAbsis()))+((ordinat-T.getOrdinat())*(ordinat-T.getOrdinat())));
    }

    void refleksiX(){
        ordinat = -ordinat;
    }

    void refleksiY(){
        absis = -absis;
    }

    Titik getRefleksiX(){
        Titik T2 = new Titik();
        T2.setAbsis(absis);
        T2.setOrdinat(ordinat * -1);
        return T2;
    }

    Titik getRefleksiY(){
        Titik T2 = new Titik();
        T2.setAbsis(absis * -1);
        T2.setOrdinat(ordinat);
        return T2;
    }

} //end class Titik


