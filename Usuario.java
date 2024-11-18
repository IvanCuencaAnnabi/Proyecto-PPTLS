import java.util.Scanner;
public class Usuario implements Jugador{

    Scanner teclado= new Scanner(System.in);
    public String jugar(){
        System.out.println("Inserta tu jugada:");
        String jugada= teclado.nextLine();
        return jugada;
    }

}