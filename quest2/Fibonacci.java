package quest2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3 = 0, i;
        Scanner entrada = new Scanner(System.in);

        i = entrada.nextInt();
            while(i > n3){
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }

            if(i == 0) System.out.printf("O número %d está na sequência de Fibonacci", i);
            else if(i == n3) System.out.printf("O número %d está na sequência de Fibonacci", i);
            else System.out.printf("O número %d não está na sequência de Fibonacci", i);
            entrada.close();
    }
}
