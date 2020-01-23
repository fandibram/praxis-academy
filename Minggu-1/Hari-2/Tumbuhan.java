public class Tumbuhan{
    public String nama;
    public double tinggi;
    public String warna;
    public Tumbuhan(String a){
        nama=a;
    }
    public void aturTinggi(double b){
        tinggi=b;
    }
    public void aturWarna(String c){
        warna=c;
    }
    public void Tampil(){
        System.out.println("Nama = "+ nama);
        System.out.println("Tinggi = "+ tinggi);
        System.out.println("Warna = "+ warna);
    }
    public static void main(String[] args) {
        Tumbuhan obj=new Tumbuhan("Pisang");
        obj.aturTinggi(1.2);
        obj.aturWarna("Hijau");
        obj.Tampil();
    }
}

