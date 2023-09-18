package edu.dino.tv;
public class SmartTv {
  boolean on = false;
  int channel = 1;
  int volume = 15;

  public void turnOn() {
    on = true;
  }

  public void turnOff() {
    on = false;
  }

  public void volumeUp () {
    volume++;
  }

  public void volumeDown () {
    volume--;
  }
  
  public void changeChannel(int newChannel) {
    channel = newChannel;
  }

  public void changeChannelUp() {
    channel++;
  }

  public void changeChannelDown() {
    channel--;
  }
}
