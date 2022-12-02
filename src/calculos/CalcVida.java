package calculos;

public abstract class CalcVida {
    

    public static int vida(int nivel, int modCon, String classe) {
        int vida = 0;

        if (classe == "Guerreiro" || classe == "Paladino" || classe == "Patrulheiro") {
            if (nivel == 1) {
             vida = 10 + modCon;
            } else if (nivel >= 2) {
                vida = (6 + modCon) * nivel;
            }
        } else if (classe == "Bárbaro") {
            if (nivel == 1) {
                vida = 12 + modCon;
            } else if (nivel >= 2) {
                vida = (8 + modCon) * nivel;
            }
        } else if (classe == "Bardo" || classe == "Bruxo" || classe == "Clérigo" || classe == "Druida" || classe == "Ladino") {
            if (nivel == 1) {
                vida = 8 + modCon;
            } else if (nivel >= 2) {
                vida = (5 + modCon) * nivel;
            }
        } else if (classe == "Feiticeiro" || classe == "Mago") {
            if (nivel == 1) {
                vida = 6 + modCon;
            } else if (nivel >= 2) {
                vida = (4 + modCon) * nivel;
            }
        }

        return vida;
        
    }

}

