public class OverloadingMethod {

    /*
     * Overloading es usar varios metodos con el mismo nombre PERO
     * CON PARAMETROS DIFERENTES.
     */
    static int SumaEnteros(int a, int b){
        return a + b;
    }

    static double SumaEnteros(double a, double b){
        return a + b;
    }

    public static void main(String[] args){
        System.out.println(SumaEnteros(2, 2));
        System.out.println(SumaEnteros(12.50, 12.50));
    }
}
