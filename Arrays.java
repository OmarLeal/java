public class Arrays {
    public static void main(String[] args) {
        //Arrays con diferentes tipos de dato

        String[] colores = {"Amarillo", "Blanco", "Rojo"};
        int[] numeros = {10, 20, 30, 40, 50};

        //Acceder a un valor de nuestro array en especifico.
        System.out.println("Accediendo a un valor del array colores: " + colores[1]);
        System.out.println("Accediendo a un valor del array numeros: " + numeros[2]);

        //Cambiamos el primer valor de los arrays respectivamente.
        colores[0] = "Negro";
        numeros[0] = 1000;

        //Iterar en los arrays con un for each
        for(String a : colores){
            System.out.println(a);
        }
        for(int i : numeros){
            System.out.println(i);
        }

        //Length de los arrays (Se empieza a contar desde el valor 1, no en 0)
        System.out.println("Este es el length del array colores: " + colores.length);
        System.out.println("Este es el length del aray numeros: " + numeros.length);

    }
}
