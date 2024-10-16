package metodosString;

public class Substring {
    public static void main(String[] args) {

        //substring( int ):
        // Devuelve una subcadena de la cadena actual, empezando por el índice indicado llegando hasta el final de la cadena.

        //substring( int, int ):
        // Devuelve una subcadena de la cadena actual, empezando por el primer índice indicado y llegando hasta el segundo índice o hasta el final de la cadena.

        String fra,fr="Es tan corto el amor y tan largo el olvido";
        int z =fr.indexOf(" "); //donde está primer espacio en blanco
        fra=fr.substring(0,z); //extrae texto de casilla 0 hasta casilla
        System.out.print("Primera palabra de la frase: \n\t \""+ fr+"");
        System.out.println(" es: \""+ fra+"\"");

    }
}
