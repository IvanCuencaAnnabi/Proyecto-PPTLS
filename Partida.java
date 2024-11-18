public class Partida{    
    private int indiceAlmacen=0;
    private String jugadasAlmacenadas[] = new String[5];
    
    public void jugar(){
        System.out.println("Jugadas posibles: Piedra, Papel, Tijera, Lagarto, Spock");
        Usuario j1= new Usuario();
        Maquina j2= new Maquina();
        for(int i=0; i<jugadasAlmacenadas.length; i++){
            String ronda=Comparador.comparar(j1.jugar(),j2.jugar());
            System.out.println(ronda);
            almacenar(ronda);
        }
        imprimirPartida();
    }
    private void imprimirPartida(){
        System.out.println("Resumen de partida: ");
        for(int j=0; j<jugadasAlmacenadas.length; j++){
            System.out.println("Ronda "+(j+1)+": "+jugadasAlmacenadas[j]);
        }
    }
    private void almacenar(String jugada){
        jugadasAlmacenadas[indiceAlmacen]=jugada;
        indiceAlmacen++;
        if(indiceAlmacen==5){
            indiceAlmacen=0;
        }
    }

}