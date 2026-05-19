// Nome: Gabriel Ramos da Silva
// Matrícula: 1252211621112

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double consumo;
        double total = 0;
        double maior = 0;
        double media;
        int quantidade = 0;

        System.out.print("Digite o consumo da maquina: ");
        consumo = teclado.nextDouble();

        while (consumo >= 0) {

            total = total + consumo;
            quantidade++;

            if (consumo > maior) {
                maior = consumo;
            }

            System.out.print("Digite o consumo da maquina: ");
            consumo = teclado.nextDouble();
        }

        if (quantidade > 0) {

            media = total / quantidade;

            System.out.println("\nConsumo total: " + total);
            System.out.println("Media de consumo: " + media);
            System.out.println("Maior consumo: " + maior);

            if (media > 500) {
                System.out.println("Atencao: Meta de sustentabilidade nao atingida");
            } else {
                System.out.println("Consumo dentro do limite operacional");
            }

        } else {
            System.out.println("Nenhum consumo foi digitado.");
        }

        teclado.close();
    }
}
