mport java.util.Scanner;

public class Desconto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor da Compra: ");
        double compra = sc.nextDouble();

        double desconto = (compra > 20) ? compra * 0.1 : compra * 0.05;

        double valorCompra = compra - desconto;

        System.out.printf("O valor do desconto foi: %.2f%n", desconto);
        System.out.printf("Valor total da compra com desconto foi: %.2f%n", valorCompra);
        sc.close();
    }

}