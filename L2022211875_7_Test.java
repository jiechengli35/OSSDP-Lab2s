import java.util.Arrays;
import java.util.List;

public class Solution7Test {
    /**
     * pull request：本测试用例设计的相当不错，但仍然存在一些问题
     * 本测试用例的注释可以进一步更加详细地说明每个测试用例地逻辑以及预期结果。
     * 缺少一些验证输入不合法地测试用例。
     * 打印结果缺少一些更为清晰的提示信息。
     */

    /**
     *测试用例设计原则：
     *等价类划分原则：将输入划分为有效和无效的等价类，以减少测试用例的数量。例如，测试用例4和5分别测试了有无交换对的情况。
     *边界值分析原则：测试边界条件，例如空字符串的情况，以确保程序在极端情况下的稳定性。
     */
    public static void main(String[] args) {
        Solution7 solution = new Solution7();

        // 测试用例 1
        testSmallestStringWithSwaps1(solution);
        // 测试用例 2
        testSmallestStringWithSwaps2(solution);
        // 测试用例 3
        testSmallestStringWithSwaps3(solution);
        // 测试用例 4
        testSmallestStringWithSwaps4(solution);
        // 测试用例 5
        testSmallestStringWithSwaps5(solution);
    }

    /**
     * 测试目的：验证基本功能，检查简单的字符交换是否能得到字典序最小的字符串。
     * 用到的测试用例：s = "dcab", pairs = [[0, 3], [1, 2]]
     */
    private static void testSmallestStringWithSwaps1(Solution7 solution) {
        String s = "dcab";
        List<List<Integer>> pairs = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2));
        String result = solution.smallestStringWithSwaps(s, pairs);
        System.out.println(result); // 输出: "bacd"
    }

    /**
     * 测试目的：验证多个交换对的情况，确保可以通过多次交换得到字典序最小的字符串。
     * 用到的测试用例：s = "abcd", pairs = [[0, 3], [1, 2], [0, 2]]
     */
    private static void testSmallestStringWithSwaps2(Solution7 solution) {
        String s = "abcd";
        List<List<Integer>> pairs = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2), Arrays.asList(0, 2));
        String result = solution.smallestStringWithSwaps(s, pairs);
        System.out.println(result);
    }

    /**
     * 测试目的：验证所有字符都可以互换的情况，确保最终结果是字典序最小的字符串。
     * 用到的测试用例：s = "nba", pairs = [[0, 1], [1, 2]]
     */
    private static void testSmallestStringWithSwaps3(Solution7 solution) {
        String s = "nba";
        List<List<Integer>> pairs = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2));
        String result = solution.smallestStringWithSwaps(s, pairs);
        System.out.println(result);
    }

    /**
     * 测试目的：验证没有交换对的情况，确保返回的字符串与输入字符串相同。
     * 用到的测试用例：s = "uzi", pairs = []
     */
    private static void testSmallestStringWithSwaps4(Solution7 solution) {
        String s = "uzi";
        List<List<Integer>> pairs = Arrays.asList();
        String result = solution.smallestStringWithSwaps(s, pairs);
        System.out.println(result);
    }

    /**
     * 测试目的：验证边界情况，确保处理空字符串的情况不会出错。
     * 用到的测试用例：s = "", pairs = []
     */
    private static void testSmallestStringWithSwaps5(Solution7 solution) {
        String s = "";
        List<List<Integer>> pairs = Arrays.asList();
        String result = solution.smallestStringWithSwaps(s, pairs);
        System.out.println(result);
    }
}
