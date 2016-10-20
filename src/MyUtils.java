
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
            for (int i = cadena.length() - 1; i >= 0; i--) {
                resultat = resultat + cadena.charAt(i);
            }
            System.out.println(resultat);
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
        int dia, mes, any;
        int dia2, mes2, any2;

        if (day <= 0 || day > 31 || month <= 0 || month > 12) {

            return -2;

        } else {

            dia = (c1.get(Calendar.DATE));
            mes = (c1.get(Calendar.MONTH));
            any = (c1.get(Calendar.YEAR));

            dia2 = dia - day;
            mes2 = month - mes;
            any2 = any - year;

            if (any2 > 150) {
                resultat = -1;
            } else if (any2 <= 0) {
                resultat = -2;
            } else {
                resultat = any2;
            }

            return resultat;
        }
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static int factorial(int numero) throws noEntero{
        int factorial = 1;
        if (numero <= 0) {
            factorial = -1;
            return factorial;
        } else {
            for (int i = (int) numero; i > 0; i--) {
                factorial *= i;
            }
            System.out.println(factorial);
            return factorial;

        }
    }
}
