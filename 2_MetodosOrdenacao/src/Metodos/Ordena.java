package Metodos;

import static Metodos.BubbleSort.bubblesort;
import static Metodos.HeapSort.heapsort;
import static Metodos.QuickSort.quicksort;
import static Metodos.ShellSort.shellSort;


public class Ordena {

    public static void main(String Args[]) {
        int op = 0;
        int x = 0;
        while (true) {
            System.out.print("\n-----------------------------------------\n");
            System.out.print("                  MENU");
            System.out.print("\n-----------------------------------------\n");
            System.out.print("\nMétodos De Ordenação De Números Aleatórios:\n");
            System.out.println("1-Shell Sort");
            System.out.println("2-Quick Sort");
            System.out.println("3-Bubble Sort");
            System.out.println("4-Heap Sort");
            System.out.println("0-Sair");
            System.out.print("\nDigite sua escolha:");
            op = Console.leInt();

            switch (op) {
                case 0:
                    System.out.println("\nVocê escolheu sair do programa");
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("\nVocê escolheu o método Shell Sort.");
                    System.out.print("Escolha a quantidade de números aleatórios a serem ordenados: ");
                    x = Console.leInt();
                    int z[] = new int[x];

                    for (int i = 0; i < x; i++) {
                        z[i] = (int) (Math.random() * 100);
                    }
                    System.out.print("\nNúmeros Desordenados:\n");
                    for (int i = 0; i < x; i++) {
                        System.out.println((i + 1) + "º Elemento: " + z[i]);
                    }

                    System.out.print("\nNúmeros Ordenados:\n");
                    shellSort(z);
                    for (int i = 0; i < x; i++) {
                        System.out.println((i + 1) + "º Elemento: " + z[i]);
                    }

                    break;

                case 2:
                    System.out.print("\nVocê escolheu o método QuickSort.\n");
                    System.out.print("Escolha a quantidade de números aleatórios a serem ordenados: ");
                    x = Console.leInt();

                    int b[] = new int[x];

                    for (int i = 0; i < x; i++) {
                        b[i] = (int) (Math.random() * 100);
                    }
                    System.out.print("\nNúmeros Desordenados:\n");
                    for (int i = 0; i < x; i++) {
                        System.out.println((i + 1) + "º Elemento: " + b[i]);
                    }

                    System.out.print("\nNúmeros Ordenados:\n");
                    quicksort(b, 0, b.length);
                    for (int i = 0; i < x; i++) {
                        System.out.println((i + 1) + "º Elemento: " + b[i]);
                    }

                    break;

                case 3:
                    System.out.print("\nVocê escolheu o método BubbleSort.\n");
                    System.out.print("Escolha a quantidade de números aleatórios a serem ordenados: ");
                    x = Console.leInt();

                    int t[] = new int[x];

                    for (int i = 0; i < x; i++) {
                        t[i] = (int) (Math.random() * 100);
                    }
                    System.out.print("\nNúmeros Desordenados:\n");
                    for (int i = 0; i < x; i++) {
                        System.out.println((i + 1) + "º Elemento: " + t[i]);
                    }

                    System.out.print("\nNúmeros Ordenados:\n");
                    bubblesort(t);
                    for (int i = 0; i < x; i++) {
                        System.out.println((i + 1) + "º Elemento: " + t[i]);
                    }
                    break;

                case 4:
                    System.out.print("\nVocê escolheu o método HeapSort.\n");
                    System.out.print("Escolha a quantidade de números aleatórios a serem ordenados: ");
                    x = Console.leInt();

                    int L[] = new int[x];

                    for (int i = 0; i < x; i++) {
                        L[i] = (int) (Math.random() * 30);
                    }
                    System.out.print("\nNúmeros desordenados:\n");
                    for (int i = 0; i < x; i++) {
                        System.out.println((i + 1) + "º Elemento: " + L[i]);
                    }

                    System.out.print("\nNúmeros ordenados:\n");
                    heapsort(L);
                    for (int i = 0; i < x; i++) {
                        System.out.println((i + 1) + "º Elemento: " + L[i]);
                    }
                    break;
                default:
                    System.out.print("\n\nOperação Inválida ! \n\n");

            }
        }

    }

}