public class Variables {
    public static void main(String[] args){
        System.out.println("Variables");

        String nombre = "Variable tipo string";
        System.out.println("Esta es mi variable tipo String: " + nombre);
        int miNum = 33;
        System.out.println("Esta es mi variable tipo int: " + miNum);
        /* this will declare the variable as 
        "final" or "constant", which means 
        unchangeable and read-only*/
        final String miFinal = "HOLA!";
        System.out.println("Esta es mi variable tipo final: " + miFinal);
        float miFloat = 1.33f;
        System.out.println("Esta es mi variable tipo Float: " + miFloat);
        boolean miBool = true;
        System.out.println("Esta es mi variable tipo boolean: " + miBool);
        char miChar = 'D';
        System.out.println("Esta es mi variable tipo char: " + miChar);

        //Java type Casting

        //Widening Casting - Smaller to a larger type
        // byte -> short -> char -> int -> long -> float -> double

        int myInt = 9;
        double myDouble = myInt; //Automatic casting: int to double
        System.out.println(myInt);
        System.out.println(myDouble);

        //Narrowing Casting
        //double -> float -> long -> int -> char -> short -> byte
        myDouble = 9.68;
        myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);
        System.out.println(myInt);
    }
}