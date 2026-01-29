import java.util.Locale;
import java.util.Scanner;

public class Program  {
     public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);
         System.out.println("Quantida de minutos gasto no mês: ");
         int minuto = sc.nextInt();

         double conta = 50.0;
         if(minuto > 100){
             conta = conta + (minuto - 100) * 2.0;
         }

         System.out.printf("Valor da Conta é : %.2f%n", conta);
         sc.close();
    }
}