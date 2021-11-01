package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> namesList = new ArrayList<>();

    public boolean addStudent(String studentName){
        if (studentName.contains(" ")){
            namesList.add(studentName);
            return true;
        }else {
            return false;
        }
    }
    public List<String> getNamesList() {
        return namesList;
    }
}
