package td01;



import java.util.Scanner;



/* 11ª) As organizações CSM resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.
 * 
 * a. Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual;
 * b. Salários até R$ 280,00 (incluindo): aumento de 20%;
 * c. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
 * d. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
 * e. Salários de R$ 1500,00 em diante: aumento de 5%
 *
 * Após o aumento ser realizado, informe na tela:
 * a. O salário antes do reajuste;
 * b. O percentual de aumento aplicado;
 * c. O valor do aumento;
 * d. O novo salário, após o aumento.
 */
public class Q11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.print("Digite seu salário atual: R$");
        double salBruto = teclado.nextDouble();
        double salLiq = salBruto, porc;



        teclado.close();



        // Porcentagem pra reajuste;
        if (salBruto <= 280) {
            porc = 0.2;
        }

        else if (salBruto <= 700) {
            porc = 0.15;
        }

        else if (salBruto <= 1500) {
            porc = 0.10;
        }

        else {
            porc = 0.5;
        }
        salLiq += salLiq * porc;



        System.out.println("\nSalário antes do reajuste: R$" + salBruto);
        System.out.println("Porcentual do reajuste: " + (porc * 100) + "%");
        System.out.println("Valor do aumento: R$" + (salLiq - salBruto));
        System.out.println("Novo salário: R$" + salLiq);
    }
}
