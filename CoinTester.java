import java.util.*;
public class CoinTester {
   private Coin[] coinSample;
   
   public CoinTester() {
      coinSample = new Coin[10];
      for(int i = 0; i < 10; i++) {
         coinSample[i] = new Coin();
      }
   }
   
   public int streakCounter() {
      int curStreak = 0;
      int maxStreak = 0;
      for(int i = coinSample.length-1; i >= 0; i--) {
         if(i!= 0 && coinSample[i].toString().equals(coinSample[i-1].toString())) {
            if(curStreak == 0) {
               curStreak+=2;
            } else {
               curStreak++;
            }
         } else {
            maxStreak = Math.max(curStreak, maxStreak);
            curStreak = 0;
         }
      }
      return maxStreak;
   }
   
   public Coin[] getArray() {
      return coinSample;
   }
   
   private class Coin {
      private String face;
      
      public Coin() {
         Random rand = new Random();
         flip(rand);  
      }
            
      public void flip(Random rand) {
         if(rand.nextInt(2) == 0) {
            face = "heads";
         } else {
            face = "tails"; 
         } 
      }
      
      public String toString() {
         return face;
      }
   }
}