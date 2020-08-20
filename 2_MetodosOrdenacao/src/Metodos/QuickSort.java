package Metodos;

public class QuickSort {

    public static void quicksort(int[] b, int ini, int fim) {
        int meio;
        if (ini < fim) {
            meio = separar(b, ini, fim);
            quicksort(b, ini, meio);
            quicksort(b, meio + 1, fim);

        }

    }

    public static int separar(int[] b, int ini, int fim) {
        int pivo, i;
        pivo = b[ini];

        for (i = ini + 1; i < fim; i++) {
            if (b[i] < pivo) {
                b[ini] = b[i];
                b[i] = b[ini + 1];
                ini++;
            }
        }
        b[ini] = pivo;
        return ini;
    }

}
