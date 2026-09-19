import java.util.Scanner;

public class viagem{
public static void main(String[]args) {
 Scanner leia= new Scanner(System.in); 
 System.out.println("Digite o preco atual da viagem para a Alemanha:");
 
 double preco1=leia.nextDouble();

 System.out.println("Digite o preco atual da viagem para portugual:");

 double preco2=leia.nextDouble();

 System.out.println("Digite o preco atual da viagem para a viagem para a Italia:")

 double preco3=leia.nextDouble();

 System.out.println("Digite quantas pessoas vao para a Alemanha:");
 
 int pessoas1=leia.nextInt();

 System.out.println("Digite quantas pessoas vao para Portugual: ");

 int pessoas2=leia.nextInt();

 System.out.println("Digite quantas pessoas vao para a Italia:");

 int pessoas3=leia.nextInt();

 double total=(preco1 * pessoas1) +(preco2 * pessoas2) + (preco3 * pessoas3);

 System.out.println("O valor total da viagem:" + total);

}

}