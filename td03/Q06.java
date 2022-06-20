package td03;

// 6ª) Escreva um método que recebe um array de inteiros A e devolve um array de boolean onde, cada posição indique true se o elemento da posição correspondente de A é positivo e false caso seja negativo ou zero.
public class Q06 {
    public static void main(String[] args) {
        int vetor[] = {1, 2, 3, 4, 5, -1, -2, -3, -4, -5};

        // Atribui o tamanho do vetorBool[] pelo tamanho do vetor[];
        boolean vetorBool[] = new boolean[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            // Dá print dos valores se for negativo ou positivo;
            System.out.println(i + "ª posição é " + (vetor[i] > 0));

            // Adiciona correspondentemente os valores 'true' ou 'false' a posição do vetorBool;
            vetorBool[i] = vetor[i] > 0;
        }
    }
}
