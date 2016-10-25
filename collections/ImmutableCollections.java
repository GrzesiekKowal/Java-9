import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.lang.System.*;

public class ImmutableCollections {

    public static void main(String args[]) {
        List<Integer> listOfNumbers = List.of(1, 2, 3, 4, 5);
        out.println(listOfNumbers);

        Set<Integer> setOfNumbers = Set.of(1, 2, 3, 4, 5);
        out.println(setOfNumbers);

        Map<String, String> mapOfString = Map.of("key1", "value1", "key2", "value2");
        out.println(mapOfString);

        Map<String, String> moreMapOfString = Map.ofEntries(
                Map.entry("key1", "value1"),
                Map.entry("key2", "value2")
        );
        out.println(moreMapOfString);
    }
}