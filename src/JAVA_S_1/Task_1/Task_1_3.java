//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
package JAVA_S_1.Task_1;

public class Task_1_3 {
    public static int getMaxOneCount(int[] arg) {
        int maxCount = 0;
        int count = 0;
        for (int item : arg) {
            if (item == 1) count++;
            else {
                if (count > maxCount) {
                    maxCount = count;
                    count = 0;
                }
            }
        }
        return maxCount;
    }
}
