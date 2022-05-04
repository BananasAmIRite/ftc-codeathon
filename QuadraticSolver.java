public class QuadraticSolver {
  public double[] run(double a, double b, double c) {
    return new double[] {
      (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/2*a, 
      (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/2*a
    }; 
  }
}