import java.util.Random;

public class Maquina implements Jugador{
    Random rand= new Random();
    public String jugar(){
        String jugada=Comparador.jugadasPosibles[rand.nextInt(Comparador.jugadasPosibles.length)];
        System.out.println("El rival ha elegido: "+jugada);
        return jugada;
    }
}