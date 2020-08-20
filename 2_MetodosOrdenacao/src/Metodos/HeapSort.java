package Metodos;

public class HeapSort {

    public static void heapsort(int[] L) {
        montarArvoreHeap(L);
        int v = L.length;
        for (int i = L.length - 1; i > 0; i--) {
            int aux = L[i];
            L[i] = L[0];
            L[0] = aux;
            ordenarArvore(L, 0, --v);
        }
    }

    public static void montarArvoreHeap(int[] L) {
        for (int posicao = (L.length - 1) / 2; posicao >= 0; posicao--) {
            ordenarArvore(L, posicao, L.length);
        }
    }

    public static void ordenarArvore(int[] L, int posicao, int tamanhoDoVetor) {
        int indiceFilhoUm = 2 * posicao + 1;
        int indiceFilhoDois = 2 * posicao + 2;

        if (indiceFilhoUm < tamanhoDoVetor) {
            if (indiceFilhoDois < tamanhoDoVetor) {
                if (L[indiceFilhoUm] < L[indiceFilhoDois]) {
                    indiceFilhoUm = indiceFilhoDois;
                }
            }
            if (L[indiceFilhoUm] > L[posicao]) {
                int aux = L[indiceFilhoUm];
                L[indiceFilhoUm] = L[posicao];
                L[posicao] = aux;

                ordenarArvore(L, indiceFilhoUm, tamanhoDoVetor);

            }

        }

    }

}
