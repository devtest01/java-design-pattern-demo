package patterns.action.interpreterpatter;

import java.util.ArrayList;
import java.util.List;

public class OrExpression implements Expression {
    private Expression expression1, expression2;
    private List<Expression> expressions = new ArrayList<>();

    public OrExpression() {
    }

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    public void addExpression(Expression expression) {
        expressions.add(expression);
    }

    @Override
    public boolean interpret(String context) {
//        return expression1.interpret(context) || expression2.interpret(context);
        for (Expression expression : expressions) {
            if (expression.interpret(context)) {
                return true;
            }
        }
        return false;
    }


}
