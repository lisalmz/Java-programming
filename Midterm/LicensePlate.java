public class LicensePlate {
  private String text;
  private String state;


  public LicensePlate(String text, String state) {
  this.text = text;
  this.state = state;
  }

  public void setText(String text) {
  this.text = text;
  }

  public String getText() {
  return this.text;
  }

  public void setState(String state) {
  this.state = state;
  }

  public String getState() {
  return this.state;
  }

  public boolean equals(LicensePlate other) {
    return this.text == other.text && this.state == other.state;
  }

  public String toString() {
    return "Text: " + LicensePlate.getText() + ", State: " + LicensePlate.getState();
  }
}