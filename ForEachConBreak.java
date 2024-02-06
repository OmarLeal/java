public class ForEachConBreak {
    public static void main(String[] args) {
        String[] juegos = {"Mario Bros", "Zelda", "Street Fighter", "Mortal Kombat"};
        for(String i : juegos){
            if(i == "Zelda"){
                System.out.println(i);
                break;
            } //Juego a encontrar
            System.out.println("No es este...");
        }
    }
}
