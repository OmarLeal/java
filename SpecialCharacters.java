public class SpecialCharacters {
    public static void main(String[] args) {
        String txt = "Omar Alejandro";
        //\'	'	Single quote
        System.out.println("Hola, \'Omar\'");
        System.out.println("\'" + txt + "\'");

        //\"	"	Double quote
        System.out.println("Hola, \"Omar\"");
        System.out.println("\"" + txt + "\"");

        //\\	\	Backslash
        System.out.println("Hola, \\Omar\\");
        System.out.println("\\" + txt + "\\");

        //\n	New Line
        System.out.println("Mi nombre es\nOmar");
        //\r	Carriage Return
        System.out.println("Mi nombre es\rOmar");
        //\t	Tab
        System.out.println("Mi nombre es\tOmar");
        //\b	Backspace
        System.out.println("Mi nombre es\bOmar");
        //\f	Form Feed
        System.out.println("Mi nombre es\fOmar");
        System.out.println("\fAlejandro");
        System.out.println("\fLeal");
    }
}
