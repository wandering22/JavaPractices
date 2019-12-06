package 括号匹配;

import java.util.Stack;
import java.util.*;

public class MarchDemo {

    public static boolean isValid(String s) {
        final char[][] arr = {{'(', ')'}, {'[', ']'}, {'{', '}'}};
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curCh = s.charAt(i);
            int flag = 0;
            for (int j = 0; j < arr.length; ++j) {
                //左括号：入栈
                if (curCh == arr[j][0]) {
                    st.push(curCh);     //入栈
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                //右括号
                if (st.isEmpty()) {
                    return false;
                }
                    //获取栈顶元素
                    //char top=st.pop();

                    char top = st.pop();

                    //确定栈顶元素是哪一个左括号
                    for (int k = 0; k < arr.length; k++) {
                        if (top == arr[k][0]) {
                            if (curCh == arr[k][1]) {
                                break;
                            } else {
                                return false;
                            }
                        }
                    }
                }
            }
        return st.isEmpty();
        }


    public static void main(String[] args) {
       // Stack<Character> n=new Stack<>();
        System.out.println(isValid("{[()]}"));
        System.out.println(isValid("{[(]}"));
        System.out.println(isValid("{[(}"));
    }
}
