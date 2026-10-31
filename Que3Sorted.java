import java.util.*;

class PairSum {
    static boolean hasPairWithSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            int complement = target - num;

            if (set.contains(complement)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}

public class Que3Sorted {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(PairSum.hasPairWithSum(nums, target));
    }
}
