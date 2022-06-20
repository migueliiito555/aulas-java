package td05.Q03;

// 3ª) Utilize a classe Funcionário do exercício 1. Crie um construtor para cada atributo individual e também um que passe todos os atributos como parâmetro.
public class Funcionario
{
    private double salario, comissao;
    private String nome;
    private int idade;

    // Construtor
    public Funcionario(String nome, int idade, double salario, double comissao)
    {
        setNome(nome);
        setIdade(idade);
        setSalario(salario);
        setComissao(comissao);
    }

    // Getters
    public double getSalario()
    {
        return salario;
    }

    public double getComissao()
    {
        return comissao;
    }

    public String getNome()
    {
        return nome;
    }

    public int getIdade()
    {
        return idade;
    }

    // Setters
    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public void setComissao(double comissao)
    {
        this.comissao = comissao;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }
}
