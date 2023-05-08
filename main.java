public class main {
    public static void main(String[] args) {
        int isigelas = 0;
        int penuh = 225;

        System.out.println("Isi Gelas Sekarang :" + isigelas + " ml");
        System.out.println("Isi Gelas Ketika Penuh :" + penuh + " ml");
        while (isigelas != penuh) {
            isigelas++;
            System.out.println("Sedang Meingisi Gelas..");
            System.out.println("Isi Gelas Sekarang : " + isigelas + " ml");
        }
        System.out.println("Finale : Isi Gelas Sekarang : " + isigelas + " ml");
    }

}