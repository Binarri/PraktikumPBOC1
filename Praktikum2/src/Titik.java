/* Nama File    : Titik.java
   Deskripsi    : berisi atribut dan method dalam class Titik
   Pembuat      : Binar Ridha Wiritanaya
   Tanggal      : 26 Februari 2026
*/
public class Titik {
    /*************ATRIBUT********************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /***************METHOD******************/
    //konstruksi untuk membuat titik (0,0)
    // Titik(){
    //     absis = 0;
    //     ordinat = 0;
    //     counterTitik++;
    // }

    //konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    public Titik(){
        this(0,0);
    }

    //mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // void printCounterTitik(){
    //     System.out.println(this.counterTitik);
    // }

    public int getKuadran(){
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
    
    public double getJarakPusat(){
        return Math.sqrt((absis*absis)+(ordinat*ordinat));
    }

    public double getJarak(Titik T){
        return Math.sqrt(((absis- T.getAbsis())*(absis- T.getAbsis()))+((ordinat-T.getOrdinat())*(ordinat-T.getOrdinat())));
    }

    public void refleksiX(){
        ordinat = -ordinat;
    }

    public void refleksiY(){
        absis = -absis;
    }

    public Titik getRefleksiX(){
        Titik T2 = new Titik();
        T2.setAbsis(absis);
        T2.setOrdinat(ordinat * -1);
        return T2;
    }

    public Titik getRefleksiY(){
        Titik T2 = new Titik();
        T2.setAbsis(absis * -1);
        T2.setOrdinat(ordinat);
        return T2;
    }

} //end class Titik


