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
    Running(14);
  }

  private void UpdateVelocity () {
      t = t + dt;
      newvelocity = velocity + (gravity * dt);
      velocity = newvelocity;
      height = height - newvelocity;
      System.out.println(height);

  }

  private void Running(double GameLengthInSeconds) {
    while (t < GameLengthInSeconds) {
      UpdateVelocity();
      if (height < 0) {
        velocity = 0-velocity;
      }
    }
  }

  private void positionUpdate() {

  }

}
