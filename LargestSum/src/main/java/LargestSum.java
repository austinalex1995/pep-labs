
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums) {
        int a = -1;
        int b = -1;
        for(int i = 0; i < nums.size(); i++) {
            if (a == -1) {
                a = nums.get(i);
            } else if (b == -1) {
                b = nums.get(i);
            } else {
                int aDifference = (a - nums.get(i));
                int bDifference = (b - nums.get(i));
                if (aDifference < 0 && bDifference < 0) {
                    if (aDifference < bDifference) {
                        a = nums.get(i);
                    } else {
                        b = nums.get(i);
                    }
                } else if (aDifference < 0) {
                    a = nums.get(i);
                } else if (bDifference < 0) {
                    b = nums.get(i);
                }
            }
        }
        return (a+b);
    }
}