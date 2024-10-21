public class Main {
   public static void main(String[] args) {
      SelectionMadness madness = new SelectionMadness();

      // test rightTriangle
      System.out.println("---- testing rightTriangle ----");
      System.out.println(madness.rightTriangle(3, 4, 5));
      System.out.println(madness.rightTriangle(5, 4, 3));
      System.out.println(madness.rightTriangle(6, 8, 10));
      System.out.println(madness.rightTriangle(8, 10, 6));
      System.out.println(madness.rightTriangle(3, 6, 5));
      System.out.println(madness.rightTriangle(1, 2, 3));

   }
}
