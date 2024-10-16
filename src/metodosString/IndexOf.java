package metodosString;

public class IndexOf {
    public static void main(String[] args) {
        //Index Of (char ch)
        //Devuelve el índice de primera posición de ch, comenzando la búsqueda de la posición cero .
        // Devolverá -1 si no se encuentra lo buscado

        String t = "Esto es un ejemplo";
        System.out.print("Primera posicion del caracter \"e\" en \""+t);
        System.out.println("\" es:" +t.indexOf('e'));

        // indexOf(char ch, int start):
        // Retorna el índice de la primera posición de ch comenzando la búsqueda de la posición start.
        // Devolverá -1 si no se encuentra lo buscado

        t = "Esto es un ejemplo";
        System.out.print("Primera posición del carácter \"e\" en \""+t);
        System.out.println("\"\n comenzando a buscar desde la 6 es: ");
        System.out.println(t.indexOf('e',6));

        //indexOf(String str):
        // Retorna el índice de donde encuentra  la primera vez el String str,
        // comenzando la búsqueda en la posición 0. Si no lo encuentra, retorna -1.

        t = "Mi mami me mima a mi";
        System.out.println("Primera posición del texto \"mi\" en \""+t);
        System.out.print("\"comenzando la búsqueda de posición 0 ");
        System.out.println("es:" +t.indexOf("mi"));



    }
}
