public class ApproxSqrt {
  public double run(double n, int tries) {

    Double startingValue = findClosestPerfectSquare(n);
    if (startingValue == null) {
      System.out.println("starting value is wrong tf"); 
      return 0; 
    } 
    return runSqrt(startingValue, n, tries, startingValue); 
  }

  private double runSqrt(double start, double desiredRoot, int tries, double v) {
    if (tries <= 0) return start; 
    // System.out.println(desiredRoot); 

    if (start * start > desiredRoot) {
      // bigger
      start -= v / 2; 
    } else if (start * start < desiredRoot) {
      // smaller
      start += v / 2; 
    }

    return runSqrt(start, desiredRoot, tries-1, v / 2); 
  }

  private Double findClosestPerfectSquare(double square) {
    for (double i = 0; i*i < square; i++) {
      if (i * i <= square && (i+1) * (i+1) >= square) {
        return square - (i * i) <= ((i + 1) * (i + 1)) - square ? i : i + 1; 
      }
    }
    return null; 
  }
}