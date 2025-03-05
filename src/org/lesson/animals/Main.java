package org.lesson.animals;

public class Main {
  public static void main(String[] args) {
    Aquila aquila = new Aquila();
    aquila.dormi();
    aquila.mangia();
    aquila.verso();
    // aquila.vola();
    faiVolare(aquila);

    System.out.println("----------");
    
    Delfino delfino = new Delfino();
    delfino.dormi();
    delfino.mangia();
    delfino.verso();
    // delfino.nuota();
    faiNuotare(delfino);
  }

  public static void faiVolare(IVolante animale){
    animale.vola();
  }

  public static void faiNuotare(INuotante animale){
    animale.nuota();
  }

}
