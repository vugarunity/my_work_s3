import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroups> {
    
    private final List<StudentGroups> studentGroupsList;

    
    public Stream(List<StudentGroups> studentGroupsList) {
        this.studentGroupsList = studentGroupsList;
    }

    @Override
    public Iterator<StudentGroups> iterator() {
        return new StreamIterator(this.studentGroupsList);
    }

    
    public List<StudentGroups> getStudentGroupsList() {
        return studentGroupsList;
    }
}
