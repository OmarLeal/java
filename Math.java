import static java.lang.Math.*;

public class Math {
    public static void main(String[] args){
        //MATH
        
        //Math max
        System.out.println(max(3,6));

        //Math min
        System.out.println(min(3,6));

        //Math sqrt
        System.out.println(sqrt(50));

        //Math abs (absolute positive)
        System.out.println(abs(-13.5));

        //Math Random
        System.out.println("Este es mi numero random: " + random());
        //Si queremos limitar el numero random tenemos que hacer lo siguiente:
        int randomNum = (int)(random() * 101);
        System.out.println("Mi numero entero random es: " + randomNum);
    }
}
