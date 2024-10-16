package metodosString;

public class Concat {
    public static void main(String[] args) {

        //Retorna un String que será de la unión del String y el parámetro.

        String t1="Esto en un ejemplo";
        String t2="HOLI";
        String t3=null;
        System.out.println("\""+t1+"\" unido con \""+t2+"\", resulta:");
        t3=t1.concat(t2);
        System.out.print(t3);

    }
}
