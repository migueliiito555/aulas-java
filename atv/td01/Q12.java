package td01;



import java.util.Scanner;



/** 12ª) Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do salário bruto, mas não é descontado (é a empresa que deposita).
 * 
 * O salário líquido corresponde ao salário bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
 * 
 ***** Desconto do IR:
 * Salário Bruto ate R$900,00 (inclusive) – Isento;
 * Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
 * Salario bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
 * Salário bruto acima de 2500 – Desconto de 20%.
 * 
 * 
 ***** Imprima na tela as informações, dispostas conforme o exemplo abaixo, no exemplo valor da hora é 5 e a quantidade de horas é 220.  
 * Salário bruto (5 * 220)            R$    1100,00
 * ( – ) IR (5%)                      R$    0055,00
 * ( – ) INSS (10%)                   R$    0110,00
 * FGTS (11%)                         R$    0121,00
 * Total de descontos                 R$    0165,00
 * Salário Líquido                    R$    0935,00
 */
public class Q12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.print("Digite as horas trabalhadas: ");
        short h = teclado.nextShort();

        System.out.print("Digite o valor da hora: R$");
        double vl = teclado.nextDouble();



        teclado.close();



        double salBruto = vl * h, salLiq = salBruto, ir = 0, inss = 0.1 * salBruto;
        String espaco = "";



        // Verifica o desconto necessário de acordo com o salário;
        if (salBruto <= 1500) {
            ir = 0.05;
            espaco = " ";
        }

        else if (salBruto <= 2500) {
            ir = 0.1;
        }

        else {
            ir = 0.2;
        }



        salLiq *= 1 - ir;
        salLiq -= inss;



        // Agora mostra o valor de tudo;
        System.out.println("\nSalário Bruto:        R$" + salBruto);
        System.out.println("IR (" + (ir * 100) + "%):" + espaco + "           R$" + (ir * salBruto));
        System.out.println("INSS (10.0%):         R$" + inss);
        System.out.println("FGTS (11.0%):         R$" + (0.11 * salBruto));
        System.out.println("Total de descontos:   R$" + (salBruto - salLiq));
        System.out.println("Salário Líquido:      R$" + salLiq);
    }
}
