public class CoinTesterTest {
   public static final int TOTAL_TRIALS = 10;
   public static void main(String[] args) {
      int total = 0;
      for(int i = 0; i < TOTAL_TRIALS; i++) { 
         CoinTester cT = new CoinTester();
         int streak = cT.streakCounter();
         System.out.println("Sample #" + i + ": " + streak);
         total += streak;
      }
      
      System.out.println("Average Length: " + (double)total/TOTAL_TRIALS);
   }
      
}