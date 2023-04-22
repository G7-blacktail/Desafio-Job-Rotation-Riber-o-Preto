package quest3;

import java.util.ArrayList;

public class SequenciaLogica {
    public static void main(String[] args) {
        System.out.println("Testando sequências lógicas");
        System.out.println("------------------------------------------");
        System.out.println("lógica a) ");

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(7);
        a.add(nextSequenceA(a.get(3)));

        System.out.println("O elemento do exercicio A é : " + a.get(4));
        System.out.println(a);

        System.out.println("------------------------------------------");
        System.out.println("lógicca b) ");

        ArrayList<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(4);
        b.add(8);
        b.add(16);
        b.add(32);
        b.add(64);
        b.add(nextSequenceB(b.get(5)));

        System.out.println("O elemento do exercicio B é : " + b.get(6));
        System.out.println(b);

        System.out.println("------------------------------------------");
        System.out.println("lógica c) ");

        ArrayList<Integer> c = new ArrayList<>();

        c.add(0);
        c.add(1);
        c.add(4);
        c.add(9);
        c.add(16);
        c.add(25);
        c.add(36);
        c.add(nextSequenceC(c.get(6)));

        System.out.println("O elemento do exercicio C é : " + c.get(7));
        System.out.println(c);

        System.out.println("------------------------------------------");
        System.out.println("lógica d) ");

        ArrayList<Integer> d = new ArrayList<>();

        d.add(4);
        d.add(16);
        d.add(36);
        d.add(64);
        d.add(nextSequenceD(d.get(3), d.get(2)));

       System.out.println("O elemento do exercicio D é : " + d.get(4));
        System.out.println(d);


        System.out.println("------------------------------------------");
        System.out.println("lógica e) ");

        ArrayList<Integer> e = new ArrayList<>();


        for(int i = 1; i < 8; i++){
            e.add(nextSequenceE(i));
        }

        System.out.println("O elemento do exercicio E é : " + e.get(6));
        System.out.println(e);

        System.out.println("------------------------------------------");
        System.out.println("lógica f) ");

        int[] f = {2, 10, 12, 16, 17, 18, 19, 200};

        System.out.println("O elemento do exercicio F é : 200, pois está sequência trata de números que iniciam com a letra D");
        for(int i = 0; i < f.length; i++){
        System.out.print(f[i] + " ");
        }




    }

    static int nextSequenceA(int index){
        return index + 2;
    }

    static int nextSequenceB(int index){
        return index * 2;
    }

    static int nextSequenceC(int index){
        int N = 0;
        int valoresImpares = 0;
        while(N != index){
            if(N == 0){
             N++;
             valoresImpares = 1;
            }
            else if(N > 0){
                valoresImpares= valoresImpares + 2;
                N = N + valoresImpares;
            }
        }
        return N + (valoresImpares + 2);
    }


    static int nextSequenceD(int index1, int index2){
        int razao = 8;
        int result = (index1 - index2) + razao + index1;
        return result;
    }

    static int nextSequenceE(int index){
        if(index < 2) return index;
        else return nextSequenceE(index - 1) + nextSequenceE(index - 2);
    }
}