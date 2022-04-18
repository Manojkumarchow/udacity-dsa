class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int min = salary[0];
        int max = salary[salary.length - 1];
        double sum = 0, count = 0;
        for (int i=1;i<salary.length - 1;i++) {
            // System.out.println(salary[i]);
            sum += salary[i];
            count++;
        }
        // System.out.println(sum);
        if (count != 0)
            return sum / count;
        else
            return 0;
    }
}