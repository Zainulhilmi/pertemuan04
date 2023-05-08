public class array2 {

    public static void main(String[] args) {
        
        // Membuat array kosong untuk nilai mahasiswa
        double[][] nilaimahasiswa = new double[5][30];
        
        // Mengisi array dengan nilai
        nilaimahasiswa[0][0] = 80;
        nilaimahasiswa[1][0] = 90;
        nilaimahasiswa[2][0] = 75;
        nilaimahasiswa[3][0] = 85;
        nilaimahasiswa[4][0] = 95;

       double[] bobot = new double [5];

        // Menampilkan nilai bobot
        nilaimahasiswa [4][0]= nilaimahasiswa[0][0] * bobot [0] +
        nilaimahasiswa[1][0]* bobot [1] +
        nilaimahasiswa[2][0]* bobot [2] +
        nilaimahasiswa[3][0]* bobot [3];

        System.out.println("Nilai Si Mahasiswa 1 :"+nilaimahasiswa[4][0]);
        nilaimahasiswa[0][1] = 80;
        nilaimahasiswa[1][1]= 90;
        nilaimahasiswa[2][1]= 75;
        nilaimahasiswa[3][1]= 85;
        nilaimahasiswa[4][1]= 95;

        nilaimahasiswa[4][1]  = 5;
        for (int i=0; i<=3; i++){
            nilaimahasiswa[4][1]+= nilaimahasiswa[i][1] * bobot[i];
        }
        System.out.println("Nilai Si Mahasiswa 2 :"+nilaimahasiswa[4][1]);

        double jumlahnilaiakhir = 0;
        for(int i=0; i<=3; i++){
        jumlahnilaiakhir += nilaimahasiswa[4][1];
    
    }
    System.out.println("Nilai Akhir :" + jumlahnilaiakhir);




        }
    }

