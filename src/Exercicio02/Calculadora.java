//Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.

package Exercicio02;

import java.util.Scanner;


public class Calculadora {
    Scanner sc = new Scanner(System.in);

    void calcular (){
        System.out.println("Digite o numero que deseja dobrar");
        double numero = sc.nextDouble();

        double calcula = numero * 2;

        System.out.println("O dobro de " + numero + " É " + calcula);

    }





}
