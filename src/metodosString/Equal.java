package metodosString;

public class Equal {
    public static void main(String[] args) {

        //-----------Metodo Equal------------------
        //Comprueba que dos instancias son iguales (devolviendo true o false).
        // En este caso comprueba que el objeto dado como argumento sea de tipo String
        // y contenga la misma cadena de caracteres que el objeto actual.

        String te1= "Hola";
        String te2= "hola";
        if(te1.equals(te2))
            System.out.println("los textos son iguales");
        else
            System.out.println("los textos son distintos");

        //--------------Método Equal Ingonre Case--------------
        //Es idéntico al anterior, pero ignora mayúsculas o minúsculas.

        String te3= "Hola";
        String te4= "hola";
        if(te3.equalsIgnoreCase(te4))
            System.out.println("los textos son iguales");
        else
            System.out.println("los textos son distintos");

    }
}
