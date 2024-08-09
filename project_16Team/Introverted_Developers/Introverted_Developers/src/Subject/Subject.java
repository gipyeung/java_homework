package Subject;

import java.util.ArrayList;

public class Subject {

    private int Sub_id;
    private ArrayList<ArrayList<String>> Sub_name;
    private String Sub_type;

    public void Subject(int id, ArrayList<ArrayList<String>> name, String type){
        this.Sub_id = id;
        this.Sub_name = name;
        this.Sub_type = type;
    }


    //getter
    public int getSub_id(){return Sub_id;}
    public ArrayList<ArrayList<String>> getSub_name() {return Sub_name;}
    public String getSub_type() {return Sub_type;}
}
