package es.ies.puerto.examen.logica.uno;

public class Pokemon {

    public Pokemon() {
        }

    float danio(String tipoAtacante, String tipoDefensor, int ataque, int defensa) {

        switch (tipoAtacante){

            case "Agua":
                return pokemonAgua(tipoAtacante,tipoDefensor,ataque,defensa);

            case "Fuego":
                return pokemonFuego(tipoAtacante,tipoDefensor,ataque,defensa);

            case "Planta":
                return pokemonPlanta(tipoAtacante,tipoDefensor,ataque,defensa);

            case "Electrico":
                return pokemonElectrico(tipoAtacante,tipoDefensor,ataque,defensa);
            default:
                System.out.println("No es un tipo de pokemon");
                break;
        }

         return 0f;
    }

    float ataque (int ataque,int defensa,float efectividad){

        return ((50 * ((float)ataque / defensa)) * efectividad);
    }

    float pokemonAgua(String tipoAtacane, String tipoDefensor, int ataque, int defensa){

        float resultado=0f;

        danioNulo(ataque,defensa);

        switch(tipoDefensor){

            case "Agua":case "Planta":
                resultado =  ataque(ataque,defensa,0.5f);
                break;
            case "Fuego":
                resultado =ataque(ataque,defensa,2f);
                break;

            case "Electrico":
                resultado =  ataque(ataque,defensa,1f);
                break;
       }

        return resultado;
    }
    float pokemonFuego(String tipoAtacante, String tipoDefensor, int ataque, int defensa){


        danioNulo(ataque,defensa);
        float resultado=0f;

        switch(tipoDefensor){

            case "Agua":
                resultado =  ataque(ataque,defensa,2);
                break;
            case "Fuego": case "Planta":
                resultado =ataque(ataque,defensa,0.5f);
                break;

            case "Electrico":
                resultado =  ataque(ataque,defensa,1f);
                break;
        }

        return resultado;
    }
    float pokemonPlanta(String tipoAtacante, String tipoDefensor, int ataque, int defensa){

        float resultado=0f;
        danioNulo(ataque,defensa);

        switch(tipoDefensor){

            case "Agua":case "Planta":
                resultado =  ataque(ataque,defensa,0.5f);
                break;

            case "Fuego":
                resultado=ataque(ataque,defensa,2);
                break;

            case "Electrico":
                resultado =  ataque(ataque,defensa,1f);
                break;
        }

        return resultado;
    }

    float pokemonElectrico(String tipoAtacante, String tipoDefensor, int ataque, int defensa){
        float resultado=0f;

        danioNulo(ataque,defensa);

        switch(tipoDefensor){

            case "Agua":case "Planta": case "Fuego":
                resultado =  ataque(ataque,defensa,1f);
                break;

            case "Electrico":
                resultado =  ataque(ataque,defensa,0.5f);
                break;
        }

        return resultado;
    }

    float danioNulo(int ataque, int defensa){
        if(ataque>100){
            return -1f;
        }else if(defensa>100){
            return -2f;
        }
        return 0f;
    }

}
