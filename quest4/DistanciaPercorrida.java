package quest4;

import java.text.DecimalFormat;

public class DistanciaPercorrida {

    public static void main(String[] args) {
        double horas = 60.0;
        double carroV = 110;
        double caminhaoV = 80;
        int distancia = 100;
        int atraso = 10;

        double tempoCaminhao = (distancia/caminhaoV) + (atraso / horas);
        caminhaoV = distancia / tempoCaminhao;

        double encontro = (carroV * distancia) / (carroV + caminhaoV);

        System.out.println(new DecimalFormat("O carro e o caminhão se encontraram no quilometro #,##0.00").format(encontro));


    }
}
