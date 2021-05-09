package example;
import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParanthesis {

        static boolean isMatching(char a, char b)
        {
            return (a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}');
        }


        static boolean isBalanced(String str)
        {
            Deque<Character> stack = new ArrayDeque<Character>();

            for(int i=0; i<str.length(); i++)
            {
                char x= str.charAt(i);

                if(x=='(' || x=='[' || x=='{')
                {
                    stack.push(x);
                }
                else
                {
                    if(stack.isEmpty())
                    {
                        return false;
                    }
                    else if(isMatching(stack.peek(),x)==false)
                    {
                        return false;
                    }
                    else
                    {
                        stack.pop();
                    }
                }
            }

            return stack.isEmpty();
        }

        public static void main (String[] args)  {

            String s="{[()]}";

            System.out.println(isBalanced(s));

        }

    }

