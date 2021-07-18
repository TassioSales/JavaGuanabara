package teste_contador;



public class cont {
  public static void main(String[] args) {
      int cc = 0;
      while(cc < 10){
          cc++;
          if(cc == 1 || cc == 2 || cc == 3 ){
              continue;
          }
          System.out.println("Cambalhota " + cc);

          if(cc == 9){
              break;
          }
      }
  }
}
