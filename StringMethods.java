public class StringMethods {
    public static void main(String[] args){
        // STRING METHODS
        String txt = "omar alejandro";
        System.out.println(txt);

        //String length
        System.out.println("El length de la variable txt es: " + txt.length());

        //to UPPER CASE
        System.out.println(txt.toUpperCase());

        //to lower case
        System.out.println(txt.toLowerCase());

        //Finding a character in a String
        String request = "Please, locate where 'alejandro' occur: ";
        System.out.println(request);
        System.out.println(txt.indexOf("alejandro"));

        //String Concatenation
        String nombre, apellido;
        nombre = "John";
        apellido = "Smith";
        System.out.println("El nombre es: " + nombre + " y el apellido es: " + apellido);
        //Metodo concat()
        //No tienes tanto control, solo pega los valores de las dos variables
        System.out.println(nombre.concat(apellido)); 

        
    }
}
