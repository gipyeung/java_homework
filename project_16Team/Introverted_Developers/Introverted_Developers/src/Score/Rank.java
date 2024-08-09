package Score;

import Score.Sub_name_score;
import Student.Student;
import Student.Student_main;
import Subject.Subject_Act;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Rank {
    Scanner sc = new Scanner(System.in);

    public void Rank_must(Data data, Student_main std, Subject_Act sub) {
        boolean flag = true;
        while (flag) {
            System.out.println("학생 이름을 입력해주세요");
            String name = sc.nextLine();
            Student a = std.getStudentByName(name);
            if(a == null) {return;}

            ArrayList<Sub_name_score> SNS = data.map.get(a.getStudentName());
            System.out.println("필수 과목: " + a.getSubjectList().getFirst());
            System.out.println("선택 과목: " + a.getSubjectList().get(1));
            System.out.println("과목이름을 입력해주세요");
            String Sub_Name = sc.nextLine();

            for(Sub_name_score SNS_ : SNS) {
                if(SNS_.getName().equals(Sub_Name)){
                    System.out.println("회차 : "+SNS_.getRound());
                    String grade = sub.Sub_Map.get(SNS_.getName()).equals("M") ? getsRank(SNS_.getScore()) : getsRank_(SNS_.getScore());
                    System.out.println("등급 :"+grade);
                }
            }
        }
    }
    // 필수
    public static String getsRank(int score){
        if (score >= 95) {
            return "A";
        } else if (score >= 90) {
            return "B";
        } else if (score >= 80) {
            return "C";
        } else if (score >= 70) {
            return "D";
        } else if (score >= 60) {
             return "F";
        } else {
            return "N";
        }
    }
    // 선택
    public static String getsRank_(int score){
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else if (score >= 50) {
            return "F";
        } else {
            return "N";
        }
    }
}

