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
        System.out.println("nama = "+ nama);
        System.out.println("tinggi = "+ tinggi);
        System.out.println("warna = "+ warna);
    }
    public static void main(String[] args) {
        Tumbuhan obj=new Tumbuhan("Pisang");
        obj.aturTinggi("1,2");
        obj.aturWarna("hijau");
        obj.Tampil();
    }
}