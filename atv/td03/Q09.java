package td03;



// 9ª) Crie um método que recebe um array de inteiros positivos e substitui seus elementos de valor ímpar por -1 e os pares por +1.
public class Q09 {
    public static void main(String[] args) {
        double vetor[] = {2, 45, 2, 9, 8, 6, 4};



        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                vetor[i] = 1;
            }

            else {
                vetor[i] = -1;
            }
        }



        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
