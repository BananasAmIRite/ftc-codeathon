import java.util.Arrays; 

public class Main {
  public static void main(String[] args) {

System.out.println("First n primes: ");; 
    
    FirstNPrimes primes = new FirstNPrimes(); 

    System.out.println(primes.run(100)); 

    System.out.println("Fibonacci Sequence: "); 
    
    FibonacciNumbers fib = new FibonacciNumbers(); 
    for (int i = 0; i < 10; i++) {
        System.out.println(fib.run(i)); 
    }

    System.out.println("FizzBuzz: "); 

    FizzBuzz fb = new FizzBuzz(); 
    fb.run(100);

    System.out.println("Quadratic Solver: "); 
    
    QuadraticSolver solver = new QuadraticSolver(); 
    System.out.println(Arrays.toString(solver.run(1, -5, 6))); 

    ApproxSqrt s = new ApproxSqrt(); 
    for (int i = 0; i < 100; i++) {
    double a = s.run(i, 1000); 
    System.out.println(a); // guess and check 

    System.out.println("error rate: " + (a * a - i)); 
      }

    System.out.println("NFactorial: ");
    NFactorial nFactorial = new NFactorial(); 
      for (int i = 0; i < 20; i++) {
        System.out.println(nFactorial.run(i)); 
      }
  }
}