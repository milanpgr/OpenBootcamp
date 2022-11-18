package OBSesion2;
/*
En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:

String[] nombres = {"", "", "", ""}
 */
public class EjercicioSesion3 {

    public static void main(String[] args) {
        String nombre= "juan";
        String nombre2="carlos";
        String nombre3="gaviria";
        String nombre4="lopez";
        String[] nombres = new String[]{"juan"+ " carlos"+ " gaviria"+ " lopez"};

        for(int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);

        }

    }
}
