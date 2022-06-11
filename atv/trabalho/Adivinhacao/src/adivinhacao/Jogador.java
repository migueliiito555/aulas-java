package adivinhacao;

public class Jogador
{
    private int vidas = 5, pontos = 0, pulos = 3;
    private String nome = "J1";

    // Setters
    public void setVidas(int vidas)
    { this.vidas = vidas; }

    public void setPulos(int pulos) 
    { this.pulos = pulos; }

    public void setPontos(int pontos) 
    { this.pontos = pontos; }
    
    public void setNome(String nome)
    { this.nome = nome; }

    // Getters
    public int getPontos() 
    { return pontos; }

    public int getPulos() 
    { return pulos; }
    
    public int getVidas() 
    { return vidas; }
    
    public String getNome()
    { return nome; }
    
    // Métodos
    public void alterarPontos(int pontos)
    { setPontos(getPontos() + pontos); }
    
    public void alterarVidas(int vidas)
    { setVidas(getVidas() + vidas); }
    
    public void alterarPulos(int pulos)
    { setPulos(getPulos() + pulos); }
}
