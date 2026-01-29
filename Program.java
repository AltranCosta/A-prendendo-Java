import java.util.Locale;
import java.util.Scanner;

public class Program  {
     public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);
         System.out.println("Quantidade de minutos gasto no mês: ");
         int minuto = sc.nextInt();

         double conta = 50.0;
         if(minuto > 100){
             conta += (minuto - 100) * 2.0;// foi adicionado operador de atribuição +=
         }

         System.out.printf("Valor da Conta é : %.2f%n", conta);
         sc.close();
    }
}