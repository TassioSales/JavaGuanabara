package tiposprimitivos;
import java.util.Scanner;

public class tiposPrimitivos {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.printf("Digite a nota do aluno %s: ", nome);
        float nota = teclado.nextFloat();

        System.out.printf("A nota de %s e %.2f", nome ,nota);

    }
}