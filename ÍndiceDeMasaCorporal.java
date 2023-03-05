import java.util.Scanner;
public class ÍndiceDeMasaCorporal {
    public static void main(String[] args) throws Exception {

      Scanner sc = new Scanner(System.in);

      double ÍndiceDeMasaCorporal;

      System.out.println("Introdusca su peso: ");
      ÍndiceDeMasaCorporal = sc.nextDouble();

      if (ÍndiceDeMasaCorporal <=50) {
        System.out.println("Eres muy delgado");
      }
      else if (ÍndiceDeMasaCorporal >50 && ÍndiceDeMasaCorporal <=60) {
        System.out.println("Eres delgado");
      }
      else if (ÍndiceDeMasaCorporal >60 && ÍndiceDeMasaCorporal <=75) {
        System.out.println("Su índice de masa corporal es normal");
      }
      else {
        System.out.println("Eres gordo");
      }
    }
}