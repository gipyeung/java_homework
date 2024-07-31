import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app {
    public static ArrayList<Integer> res_arr = new ArrayList<Integer>();

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        int q = 1;
        int w = 0;
        int r = q/w;
        do {
            System.out.println("첫 번째 숫자를 입력 하세여");
            int a = sc.nextInt();
            System.out.println("두 번째 숫자를 입력 하세여");
            int b = sc.nextInt();
            System.out.println("사칙 연산 기호를 입력 하세요");
            char c = sc.next().charAt(0);
            cal.calculate(a,b,c);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제 하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.next();
            if(remove.equals("remove")){
                res_arr.remove(0);
            }
            System.out.println("저장된 연산 결과를 조회 하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.next();
            if(inquiry.equals("inquiry"))
                for(int i : res_arr){
                    System.out.println("["+i+"]");
                }
            System.out.println("더 계산 하시겠습니까? (exit 입력 시 종료, return 입력시 계속)");
            String exit = sc.next();
            if(exit.equals("exit"))
                break;
            else if(exit.equals("return"))
                continue;
        }while (true);
    }
}
