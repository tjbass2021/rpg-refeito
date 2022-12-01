package calculos;

import objetos.Personagem;

public abstract class CalcClassesMagicas extends Personagem{
      // cálculos de bardo, bruxo e clerigo



  // truques conhecidos para bardo, bruxo e druida

  public CalcClassesMagicas(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma,
      int nivel) {
    super(forca, destreza, constituicao, inteligencia, sabedoria, carisma, nivel);
    //TODO Auto-generated constructor stub
  }

  public static int calcTruques (int nivel) {
    int truques = 0;
    if (nivel >= 1 && nivel <= 3) {
      truques = 2;
    } else if (nivel >= 4 && nivel <= 9) {
      truques = 3;
    } else if (nivel >= 10) {
      truques = 4;
    }
    return truques;
  }

  public static int calcMagiaBardo (int nivel) {
    int magias = 0;
    switch(magias) {
      case 1:
        magias = 4;
        break;
      case 2:
        magias = 5;
        break;
      case 3:
        magias = 6;
        break;
      case 4:
        magias = 7;
        break;
      case 5:
        magias = 8;
        break;
      case 6:
        magias = 9;
        break;
      case 7:
        magias = 10;
        break;
      case 8:
        magias = 11;
        break;
      case 9:
        magias = 12;
        break;
      case 10:
        magias = 14;
        break;
      case 11:
        magias = 15;
        break;
      case 12:
        magias = 15;
        break;
      case 13:
        magias = 16;
        break;
      case 14:
        magias = 18;
        break;
      case 15:
        magias = 19;
        break;
      case 16:
        magias = 19;
        break;
      case 17:
        magias = 20;
        break;
      case 18:
        magias = 22;
        break;
      case 19:
        magias = 22;
        break;
      case 20:
        magias = 22;
        break;
    }

    if (nivel > 20) {
      magias = 22;
    }

    return magias;
  }

  // calculo de classe de dificuldade de magia CD

  public static int calcCDMAgia (int bonusDeProficiencia, int modCar) {
    int cd = 8 + bonusDeProficiencia + modCar;
    return cd;
  }

  public static void msg(int cd, int modAtqMagia) {
    System.out.println("CD de magia: " + cd);
    System.out.println("Mod Atq Magia: " + modAtqMagia);
  }



  // calculo de modificador de ataque de magia

  public static int calcModAtaqueMagiaBardo (int bonusDeProficiencia, int modCar) {
    int mdm = bonusDeProficiencia + modCar;
    return mdm;
  }
}


