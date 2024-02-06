public class ArraysMultidimensionales {
    public static void main(String[] args){
        String[][] carros = {{"Tesla", "Ford"}, {"Blanco", "Azul"}};
        System.out.println("El valor de [0][0] es: " + carros[0][0]);
        
        //Iterar un arreglo multidimensional (Doble for loop)
        for(int a = 0; a < carros.length; a++){            
            for(int b = 0; b < carros[a].length; b++){
                System.out.println("El valor de a es: " + a);
                System.out.println("El valor de b es: " + b);
                System.out.println(carros[a][b]);
            }
        }
    }
}
