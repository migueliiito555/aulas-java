package td06;

/* 2ª) Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe deverá dispor dos seguintes métodos:


I. construtor: define a data que determinado objeto (através de parâmetro), este método verifica se a data está correta, caso não esteja a data é configurada como 01/01/0001

II. compara: recebe como parâmetro um outro objeto da Classe data, compare com a data corrente e retorne:
    - 0 se as datas forem iguais;
    - 1 se a data corrente for maior que a do parâmetro;
    - -1 se a data do parâmetro for maior que a corrente.

III. getDia: retorna o dia da data.

IV. getMes: retorna o mês da data.

V. getMesExtenso: retorna o mês da data corrente por extenso.

VI. getAno: retorna o ano da data.

VII. isBissexto: retorna verdadeiro se o ano da data corrente for bissexto, e retorna falso caso contrário.

VIII. clone: o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Data com os mesmos valores de atributos e retorna sua referência pelo método*/
public class Data
{
    private int dia = 1, mes = 1, ano = 1;

    // Construtor
    public Data(int dia, int mes, int ano)
    {
        if (mes > 0 && mes <= 12 && ano > 0 && dia > 0)
        {
            setMes(mes);
            setAno(ano);

            switch (getMes())
            {
                case 1, 3, 5, 7, 8, 10, 12:
                    if (dia <= 31)
                    setDia(dia);

                    break;

                case 2:
                    if (isBissexto(getAno()) && dia <= 29)
                    setDia(dia);

                    else if (dia < 29)
                    setDia(dia);

                    break;

                default:
                    if (dia <= 30)
                    setDia(dia);
            }
        }
    }

    // Setters
    public void setDia(int dia) { this.dia = dia; }
    public void setMes(int mes) { this.mes = mes; }
    public void setAno(int ano) { this.ano = ano; }

    // Getters
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAno() { return ano; }
    public String getMesExtenso()
    {
        String[] mesExtenso = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

        return mesExtenso[getMes() - 1];
    }

    // Métodos
    // Verifica se o ano é bissexto.
    public boolean isBissexto(int ano)
    {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 4 != 0 && ano % 400 == 0))
        return true;

        else
        return false;
    }

    // Compara as datas.
    public int compara(Data d)
    {
        // Tudo igual.
        if (d.getDia() == this.getDia() && d.getMes() == this.getMes() && d.getAno() == this.getAno())
        return 0;

        // Caso seja maior.
        else if (this.getAno() > d.getAno() || this.getAno() == d.getAno() && (this.getMes() > d.getMes() || (this.getMes() == d.getMes() && this.getDia() > d.getDia())))
        return 1;

        // Caso menor.
        else
        return -1;
    }

    // Retorna o próprio objeto.
    public Data clonar() { return this; }
}
