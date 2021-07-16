package podevotar;

import java.util.Scanner;

public class PodeVotar {

  public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      System.out.print("Digite a sua data de nascimento : ");
      int nasc = teclado.nextInt();
      int idade = 2021 - nasc;

      if(idade < 16){
        System.out.println("Não Vota");

      }else{
          if((idade >= 16 && idade <= 18) || (idade > 70)){
            System.out.println("E opcional");
          }else {
            System.out.println("E obrigatorio");
          }
      }
  }
}
