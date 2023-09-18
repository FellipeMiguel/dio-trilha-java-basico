package edu.dino.tv;

public class User {
  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();

    smartTv.volumeDown();
    smartTv.volumeDown();

    System.out.println("TV ligada? " + smartTv.on);
    System.out.println("Canal atual: " +smartTv.channel);
    System.out.println("Volume atual: " +smartTv.volume);

    smartTv.turnOn();
    System.out.println("Novo status -> TV ligada? " + smartTv.on);
    
    smartTv.changeChannel(25);
    System.out.println("Canal atual: " +smartTv.channel);
  }
}
