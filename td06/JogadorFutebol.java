package td06;

// 3ª) Crie uma classe para representar um jogador de futebol, com os atributos nome, posição, data de nascimento, nacionalidade, altura e peso. Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos os dados do jogador. Crie um método para calcular a idade do jogador e outro método para mostrar quanto tempo falta para o jogador se aposentar. Para isso, considere que os jogadores da posição de defesa se aposentam em média aos 40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35.
public class JogadorFutebol
{
    private String nome, nac, pos;
    private double peso, altura;
    private int nasc;

    // Construtor
    public JogadorFutebol(String nac, String nome, String pos, double altura, double peso, int nasc)
    {
        setNac(nac);
        setNome(nome);
        setPos(pos);
        setAltura(altura);
        setPeso(peso);
        setNasc(nasc);
    }

    // Getters
    public String getNac() { return nac; }
    public String getNome() { return nome; }
    public String getPos() { return pos; }
    public double getAltura() { return altura; }
    public double getPeso() { return peso; }
    public int getNasc() { return nasc; }

    // Setters
    public void setNac(String nac) { this.nac = nac; }
    public void setNome(String nome) { this.nome = nome; }
    public void setPos(String pos) { this.pos = pos; }
    public void setAltura(double altura) { this.altura = altura; }
    public void setPeso(double peso) { this.peso = peso; }
    public void setNasc(int nasc) { this.nasc = nasc; }

    // Métodos
    // Printa todos os dados do jogador.
    public void mostrarDados()
    {
        System.out.println("Nome: " + getNome());
        System.out.println("Nascionalidade: " + getNac());
        System.out.println("Nascimento: " + getNasc());
        System.out.println("Idade: " + calcularIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Posição: " + getPos());
    }

    // Retorna a idade.
    public int calcularIdade() { return 2022 - getNasc(); }

    // Printa o tempo até o jogador se aposentar.
    public void aposentarQuando()
    {
        int aposenta = 0;

        // Decide a idade necessária para aposentar.
        switch (getPos())
        {
            case "Defesa":
                aposenta = 40;
                break;

            case "Meio-Campo":
                aposenta = 38;
                break;

            case "Atacante":
                aposenta = 35;
                break;
        }

        // Realiza o objetivo.
        if (calcularIdade() < aposenta) System.out.println("Aposentará daqui à " + (aposenta - calcularIdade()) + ".");
        else System.out.println("Já está aposentado, velhote!");
    }
}
