package td05.Q04;

/* 4ª) Crie uma classe Retangulo, nela adicione dois atributos: lado 1 e lado 2. Adicione outro atributo chamado área. Os dois primeiros poderão ser passados por construtor, ou não, ou acessados métodos GETTERS e SETTERS. Crie um outro método chamado calcular área. Este método não recebe nada, apenas retorna o valor da área já calculado.

OBS: Área Retângulo = lado 1 x lado 2. */
public class Retangulo {
    private double lado1, lado2, area;

    // Construtor
    public Retangulo(double lado1, double lado2)
    {
        setLado1(lado1);
        setLado2(lado2);
        setArea(lado1 * lado2);
    }

    // Getters
    public double getLado1() { return lado1; }
    public double getLado2() { return lado2; }
    public double getArea() { return area; }

    // Setters
    public void setLado1(double lado1) { this.lado1 = lado1; }
    public void setLado2(double lado2) { this.lado2 = lado2; }
    public void setArea(double area) { this.area = area; }

    // Métodos
    public double calcularArea() { return getArea(); }
}
