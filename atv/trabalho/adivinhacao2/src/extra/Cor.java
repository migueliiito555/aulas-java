package extra;

public class Cor
{
    // Reset
    public static final String r = "\033[m";

    // Cores normais
    public static final String pr = "\033[0;30m";
    public static final String vr = "\033[0;31m";
    public static final String vd = "\033[0;32m";
    public static final String am = "\033[0;33m";
    public static final String az = "\033[1;34m";
    public static final String ro = "\033[0;35m";
    public static final String ci = "\033[0;36m";
    public static final String br = "\033[0;37m";

    // Cores em negrito
    public static final String npr = "\033[1;30m";
    public static final String nvr = "\033[1;31m";
    public static final String nvd = "\033[1;32m";
    public static final String nam = "\033[1;33m";
    public static final String nro = "\033[1;35m";
    public static final String nci = "\033[1;36m";
    public static final String nbr = "\033[1;37m";

    // Cores sublinhadas
    public static final String upr = "\033[4;30m";
    public static final String uvr = "\033[4;31m";
    public static final String uvd = "\033[4;32m";
    public static final String uam = "\033[4;33m";
    public static final String uaz = "\033[4;34m";
    public static final String uro = "\033[4;35m";
    public static final String uci = "\033[4;36m";
    public static final String ubr = "\033[4;37m";

    // Método para colorir uma string recebida.
    public static String colorir(String s)
    {
        String[] cor =
        {
            "\033[0;31m",
            "\033[0;32m",
            "\033[0;33m",
            "\033[1;34m",
            "\033[0;35m",
            "\033[0;36m",
            "\033[0;37m"
        };

        char[] letras = s.toCharArray();

        String colorido = "";

        for (int i = 0; i < letras.length; i++)
        colorido += cor[(int) Math.floor(Math.random() * 7)] + letras[i] + r;

        return colorido;
    }
}
