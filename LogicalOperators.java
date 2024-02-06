public class LogicalOperators {
    public static void main(String[] args){
        // LOGICAL OPERATORS

        int x = 5;
        int y = 10;
        //&& 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
        if (x > 4 && y <= 10){
            System.out.println("Los criterios son correctos");
        }else{
            System.out.println("Los criterios son INCORRECTOS");
        }

        //|| 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
        if (x > 6 || y < 10){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }

        //!	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)
        System.out.println(!(x > 6 || y < 10));

    }
}
