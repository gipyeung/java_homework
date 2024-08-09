package Score;

import Student.Student;

import java.util.*;

public class Data {

    Map<String, ArrayList<Sub_name_score>> map = new HashMap<>();

    public void score(String name, int round, String Sub_name, int Sub_score) {
        map.putIfAbsent(name, new ArrayList<>());
        map.get(name).add(new Sub_name_score(round, Sub_name, Sub_score));
        map.forEach((k, v) -> System.out.println("학생이름 : " + k + " " + v ));
    }
}