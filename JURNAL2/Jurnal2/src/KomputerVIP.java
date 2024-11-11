class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean vipCard;
    
    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(int jumlahKomputer,String namaWarnet,float hargaPerJam, boolean vipCard){
        super(jumlahKomputer,namaWarnet,hargaPerJam);
        this.vipCard = vipCard; 

    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 

    public void informasi(){
        super.informasi();
        if (vipCard){
        System.out.println("Benefit member VIP: ");
        System.out.println("Diskon 10% untuk bermain diatas 3 jam");
        System.out.println("Gratis minuman setiap 4 jam bermain ");
        System.out.println("prioritas booking komputer gaming ");
       
    }
else {System.out.println("Jangan ngarep benefit:");   

}
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)

    public void login(String Username){
        System.out.println("login dengan username :");
    }
    public void bermain(int jam){
        System.out.println("bermain selama:" + jam );
    }
    public void bermain(int jam, int menit tambahan){
        System.out.println("menambah billing selama:" + jam + menit);
    }

    // To do: Buatlah method Login sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan

