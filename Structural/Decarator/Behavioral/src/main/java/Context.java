/**
 * @author : savindaJ
 * @date : 2024-05-09
 * @since : 0.1.0
 **/
public class Context {
    private Stratergy stratergy;
    public Context(Stratergy stratergy){
        this.stratergy = stratergy;
    }

    public void execute(int num1, int num2){
        stratergy.doOperation(num1, num2);
    }
}
