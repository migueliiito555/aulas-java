package td01;



import java.util.Scanner;



// 3ª) Faça um programa que verifique (usando if e else) se uma letra digitada é “F” ou “M”. Conforme a letra escrever: F – Feminino, M- Masculino, Sexo inválido.
public class Q03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.print("Digite seu sexo (M/F): ");
        String sexo = teclado.nextLine().toUpperCase();



        teclado.close();



        switch (sexo) {
            case "M":
                System.out.println("Masculino.");
                break;

            case "F":
                System.out.println("Feminino.");
                break;

            default:
                System.out.println("[ERRO] " + sexo + " não existe!");
        }
    }
}
