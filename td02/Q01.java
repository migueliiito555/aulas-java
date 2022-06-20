package td02;



import java.util.Scanner;



// 1ª) Faça um programa que receba um número e usando laços de repetição, calcule e mostre a tabuada;
public class Q01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        
        System.out.print("Digite um número: ");
        double num = teclado.nextDouble();
        
        
        
        teclado.close();
        
        
        
        System.out.println("\nLAÇO FOR:");
        for (int i = 0; i <= 10; ++i) {
            System.out.println(i + " + " + num + " = " + (i + num));
        }
        
        
        
        System.out.println("\nLAÇO WHILE:");
        int i = 0;
        while (i <= 10) {
            System.out.println(i + " + " + num + " = " + (i + num));
            i++;
        }
        
        
        
        System.out.println("\nLAÇO DO-WHILE:");
        i = 0;
        do {
            System.out.println(i + " + " + num + " = " + (i + num));
            i++;
        } while (i <= 10);
    }
}
