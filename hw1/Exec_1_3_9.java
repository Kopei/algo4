package hw1;
public class Exec_1_3_9{
    Stack<String> stack_operator = new Stack<String>();
    Stack<String> stack_operand = new Stack<String>();
    while (!StdIn.isEmpty()){
        String s = StdIn.readString();
        if (s.equals("+")|s.equals("-")|s.equals("*")|s.equals("/")){
            stack_operand.push(s);
        }
        else if (s.equals(")")){
            String operand = stack_operand.pop();
            String v1 = stack_operator.pop();
            String v2 = stack_operator.pop();
            if (operand == "+"|operand == "-") |operand == "*"|operand == "/") {
                v2 = String.format("(%s %s %s )", v2, operand, v1);
            }
            stack_operator.push(v2);
        }
        else{
            stack_operator.push(s);
        }
    }
    StdOut.print(stack_operator.pop());
}