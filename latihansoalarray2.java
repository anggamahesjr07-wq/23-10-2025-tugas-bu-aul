public class latihansoalarray2 {
    public static void main(String[] args) {
          String [] MataPelajaran = new String [6];
        MataPelajaran[0] = "Matematika";
        MataPelajaran[1] = "Bahasa Indonesia";
        MataPelajaran[2] = "Bahasa Inggris";
        MataPelajaran[3] = "Fisika";
        MataPelajaran[4] = "Kimia";
        MataPelajaran[5] = "Biologi";
        int angka = 0;
    

        for (int i = 0; i < MataPelajaran.length; i++) {
            angka++;
            System.out.println("Mata Pelajaran ke-" + angka + " : " + MataPelajaran[i]);
    }
}
}