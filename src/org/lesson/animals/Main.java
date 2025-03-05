package org.lesson.animals;

public class Main {
  public static void main(String[] args) {
    Aquila aquila = new Aquila();
    aquila.dormi();
    aquila.mangia();
    aquila.verso();
    aquila.vola();

    System.out.println("----------");
    
    Delfino delfino = new Delfino();
    delfino.dormi();
    delfino.mangia();
    delfino.verso();
    delfino.nuota();
  }
}
