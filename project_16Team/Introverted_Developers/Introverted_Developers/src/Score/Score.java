package Score;

import Student.Student_main;
import Student.Student;
import Subject.Subject_Act;

import java.util.ArrayList;
import java.util.Scanner;


public class Score {


    public void Score(Data data, Student_main std) {

        Scanner sc = new Scanner(System.in);
        System.out.println("학생 이름을 입력해주세요");
        String name = sc.nextLine();
        for (String MapKey : data.map.keySet()) {
            if (name.equals(MapKey)) {
                Student a = std.getStudentByName(name);
                if (a == null) {
                    return;
                }
                ArrayList<Sub_name_score> Sub = data.map.get(a.getStudentName());
                System.out.println("필수 과목 : " + a.getSubjectList().get(0));
                System.out.println("선택 과목 : " + a.getSubjectList().get(1));

                System.out.println("과목이름을 입력해주세요");
                String Sub_Name = sc.nextLine();
                for (Sub_name_score Sub_ : Sub) {
                    if (Sub_.getName().equals(Sub_Name)) {
                        System.out.println("변경 점수를 입력해주세요");
                        int i = sc.nextInt();
                        Sub_.setScore(i);
                    }
                }
                System.out.println(data.map);
            }
        }
    }
}
