public class Recursion {
    //Recursion es la tecnica para que una funcion se llame por si misma.
    
    public static int SumaDosValores(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args){
        int resultado = SumaDosValores(10, 3);
        System.out.println(resultado);
    }
}
