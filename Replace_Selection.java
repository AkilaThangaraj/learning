import java.util.*;

public class Replace_Selection {
   public static void main(String[] args) {
      List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
      System.out.println("List :"+list);
      Collections.replaceAll(list, "one", "hundread");
      
      System.out.println("replaceAll: " + list);
   }
}