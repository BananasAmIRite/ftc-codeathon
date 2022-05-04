import java.util.Map;
import java.util.HashMap; 

public class FibonacciNumbers {
  public double run(int n) {
    return runMemo(n, new HashMap<>()); 
  }

  private double runMemo(int n, Map<Integer, Double> memo) {
    if (n == 0) return 0; 
    if (n <= 2) return 1; 

    double val1 = memo.containsKey(n-1) ? memo.get(n-1) : runMemo(n-1, memo); 
    double val2 = memo.containsKey(n-2) ? memo.get(n-2) : runMemo(n-2, memo); 

    memo.put(n, val1+val2); 
    
    return  val1 + val2; 
  }
}