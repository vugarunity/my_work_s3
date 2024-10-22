import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    
    @Override
    public int compare(Stream g1, Stream g2) {
        return Integer.compare(g1.getStudentGroupsList().size(), g2.getStudentGroupsList().size());
    }
}
