package programapernas;

import java.util.Scanner;

public class ProgramaPernas {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Quantas pernas ?");
    int perna = teclado.nextInt();
    String tipo;
    System.out.print("Isso e uma -> ");

    tipo = switch (perna) {
      case 1 -> "Saci";
      case 2 -> "bipede";
      case 3 -> "Tripe";
      case 4 -> "Quadrupede";
      case 6 -> "Aranha";
      default -> "ET";
    };
    System.out.println(tipo);
  }
}
