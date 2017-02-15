package Tree;

/**
 * Created by vicra on 2/10/2017.
 */
public class SubstractionNode extends BinaryOperatorNode {
    public SubstractionNode(ExpressionNode leftNode, ExpressionNode rightNode){
        LeftOperand = leftNode;
        RightOperand = rightNode;
    }
}
