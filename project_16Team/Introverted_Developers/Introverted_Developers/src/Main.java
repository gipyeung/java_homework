import Score.Round;
import Score.Score;
import Score.Data;
import Score.Rank;
import Subject.Subject_Act;
import Student.Student_main;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Student_main student_main = new Student_main();
    static Round round = new Round();
    static Subject_Act subjectAct = new Subject_Act();
    static Score soc = new Score();
    static Data data = new Data();
    static Rank rank = new Rank();
//예외 처리
    public static void main(String[] args) {
//        displayMainView();
        try {
            displayMainView();
        } catch (Exception e) {
            System.out.println(e);
        }
    }



    //메인 화면
    private static void displayMainView() throws InterruptedException {
        boolean flag = true;
        while (flag) {
            System.out.println("\n==================================");
            System.out.println("내일배움캠프 수강생 관리 프로그램 실행 중...");
            System.out.println("1. 수강생 관리");
            System.out.println("2. 점수 관리");
            System.out.println("3. 프로그램 종료");
            System.out.print("관리 항목을 선택하세요...");
            int input = sc.nextInt();

            switch (input) {
                case 1 -> displayStudentView(); // 학생 관리
                case 2 -> displayScoreView(); // 점수 관리
                case 3 -> flag = false; // 프로그램 종료
                default -> {
                    System.out.println("잘못된 입력입니다.\n되돌아갑니다!");
                }
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }


    //    학생 관리 화면
    private static void displayStudentView() {
        boolean flag = true;
        while (flag) {
            System.out.println("==================================");
            System.out.println("수강생 관리 실행 중...");
            System.out.println("1. 수강생 등록");
            System.out.println("2. 수강생 목록 조회");
            System.out.println("3. 메인 화면 이동");
            System.out.print("관리 항목을 선택하세요...");
            int input = sc.nextInt();

            switch (input) {
                case 1 -> student_main.Std(); // 수강생 등록
                case 2 -> student_main.selectST(); // 수강생 목록 조회
                case 3 -> flag = false; // 메인 화면 이동
                default -> {
                    System.out.println("잘못된 입력입니다.\n메인 화면 이동...");
                    flag = false;
                }
            }
        }
    }

    //    점수 관리 화면
    private static void displayScoreView() {
        boolean flag = true;
        while (flag) {
            System.out.println("==================================");
            System.out.println("점수 관리 실행 중...");
            System.out.println("1. 수강생의 과목별 시험 회차 및 점수 등록");
            System.out.println("2. 수강생의 과목별 회차 점수 수정");
            System.out.println("3. 수강생의 특정 과목 회차별 등급 조회");
            System.out.println("4. 메인 화면 이동");
            System.out.print("관리 항목을 선택하세요...");
            int input = sc.nextInt();

            switch (input) {
                case 1 -> createScore(); // 수강생의 과목별 시험 회차 및 점수 등록
                case 2 -> updateRoundScoreBySubject(); // 수강생의 과목별 회차 점수 수정
                case 3 -> inquireRoundGradeBySubject(); // 수강생의 특정 과목 회차별 등급 조회
                case 4 -> flag = false; // 메인 화면 이동
                default -> {
                    System.out.println("잘못된 입력입니다.\n메인 화면 이동...");
                    flag = false;
                }
            }
        }
    }

    public static void createScore() {
        boolean flag = true;
        while (flag) {
            System.out.println("==================================");
            System.out.println("수강생의 과목별 시험 회차 및 점수 등록");
            System.out.println("1. 회차 및 점수 등록");
            System.out.println("2. 메인 화면 이동");
            System.out.print("관리 항목을 선택하세요...");
            int input = sc.nextInt();
            switch (input) {
                case 1 -> round.RoundInput(data, student_main);
                case 2 -> flag = false;
                default -> {
                    System.out.println("잘못된 입력입니다.\n메인 화면 이동...");
                    flag = false;
                }
            }

        }
    }

    public static void updateRoundScoreBySubject() {
        boolean flag = true;
        while (flag) {
            System.out.println("==================================");
            System.out.println("수강생의 과목별 회차 점수 수정");
            System.out.println("1. 점수 수정");
            System.out.println("2. 메인 화면 이동");
            System.out.print("관리 항목을 선택하세요...");
            int input = sc.nextInt();
            switch (input) {
                case 1 -> soc.Score(data,student_main);
                case 2 -> flag = false;
                default -> {
                    System.out.println("잘못된 입력입니다.\n메인 화면 이동...");
                    flag = false;
                }
            }
        }
    }

    private static void inquireRoundGradeBySubject() {
        boolean flag = true;
        while (flag) {
            System.out.println("==================================");
            System.out.println("수강생의 특정 과목 회차별 등급 조회");
            System.out.println("1.과목별 등급 조회");
            System.out.println("2.메인 화면 이동");
            int input = sc.nextInt();
            switch (input) {
                case 1 -> rank.Rank_must(data, student_main, subjectAct);
                case 2-> flag = false;

            }
        }
    }
}

