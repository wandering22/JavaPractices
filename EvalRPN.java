import java.util.Stack;

public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int n = tokens.length;

        for (int i = 0; i < n; i++) {
            int a,b;
            switch (tokens[i]) {
                case "+" :
                    b = s.pop();
                    a = s.pop();
                    s.push(a + b);
                    break;
                case "-" :
                    b = s.pop();
                    a = s.pop();
                    s.push(a - b);
                    break;
                case "*" :
                    b = s.pop();
                    a = s.pop();
                    s.push(a * b);
                    break;
                case "/" :
                    b = s.pop();
                    a = s.pop();
                    s.push(a / b);
                    break;
                default:
                    s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }
}
