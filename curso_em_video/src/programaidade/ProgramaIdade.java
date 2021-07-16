package programaidade;

import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int nasc = teclado.nextInt();
        int idade = 2021 - nasc;
        System.out.println("Sua idade e " + idade);
        if(idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
}
