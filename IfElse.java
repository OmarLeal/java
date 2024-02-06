public class IfElse {
    public static void main(String[] args){
        /*
         * EJEMPLO DE IF
         * if(condition){
         * //Block of code to be executed if the condition is true
         * }else{
         * //Block of code to be executed if the condition is false
         * }
         */
        int a, b, c, d;
        a = 2;
        b = 3;
        c = 4;
        d = 4;
        if(a > b || c < d){
            System.out.println("Las condiciones son CORRECTAS!");
        }else if(c == d){
            System.out.println("Las condiciones entraron en ELSE IF");
        }else{
            System.out.println("No se cumplio con ninguna condicion");
        }

        // VERSION  SIMPLE

        int edad = 33;
        String resultado = (edad > 18) ? "Mayor de eddad" : "menor de edad";
        System.out.println(resultado);

        //Otro ejemplo
        a = 5;
        b = 10;
        resultado = (a < b) ? "A es MAYOR" : "A es menor";
        System.out.println(resultado);
    }
}
