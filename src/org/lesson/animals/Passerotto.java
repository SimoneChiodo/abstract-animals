package org.lesson.animals;

public class Passerotto extends AbstractAnimale implements IVolante {

  @Override
  public void verso(){
    System.out.println("Cip Cip");
  };

  @Override
  public void mangia(){
    System.out.println("Semi");
  };

  @Override
  public void vola(){
    System.out.println("Sto volando!!!");
  }

}
