
package Metodos;


import java.io.*;

public final class Console {

    public static int leInt() {
        try {
            BufferedReader entra = new BufferedReader(new InputStreamReader(System.in));
            String s = entra.readLine();
            return Integer.parseInt(s);
        } catch (IOException ex) {
            System.out.println("ERRO NA ENTRADA !");
            System.exit(0);
            return 0;
        } catch (NumberFormatException ex) {
            System.out.print("Entrada inválida !");
            System.exit(0);
            return 0;
        }
    }
}
