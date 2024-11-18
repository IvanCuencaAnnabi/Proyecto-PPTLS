public abstract class Comparador{
    
    public static String jugadasPosibles[] ={"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};

    public static String comparar(String jugada1, String jugada2){
        if(!validar(jugada1)){
            return "Selecciona una jugada válida";
        }
        String resultado=comparadorJugadas(jugada1, jugada2);
        return resultado;
    }

    private static boolean validar(String jugada){
        boolean validado=false;
        for(int i = 0; i<jugadasPosibles.length; i++){
            if(jugada.equals(jugadasPosibles[i])){
                validado=true;
            }
        }
        if(validado==false)
            throw new IllegalArgumentException();
        return validado;
    }

    private static String comparadorJugadas(String jugada1, String jugada2){
        String resultado;
        if (jugada1.equals(jugada2)) {
            resultado= "empata";
        }else{
            if (jugada1 .equals( "Piedra")) {
                if(jugada2.equals( "Tijera") || jugada2.equals("Lagarto")){
                    resultado="gana";
                }
                else
                    resultado="pierde";
            }
            else if(jugada1.equals( "Papel")){
                if(jugada2.equals( "Spock") || jugada2.equals("Piedra")){
                    resultado="gana";
                }
                else
                    resultado="pierde";
            }
            else if(jugada1.equals( "Tijera")){
                if(jugada2.equals( "Papel") || jugada2.equals("Lagarto")){
                    resultado="gana";
                }
                else
                    resultado="pierde";
            }
            else if(jugada1.equals( "Lagarto")){
                if(jugada2.equals( "Spock" )|| jugada2.equals("Papel")){
                    resultado="gana";
                }
                else
                    resultado="pierde";
            }else{
                if(jugada2.equals( "Piedra") || jugada2.equals("Tijera")){
                    resultado="gana";
                }
                else
                    resultado="pierde";
            }
        }
        return jugada1 + " "+ resultado+ " contra "+ jugada2;  
    }
}