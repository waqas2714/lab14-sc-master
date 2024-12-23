public class multiThreadingExample {
    
}
public class MultithreadingExample {
        public static void main(String[] args) {
            // Create Runnable objects
            Runnable numberPrinter = new NumberPrinter();
            Runnable squarePrinter = new SquarePrinter();
            
            // Create Thread objects and pass the Runnable objects to them
            Thread thread1 = new Thread(numberPrinter);
            Thread thread2 = new Thread(squarePrinter);
            
            // Start the threads to run concurrently
            thread1.start();
            thread2.start();
        }
    }
    