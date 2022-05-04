import java.util.ArrayList; 
import java.util.List; 

public class FirstNPrimes {
  public List<Integer> run(int n) {
    List<Integer> primes = new ArrayList<>(); 

    int count = 0; 
    int a = 0; 
    while (count < n) {
      if (isPrime(a)) {
        count++; 
        primes.add(a); 
      }
      a++; 
    }
    return primes; 
  }

  private boolean isPrime(int num) {
    for (int i = 2; i < num; i++) {
      if (num % i == 0) return false; 
    }
    return true; 
  }
}