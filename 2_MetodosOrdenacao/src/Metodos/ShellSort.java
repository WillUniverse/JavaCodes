package Metodos;

public class ShellSort {

    public static void shellSort(int[] n) {
        int h = n.length / 2;

        int aux, j;

        while (h > 0) {
            for (int i = h; i < n.length; i++) {
                aux = n[i];
                j = i;
                while (j >= h && n[j - h] > aux) {
                    n[j] = n[j - h];
                    j = j - h;
                }
                n[j] = aux;
            }
            h = h / 2;
        }
    }
}
