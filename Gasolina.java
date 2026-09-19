import java.util.Scanner;

public class gasolina{
    public static void main(String[]args);{
     Scanner leia=new Scanner(System.in);
     System.out.println("Digite o preco da gasolina:");

     double precoG =leia.nextDouble();

     System.out.println("Digite quantos litros foram vendidos?");
     
     double litrosV=leia=nextDouble();

     double total= precoG * litrosV;

      System.out.printf("Total a pagar: R$ %.2f\n", total);

    }
}

