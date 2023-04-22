package quest5;

import java.util.Scanner;

public class InvertendoStrings {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = entrada.nextLine();
        texto = reverter(texto);


        System.out.println(texto);

        entrada.close();
    }

        public static String reverter(String texto)
        {
            if (texto == null || texto.equals("")) {
                return texto;
            }
            int n = texto.length();
            char[] temp = new char[n];
            for (int i = 0; i < n; i++) {
                temp[n - i - 1] = texto.charAt(i);
            }
            return String.copyValueOf(temp);
        }
}
