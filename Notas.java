import java.util.Scanner;

public class Notasbimestrais{
    public static void main(String[] args);{
        Scanner leia= new Scanner(System.in);
        System.out.println("Digite suas notas bimestrais:")
        double nota1= leia.nextdouble();

        double nota2= leia.nextdouble();

        double nota3= leia.nextdouble();

         double nota4= leia.nextdouble();
         double media= (nota1+nota2+nota3+nota4)/4;
         System.out.println("Sua media final:" + media);
    }

}