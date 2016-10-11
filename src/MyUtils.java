
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lluis Classe de funcions pròpies utils.
 */
public class MyUtils {

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        String resultat = "";
        if (cadena == null) {
            return null;
        } else {
            for (int i = cadena.length() - 1; i > 0; i--) {
                resultat = resultat + cadena.charAt(i);
            }
            return resultat;
        }
    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat<150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edat(int day, int month, int year) {
        Calendar c1 = new GregorianCalendar();
        int resultat = 0;
        int dia = 0;
        int mes = 0;
        int any = 0;
        int dia2, mes2, any2;
        if ((day >= 1 && day <= 31) && (month >= 1 && month <= 12)) {
            dia = (c1.get(Calendar.DATE));
        mes = (c1.get(Calendar.MONTH));
        any = (c1.get(Calendar.YEAR));

        dia2 = dia - day;
        mes2 = mes - month;
        any2 = any - year;

        if (dia2 <= 0) {
            dia2 = 0 - dia2;
            mes2 -= 1;
        }
        if (mes2 <= 0) {
            any2 -= 1;
            mes += 12;
        }
        if (any2 > 150) {
            resultat = -1;
        } 
        
        } else {
            resultat = -2;
        }
        return resultat;
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(double numero) {
        int factorial = 1;
        if (numero <= 0) {
            return -1;
        } else {
            for (int i = (int) numero; i > 0; i--) {
                factorial *= i;
            }
            return factorial;

        }
    }
}
