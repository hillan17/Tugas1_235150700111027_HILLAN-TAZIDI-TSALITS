package PackageKelas;

public class Controller{
  private String Status;
  private int Volume;
  private int Brightness;
  private String Cable;

  public Controller(){
    this.Status = "OFF (Mati)";
    this.Volume = 0;
    this.Brightness = 25;
    this.Cable = "DisplayPort";
  }

  public void turnOn(){
    this.Status = "ON (Menyala)";
  }

  public void turnOff(){
    this.Status = "OFF (Mati)";
  }

  public void freeze(){
    this.Status = "Freeze";
  }

  public void volumeUp(){
    if (this.Status.equals("ON (Menyala)") || !this.Status.equals("Freeze")){
      if (this.Volume < 100){
        this.Volume += 2;
    }
  }
}

  public void volumeDown(){
    if (this.Status.equals("ON (Menyala)") || !this.Status.equals("Freeze")){
      if (this.Volume > 0){
        this.Volume -= 2;
    }
  }
}

  public void setVolume(int volume){
    if (this.Status.equals("ON (Menyala)") || !this.Status.equals("Freeze")){
      if (volume >= 0 && volume <= 100){
        this.Volume = volume;
    }
  }
}

  public void brightnessUp(){
    if (this.Status.equals("ON (Menyala)") || !this.Status.equals("Freeze")){
      if (this.Brightness < 100){
        this.Brightness += 2;
    }
  }
}

  public void brightnessDown(){
    if (this.Status.equals("ON (Menyala)") || !this.Status.equals("Freeze")){
      if (this.Brightness > 0){
        this.Brightness -= 2;
    }
  }
}

  public void setBrightness(int brightness){
    if (this.Status.equals("ON (Menyala)") || !this.Status.equals("Freeze")){
      if (brightness >= 0 && brightness <= 100){
        this.Brightness = brightness;
    }
  }
}

  public void setCable(String cable){
    switch (cable) {
      case "H":
        this.Cable = "HDMI";
        break;
      case "V":
        this.Cable = "VGA";
        break;
      case "D":
        this.Cable = "DVI";
        break;
      case "DP":
        this.Cable = "DisplayPort";
      default:
        break;
    }
  }

  public void displayInfo(){
    System.out.println("==========================");
    System.out.println("LCD Status: " + this.Status);
    System.out.println("Volume: " + this.Volume);
    System.out.println("Brightness: " + this.Brightness);
    System.out.println("Cable: " + this.Cable);
    System.out.println("==========================");
  }
}