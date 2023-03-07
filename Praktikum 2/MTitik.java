/**
Pembuat : Silvira Nabila Anggita Giraldi
NIM : 24060121120011
Tanggal : 22 Februari 2023
Deskripsi : kelas yang berisi program utama yang memanfaatkan kelas Titik
Lab : B1
**/ 
class MTitik
{
    public static void main(String[]args)
    {
        Titik t1 = new Titik();
        t1.setAbsis(1.0);
        t1.setOrdinat(2.0);

        Titik t2 = new Titik();
        t2.setAbsis(3.0);
        t2.setOrdinat(4.0);

        Titik t3 = new Titik(5.0, 6.0);

        int counterTitik = t1.getCounterTitik();

        System.out.println("Jumlah objek titik" + counterTitik);
        System.out.println("t1("+t1.getAbsis()+"," + t1.getOrdinat() + ")");
        System.out.println("t2("+t2.getAbsis()+"," + t2.getOrdinat() + ")");
        System.out.println("counter titik = "+t1.getCounterTitik());

	OperasiTitik op = new OperasiTitik();
	op.refleksiSumbuX(t1);
	System.out.println("t1.x setelah refleksi X= "+ t1.getAbsis());
	System.out.println("t1.y setelah refleksi X= "+ t1.getOrdinat());
    }
}
