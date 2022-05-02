package td05.Q01;

// 1ª) Uma classe Funcionário tem vários atributos privados. São eles: nome, idade, salario e comissão (%). Faça os métodos GETTERS e SETTERS dessa classe.
public class Funcionario
{
    private double salario, comissao;
    private String nome;
    private int idade;

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