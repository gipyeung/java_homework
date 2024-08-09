package Student;

import java.util.ArrayList;

public class Student {

    private int studentId; // 수강생 고유 번호
    private String studentName; // 수강생 이름
    private ArrayList<ArrayList<String>> subjectList; // 과목 목록


    public Student(int Id, String Name, ArrayList<ArrayList<String>> List) {
        this.studentId = Id;
        this.studentName = Name;
        this.subjectList = List;

    }
    // 메서드
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public ArrayList<ArrayList<String>> getSubjectList() {
        return subjectList;
    }

}