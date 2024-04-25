import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {12, 24, 12, 25, 36, 38, 25, 25, 12, 5,38};
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        int sayac = 1;
        for (int i = 0; i < dizi.length - 1; i++) {
            if (dizi[i] == dizi[i + 1]) {
                sayac++;
            } else {
                System.out.println(dizi[i]+" sayısı " + sayac + " kere tekrar edildi.");
                sayac =1;
            }
        }
        System.out.println(dizi[dizi.length - 1]+" sayısı " + sayac + " kere tekrar edildi.");
    }
}