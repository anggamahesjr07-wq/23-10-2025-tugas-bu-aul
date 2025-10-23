public class latihansoalarray3 {
    public static void main(String[] args) {
           String [] NamaHewan  = new String [5];
        NamaHewan[0] = "Kucing";
        NamaHewan[1] = "Anjing";
        NamaHewan[2] = "Kelinci";
        NamaHewan[3] = "Burung";
        NamaHewan[4] = "Monyet";
        int nomor = 1;
        
        for (int i = 0; i < NamaHewan.length; i++) {
            System.out.println("Hewan ke-" + nomor + " : " + NamaHewan[i]);
            nomor++;
    }
}
}