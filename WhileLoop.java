public class WhileLoop {
    public static void main(String[] args){
        // WHILE LOOP
        /*
         * while(condition){
         * //code block to be executed
         * }
         */
        int i = 0;
        while(i <= 5){
            System.out.println(i);
            i++;
        }

        //DO WHILE
        int a = 0;
        do {
            System.out.println("\n" + a);
            a++;
        }while(a <= 5);
    }
}
