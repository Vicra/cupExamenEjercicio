package Tree;

/**
 * Created by vicra on 2/10/2017.
 */
public class AdditionNode extends BinaryOperatorNode {
    public AdditionNode(ExpressionNode l, ExpressionNode r){
        this.LeftOperand = l;
        this.RightOperand = r;
    }
}
