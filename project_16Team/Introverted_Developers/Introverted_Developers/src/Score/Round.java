package Score;


import Student.Student;
import Student.Student_main;
import java.util.ArrayList;
import java.util.Scanner;


public class Round {
    public static void RoundInput(Data data, Student_main std) {
        Scanner sc = new Scanner(System.in);
        // 1. 학생이름 받아오기
        // 2. 학생 객체 선언
        // 3. for을 돌면서 학생 객체를 찾아 2번 객체에 할당해주기
        // 4. for을 다돌고 학생 객체가 null일 경우 roundinput 나가기
        System.out.println("학생의 이름을 입력해주세요");
        String s = sc.nextLine();
        Student a = std.getStudentByName(s);
        if(a==null){return;}
        // 5. While문을 열고 조건문에 data.map.size()<10 때가지 반복 
        while(data.map.size()<10) {
            System.out.println("회차를 입력해 주세요");
            int round = sc.nextInt();
            sc.nextLine();
            System.out.println("필수 과목 : " + a.getSubjectList().get(0));
            System.out.println("선택 과목 : " + a.getSubjectList().get(1));
            String subName_2 = sc.nextLine();

            if(a.getSubjectList().get(0).contains(subName_2)||a.getSubjectList().get(1).contains(subName_2)) {
                System.out.println("점수를 입력해주세요");
                int i = sc.nextInt();
                sc.nextLine();
                data.score(a.getStudentName(), round, subName_2, i);
            }
            else
                System.out.println("그런 과목 없습니다.");
            System.out.println("나가 시려면 0번을 입력해주세요");

            if(sc.nextLine().equals("0")) {
                break;
            }else{
                System.out.println("10회차를 초과할수없습니다");
            }
        }

    }
}

