public class latihansoalarray {
    public static void main(String[] args) {
          String [] NamaKota = new String [7];
        NamaKota[0] = "Jakarta";
        NamaKota[1] = "Bandung";
        NamaKota[2] = "Surabaya";
        NamaKota[3] = "Medan";
        NamaKota[4] = "Semarang";
        NamaKota[5] = "Palembang";
        NamaKota[6] = "Makassar";

        for (int i = 0; i < NamaKota.length; i++) {
            System.out.println("Kota ke-" + (i+1) + " : " + NamaKota[i]);

    }
}
}
