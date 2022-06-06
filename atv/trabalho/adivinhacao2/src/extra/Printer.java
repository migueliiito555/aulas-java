package extra;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Printer
{
    public static void print(String s, int vezes, boolean pularLinha, boolean colorir)
    {
        if (pularLinha)
        System.out.println();

        for (int i = 0; i <= Math.abs(vezes); i++)
        if (colorir)
        System.out.print(Cor.colorir(s));
        
        else
        System.out.print(s);

        if (pularLinha)
        System.out.println();
    }
    
    public static String desacentuar(String s)
    {
        String n = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern p = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        
        return p.matcher(n).replaceAll("");
    }
}
