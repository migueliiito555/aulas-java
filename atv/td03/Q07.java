package td03;



// 7ª) Escreva um método que recebe um array de números e devolve a posição onde se encontra o maior valor do array. Se houver mais de um valor maior, devolver a posição da primeira ocorrência.
public class Q07 {
    public static void main(String[] args) {
        double vetor[] = {1, 2, 99, 4, 99};



        int pos = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[pos] < vetor[i]) {
                pos = i;
            }
        }



        System.out.print("O maior número é " + vetor[pos] + " e a posição é " + pos + ".");
    }
}