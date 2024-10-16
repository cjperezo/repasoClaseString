package metodosString;

public class CompareTo {
    public static void main(String[] args) {
        //Devuelve un entero menor que cero si el String es alfabéticamente menor que la dada como argumento,
        // cero si los dos String son léxicamente iguales y un entero mayor que cero si el String es mayor.

        //Compare To
        String a="gato", b="perro", c="GATO";
        int z=a.compareTo(b);
        int p=b.compareTo(a);
        int q=a.compareToIgnoreCase(c);

        //Compare To Ingnore Case
        String te1= "Hola";
        String te2= "hola";
        if(te1.compareToIgnoreCase(te2) == 0)
            System.out.println("los textos son iguales");
        else
            System.out.println("los textos son distintos");

    }
}
