/**
 * Created by jkzhao on 3/16/18.
 */

/**
 * 面试题3（一）：找出数组中重复的数字
 * 题目：在一个长度为n的数组里的所有数字都在0到n-1的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，
 * 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。例如，如果输入长度为7的数组{2, 3, 1, 0, 2, 5, 3}，
 * 那么对应的输出是重复的数字2或者3。
 */
public class DuplicationInArray {
    /**
     *
     * @param numbers 数组
     * @param length 数组长度
     * @return true  - 输入有效，并且数组中存在重复的数字
               false - 输入无效，或者数组中没有重复的数字
     */
    static boolean duplicate(int numbers[], int length) {
        if (numbers == null || length <=0 ) {
            return false;
        }

        for (int i=0; i<length; i++) { //每个数字最多交换2次就找到了属于自己的位置，时间复杂度为O(n)；所有操作在原数组上进行，不需要额外分配内存，空间复杂度为O(1)
            while (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) {
                    System.out.println(numbers[i]);
                    return true;
                }

                //swap numbers[i] and numbers[numbers[i]]
                int temp = numbers[i];
                numbers[i] = numbers[numbers[i]];
                numbers[temp] = temp;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] a = {2,3,1,0,2,5,3};
        DuplicationInArray.duplicate(a, a.length);

    }
}
