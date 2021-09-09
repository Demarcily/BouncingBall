public class BouncingBall {
  double velocity = 0;
  double newvelocity = 0;
  double gravity = 9.82;
  double dt = 1;
  double t = 0;
  double height = 1000;


  public static void main(String [] args) {
    new BouncingBall();
  }

  public BouncingBall() {
    UpdateVelocity(14);
  }

  private void UpdateVelocity (int set) {
    while (t < set) {
      t = t + dt;
      newvelocity = velocity + (gravity * dt);
      velocity = newvelocity;
      height = height - newvelocity;
      System.out.println(height);
    }
  }

  private void Update() {

  }

  private void posUpdate() {

  }

}
