import java.util.*;

public class MajorityVote {
    public static int[] majorityElement(int[] arr) {
        int n = arr.length;
        int count1 = 0, count2 = 0;
        Integer cand1 = null, cand2 = null;

        // 1st pass: Find potential candidates
        for (int num : arr) {
            if (cand1 != null && num == cand1) {
                count1++;
            } else if (cand2 != null && num == cand2) {
                count2++;
            } else if (count1 == 0) {
                cand1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                cand2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // 2nd pass: Verify actual counts
        count1 = 0;
        count2 = 0;
        for (int num : arr) {
            if (num == cand1) count1++;
            else if (num == cand2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(cand1);
        if (count2 > n / 3) result.add(cand2);

        Collections.sort(result); // Ensure increasing order
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1};
        int[] res = majorityElement(arr);

        System.out.println("Candidates with > 1/3 votes:");
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
