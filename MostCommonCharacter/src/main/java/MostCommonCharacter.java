import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {

        HashMap<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (charMap.containsKey(key)) {
                Integer value = charMap.get(key);
                charMap.replace(key, (value+=1));
            } else {
                charMap.put(key, 1);
            }
        }

        Character highestValuedKey = ' ';
        Integer valueOfHighestKey = 0;
        Iterator mapIterator = charMap.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) mapIterator.next();
            Integer marks = ((Integer) mapElement.getValue());
            if (marks > valueOfHighestKey) {
                valueOfHighestKey = marks;
                highestValuedKey =(char) mapElement.getKey();
            }
        }

        return highestValuedKey;
    }
}
