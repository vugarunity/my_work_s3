import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       
        List<StudentGroups> groups1 = new ArrayList<>();
        groups1.add(new StudentGroups());
        groups1.add(new StudentGroups()); 
        groups1.add(new StudentGroups());

        
        List<StudentGroups> groups2 = new ArrayList<>();
        groups2.add(new StudentGroups());
        groups2.add(new StudentGroups()); 
        groups2.add(new StudentGroups());

        
        Stream stream1 = new Stream(groups1);
        Stream stream2 = new Stream(groups2);

       
        System.out.println("Поток с " + stream1.getStudentGroupsList().size() + " группами.");
        System.out.println("Поток с " + stream2.getStudentGroupsList().size() + " группами.");
    }
}
