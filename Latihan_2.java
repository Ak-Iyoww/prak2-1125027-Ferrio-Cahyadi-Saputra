abstract class Hewan {
    String Name;
    int Age;
    String food;

    public Hewan(String NamaHewan, int Umur, String Makanan) {
        this.Name = NamaHewan;
        this.Age = Umur;
        this.food = Makanan;
    }
    
    public void setName(String NamaHewan) {
        this.Name = NamaHewan;
    }

    public void setAge(int Umur) {
        this.Age = Umur;
    }

    public void setFood(String Makanan) {
        this.food = Makanan;
    }

    public String getName() {
        return Name;
    }
    
    public int getAge() {
        return Age;
    }

    public String getFood() {
        return food;
    }

    abstract String PrintSound();

    public String PrintData() {
        return "Nama : " + Name + "\nUmur : " + Age + "\nMakanan : " + food;
    }
}

abstract class HewanDarat extends Hewan {
    int NumberOfLegs;
    public HewanDarat(String NamaHewan, int Umur, String Makanan, int JumlahKaki) {
        super(NamaHewan, Umur, Makanan);
        this.NumberOfLegs = JumlahKaki;
    }

    public void move() {
       System.out.println("Bergerak dengan jalan / lari");
    }

    @Override
   public String PrintData () {
        return super.PrintData() + "\nJumlah kaki : " + NumberOfLegs;
    }
}

class Anjing extends HewanDarat{
    public Anjing (String NamaHewan, int Umur, String Makanan, int JumlahKaki) {
    super(NamaHewan, Umur, Makanan, JumlahKaki);    
    }
    
    @Override
    public String PrintSound() {
        return "guk guk";
    }

    @Override
    public String PrintData() {
        return super.PrintData() + "\nJenisnya : Anjeng";
    }
}

class Kucing extends HewanDarat{
    public Kucing (String NamaHewan, int Umur, String Makanan, int JumlahKaki) {
    super(NamaHewan, Umur, Makanan, JumlahKaki);    
    }
    
    @Override
    public String PrintSound() {
        return "MIAWW MIIIIIIAAAAW";
    }

     @Override
    public String PrintData() {
        return super.PrintData() + "\nJenisnya : kuceng";
    }
}

class Tikus extends HewanDarat{
    public Tikus (String NamaHewan, int Umur, String Makanan, int JumlahKaki) {
    super(NamaHewan, Umur, Makanan, JumlahKaki);    
    }
    
    @Override
    public String PrintSound() {
        return "ini uang tutup mulutnya ya";
    }
    
     @Override
    public String PrintData() {
        return super.PrintData() + "\nJenisnya : tikus kantor";
    }
}

abstract class HewanLaut extends Hewan {
    Double Depth;
    public HewanLaut(String NamaHewan, int Umur, String Makanan, Double Kedalaman) {
        super(NamaHewan, Umur, Makanan);
        this.Depth = Kedalaman;
    }

    @Override
   public String PrintData () {
        return super.PrintData() + "\nKedalaman : " + Depth;
    }
}

class Hiu extends HewanLaut {
    public Hiu (String NamaHewan, int Umur, String Makanan, double Kedalaman) {
        super(NamaHewan, Umur, Makanan, Kedalaman);
    }

    @Override
    public String PrintSound(){
        return "a";
    }

    @Override
    public String PrintData() {
        return super.PrintData() + "\nJenisnya : Hiu";
    }
}
class Ikan extends HewanLaut {
    public Ikan (String NamaHewan, int Umur, String Makanan, double Kedalaman) {
        super(NamaHewan, Umur, Makanan, Kedalaman);
    }

    @Override
    public String PrintSound(){
        return "blup blup";
    }

    @Override
    public String PrintData() {
        return super.PrintData() + "\nJenisnya : Ikan";
    }
}
class Paus extends HewanLaut {
    public Paus (String NamaHewan, int Umur, String Makanan, double Kedalaman) {
        super(NamaHewan, Umur, Makanan, Kedalaman);
    }

    @Override
    public String PrintSound(){
        return "nggggguuuuuuk";
    }
    @Override
    public String PrintData() {
        return super.PrintData() + "\nJenisnya : Paus";
    }
}

abstract class HewanTerbang extends Hewan {
    Double Wingspan;
    public HewanTerbang(String NamaHewan, int Umur, String Makanan, Double LebarSayap) {
        super(NamaHewan, Umur, Makanan);
        this.Wingspan = LebarSayap;
    }

    @Override
    public String PrintData () {
        return super.PrintData() + "\nLebar Sayap : " + Wingspan;
    }
}

class Bebek extends HewanTerbang {
    public Bebek (String NamaHewan, int Umur, String Makanan, Double LebarSayap) {
    super(NamaHewan, Umur, Makanan, LebarSayap);
    }

    @Override
    public String PrintSound(){
        return "Kwek kwek";
    }

    @Override
    public String PrintData() { 
        return super.PrintData() + "\nJenisnya : Bebek";
    }
}

class Elang extends HewanTerbang {
    public Elang (String NamaHewan, int Umur, String Makanan, Double LebarSayap) {
    super(NamaHewan, Umur, Makanan, LebarSayap);
    }

    @Override
    public String PrintSound(){
        return "Americaaaa RAAHHHHHHHHH";
    }

    @Override
    public String PrintData() {
        return super.PrintData() + "\nJenisnya : Elang";
    }
}

class Burung extends HewanTerbang {
    public Burung (String NamaHewan, int Umur, String Makanan, Double LebarSayap) {
    super(NamaHewan, Umur, Makanan, LebarSayap);
    }

    @Override
    public String PrintSound(){
        return "cicit cicit cuit";
    }
    @Override
    public String PrintData() {
        return super.PrintData() + "\nJenisnya : Burung pipit";
    }
}

public class Latihan_2 {
    public static void main(String[] args) {
       Hewan[] daftarHewan = new Hewan[] {
        new Anjing("Doggy", 3, "Tulang", 4),
        new Kucing("Milo", 2, "Ikan", 4),
        new Tikus("Jerry", 1, "Keju", 4),
        new Ikan("Nemo", 1, "Plankton", 15.0),
        new Hiu("Megalo", 10, "Daging", 500.0),
        new Paus("Bluey", 20, "Krill", 1000.0),
        new Burung("Pipit", 1, "Biji-bijian", 0.2),
        new Elang("Garuda", 5, "Daging", 2.1),
        new Bebek("Donald", 2, "Dedak", 0.8)
        };
        
        for (Hewan h : daftarHewan) {
        System.out.println(h.PrintData());
        System.out.println("Suara : " + h.PrintSound());
        System.out.println("----------------------------------------");
        };
    }
}
    

