package org.lesson.animals;

public class Aquila extends AbstractAnimale implements IVolante {

  @Override
  public void verso(){
    System.out.println("Aaaa");
  };

  @Override
  public void mangia(){
    System.out.println("Carne");
  };

  @Override
  public void vola(){
    System.out.println("Sto volando!!!");
  }

}
