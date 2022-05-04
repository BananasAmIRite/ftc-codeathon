public class NFactorial {
  public double run(double n) {
    if (n <= 1) return 1;
    return run(n-1)*n; 
  }
}