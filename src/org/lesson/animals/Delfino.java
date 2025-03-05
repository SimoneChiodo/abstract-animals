package org.lesson.animals;

public class Delfino extends AbstractAnimale implements INuotante {

  @Override
  public void verso(){
    System.out.println("Gih Gih");
  };

  @Override
  public void mangia(){
    System.out.println("Pesce");
  };

  @Override
  public void nuota(){
    System.out.println("Sto nuotando!!!");
  }

}
