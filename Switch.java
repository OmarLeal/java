public class Switch {
    

public static void main(String[] args){
    int diaDeLaSemana = 10;

    switch (diaDeLaSemana) {
        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miercoles");
            break;
        case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
        default:
            System.out.println("DEFAULT");
            break;
    }
}
}