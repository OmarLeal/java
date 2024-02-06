public class MethodsUsingParameters {
    static void Saludar(String nombre){
        System.out.println("Hola, " + nombre);
    }

    static void Suma(int a, int b){
        System.out.println(a + b);
    }

    static void NombreEdad(String nombre2, int edad){
        System.out.println("Hola, " + nombre2 + " tu edad es: " + edad);
    }

    //Usando RETURN en los metodos.
    static int EdadMas5(int edad2){
        return edad2 + 5;
    }

    public static void main(String[] args){
        Saludar("Omar");
        Saludar("Nohemy");
        Suma(2, 3);
        Suma(30, 70);
        NombreEdad("Esteban", 2);
        NombreEdad("Emiliano", 6);
        NombreEdad("Erick", 10);
        System.out.println(EdadMas5(5));
        System.out.println(EdadMas5(10));
        System.out.println(EdadMas5(15));
    }
}
