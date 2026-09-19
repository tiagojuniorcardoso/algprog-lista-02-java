import java.util.Scanner;

public class Contas{
public static void main(String[]args);{ 
Scanner leia = new Scanner(System.in);

System.out.println("Digite dois numeros:");

int numero1= leia.nextInt();

int numero2 =leia.nextInt();

int soma= numero1 + numero2;
int subtracao= numero1- numero2;
int multiplicacao= numero1 * numero2;
System.out.println("Soma:" + soma);
System.out.println("Subtracao:" + subtracao);
System.out.println("Multiplicacao:"+ multiplicacao);

}

}