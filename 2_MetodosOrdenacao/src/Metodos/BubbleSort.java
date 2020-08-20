package Metodos;

public class BubbleSort {

    public static void bubblesort(int t[]) {
        for (int ultelemento = t.length - 1; ultelemento > 0; ultelemento--) {
            for (int i = 0; i < ultelemento; i++) {
                if (t[i] > t[i + 1]) {
                    trocarBubble(t, i, i + 1);
                }
            }
        }
    }

    public static void trocarBubble(int[] t, int i, int j) {
        int aux = t[i];
        t[i] = t[j];
        t[j] = aux;
    }
}
