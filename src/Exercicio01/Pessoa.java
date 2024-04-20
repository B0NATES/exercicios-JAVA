// Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.

package Exercicio01;

import java.util.Scanner;


public class Pessoa {
    String nome;
    int idade;

    void apresenta(){

        System.out.println("Olá " + nome + ", vi que você tem " + idade + " Anos");
    }

}