import java.util.ArrayList;
import java.util.List;

public class WorkWithList {
    public void AddLineList(List<ArrayList<String>> ourlist){
        ourlist.add(new ArrayList<String>());
    }
    public void PrintList(List<ArrayList<String>>ourlist){
        System.out.println(ourlist);
    }
}
