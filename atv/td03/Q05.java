package td03;



// 5ª) Crie um método que recebe um array de inteiros A e um valor inteiro X e retorna a quantidade de vezes que X aparece no array A.
public class Q05 {
    public static void main(String[] args) {
        int vetor[] = {1, 4, 76, 12938123, 2, 3, 5, 1, 1, 2, 1, 4, 1};
        int x = 1, qnt = 0;



        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                qnt++;
            }
        }



        System.out.println("O número " + x + " aparece " + qnt + " vezes!");
    }
}
