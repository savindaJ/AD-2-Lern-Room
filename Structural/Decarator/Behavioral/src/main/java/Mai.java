/**
 * @author : savindaJ
 * @date : 2024-05-09
 * @since : 0.1.0
 **/
public class Mai {
    public static void main(String[] args) {
        Context context = new Context(new OparationAdd());
        System.out.println("10 + 5 = ");
        context.execute(10, 5);
        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = ");
        context.execute(10, 5);
    }
}
