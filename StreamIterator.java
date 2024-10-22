import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroups> {

    private int count;
    private final List<StudentGroups> studentGroupsList;

    public StreamIterator(List<StudentGroups> studentGroupsList) {
        this.count = 0;
        this.studentGroupsList = studentGroupsList;
    }

    @Override
    public boolean hasNext() {
        return count < studentGroupsList.size();
    }

    @Override
    public StudentGroups next() {
        if (!hasNext()) {
            return null;
        }
        return studentGroupsList.get(count++);
    }
}
