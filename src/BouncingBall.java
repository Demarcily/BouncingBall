public class BouncingBall {
  public static void main(String [] args) {
    double height = 1000;
    double currentheight;
    double distance = 0;
    int t = 0; //Time
    double velocity = 0;
    double newvelocity;
    double gravity = 9.8;




    while(t < 14) {
      newvelocity = velocity + (gravity * t);
      currentheight = height - newvelocity;
      velocity = newvelocity;
      t++;
      System.out.println(currentheight);
    }
  }

  private void Update() {

  }

  private void posUpdate() {

  }

}
