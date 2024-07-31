import java.util.ArrayList;

public class Calculator {
        public static ArrayList<Integer> res_arr = new ArrayList<Integer>();
        private int result = 0;
        public int calculate(int a2, int b2, char c2){
            switch (c2) {
                case '+':
                    result = a2 + b2;
                    //System.out.println("결과 :" + result);
                    res_arr.add(result);
                    System.out.println(res_arr.toString());
                    break;
                case '-':
                    result = a2 - b2;
                    System.out.println("결과 :" + result);
                    res_arr.add(result);
                    System.out.println(res_arr.toString());
                    break;
                case '*':
                    result = a2 * b2;
                    System.out.println("결과 :" + result);
                    res_arr.add(result);
                    System.out.println(res_arr.toString());
                    break;
                case '/':
                    result = a2 / b2;
                    System.out.println("결과 :" + result);
                    res_arr.add(result);
                    System.out.println(res_arr.toString());

                    break;
                case '%':
                    result = a2 % b2;
                    System.out.println("결과 :" + result);
                    res_arr.add(result);
                    System.out.println(res_arr.toString());
                    break;
            }
            return res_arr;
        }
}
