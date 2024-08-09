package Subject;

import Student.Student;

import java.util.*;

public class Subject_Act {
    ArrayList<Integer> Subject_ID = new ArrayList<>();
    final String[] Sub_must = {"Java", "객체 지향", "Spring", "JPA", "MySQL"};
    final String[] Sub_choice = {"디자인 패턴", "Spring Security", "Redis", "MongoDB"};
    public Map<String,String> Sub_Map = new HashMap<>();

    public Subject_Act() {
        for(String Sub_must_ : Sub_must ){
            Sub_Map.put(Sub_must_, "M");
        }
        for(String Sub_choice_ : Sub_choice ){
            Sub_Map.put(Sub_choice_, "C");
        }
    }

    public void Subject_Act(Student student) {

        ArrayList<String> Subject_Name_M = new ArrayList<>();
        ArrayList<String> Subject_Name_C = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int num = 0;
        for (int i = 101; i <= 105; i++) {
            Subject_ID.add(i);
        }

        boolean p = true;
        while (p) {
            System.out.println("3가지 필수과목과 2가지 선택과목을 고르십시오");
            System.out.println("필수 과목");

            while (Subject_Name_M.size() < 3) {
                for (int i = 0; i < Sub_must.length; i++) {
                    System.out.println(i + 1 + ". " + Sub_must[i]);
                }
                num = sc.nextInt();
                if (num <= Sub_must.length && num >= 1) {

                    if (Subject_Name_M.contains(Sub_must[num - 1])) {
                        System.out.println("이미 있는 과목입니다.");
                    } else {
                        Subject_Name_M.add(Sub_must[num - 1]);
                    }
                } else {
                    System.out.println("잘못 입력하셨습니다");
                }
            }

                System.out.println("선택 과목");

                System.out.println("선택을 안하려면 0번을 선택해주세요");

                boolean flag = true;
                while (Subject_Name_C.size() < 2 && flag) {

                    for(int i= 0; i< Sub_choice.length; i++){

                        System.out.println(i+1+". "+Sub_choice[i]);
                    }
                    num = sc.nextInt();

                    if (num <= Sub_choice.length && num >= 1){

                        if(Subject_Name_C.contains(Sub_choice[num-1])){

                            System.out.println("이미 있는 과목입니다.");
                        }else{
                            Subject_Name_C.add(Sub_choice[num-1]);
                        }
                    }else if(num == 0){
                        break;
                    }else{
                        System.out.println("잘못 입력하셨습니다");
                    }

                }

                student.getSubjectList().add(Subject_Name_M);
                student.getSubjectList().add(Subject_Name_C);

                System.out.println("과목 선택이 완료 되었습니다");
                p = false;

            }// 전체적인 while 문
        }// 생성자
    }

