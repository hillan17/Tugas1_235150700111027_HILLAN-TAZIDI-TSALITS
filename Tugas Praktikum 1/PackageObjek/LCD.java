package PackageObjek;

import PackageKelas.Controller;

public class LCD {
  public static void main(String[] args) {
    Controller LCD = new Controller();
    LCD.turnOn();
    LCD.setCable("H");
    LCD.setVolume(30);
    LCD.volumeUp();
    LCD.volumeUp();
    LCD.volumeDown();
    LCD.setBrightness(50);
    LCD.brightnessDown();
    LCD.brightnessDown();
    LCD.brightnessUp();
    LCD.freeze();
    LCD.brightnessUp();
    LCD.turnOff();

    LCD.displayInfo();
  }
}
