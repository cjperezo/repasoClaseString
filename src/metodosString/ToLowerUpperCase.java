package metodosString;

public class ToLowerUpperCase {
    public static void main(String[] args) {

        //Convierte al String en mayuscula
        String t = "taller de Programacion i";
        System.out.println(t);
        t = t.toUpperCase();
        System.out.println("Ahora en mayuscula: "+t);

        //Convierte al String en minuscula
        t= t.toLowerCase();
        System.out.println("Ahora el texto se imprime en minusculas asi: " + t);

    }
}
