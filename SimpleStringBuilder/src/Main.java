public class Main {

    public static void main(String[] args) {
         long startTime = System.nanoTime();
         SimpleStringBuilder stringBuilder = new SimpleStringBuilder();
         for (int i = 0; i < 1000000; i++){
             stringBuilder.append(Integer.toString(i));
         }
         String test1 = stringBuilder.toString();
         System.out.println("SimpleStringBuilder test: " + ((System.nanoTime() - startTime)/1000000) + " milliseconds" );

         //Takes around 10 minutes
         startTime = System.nanoTime();
         String test2 = "";
         for (int i = 0; i < 1000000; i++){
             test2 += Integer.toString(i);
         }

         System.out.println("String concatenation test: " + ((System.nanoTime() - startTime)/1000000) + " milliseconds");

    }
}
