class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;
    
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium (int jumlahKomputer,String namaWarnet,float hargaPerJam,boolean ruangPrivat){
        super(jumlahKomputer,namaWarnet,hargaPerJam);
        this.ruangPrivat = ruangPrivat;

    }
    

     // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    
    public void informasi() {
        super.informasi();
        if (ruangPrivat){
            System.out.println("Fasilitas ruang premium: ");
            System.out.println("ruangan AC pribadi");
            System.out.println("Sofa gaming exclusive");
            System.out.println("komputer spesifikasi tinggi ");
            System.out.println("koneksi internet dedicater 100Mbps ");
           
        }
        else System.out.println("fasilitas ruang standar :");
            System.out.println("ruangan gerah: ");
            System.out.println("sofa majapahit");
            System.out.println("komputer spesifikasi rendah");
            System.out.println("koneksi internet dedicater 1Mbps ");
    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Pesan(int nomorKomputer){
        System.out.println("memesan komputer nomor :");
    }
    public void TambahLayanan(String makanan){
        System.out.println("menambah layanan makanan:");
    }
    public void TambahLayanan(String makanan, String minuman){
        System.out.println("menambah layanan makanan:" + makanan + "dan minuman" + minuman);
    }

    
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    
}
