package behavioral.strategy;

public class Client {

       /*  Strategy - an interface that define behavior
       *   Context - keeps or get context information and pass to the strategy
       * */
       public static void main(String args[]) {
           Strategy add = new Add();
           Context context = new Context(add);
           System.out.println("Result :"+context.executeStrategy(3, 4));

           context.applyStrategy(new Subtract());
           System.out.println("Result :"+context.executeStrategy(3, 4));

           context.applyStrategy(new Multiply());
           System.out.println("Result :"+context.executeStrategy(3, 4));

           context.applyStrategy(add);
           System.out.println("Result :"+context.executeStrategy(3, 4));
       }
}
