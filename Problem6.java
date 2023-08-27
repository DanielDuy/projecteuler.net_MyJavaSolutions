class Problem6
{
    public static void main(String[] args)
    {
        double sumSqr = 0;

        for (int i = 1; i < 101; i++) {
            sumSqr += Math.pow(i, 2);
        }

        double sqrSum = 0;

        for (int i = 1; i < 101; i++) {
            sqrSum += i;
        }

        sqrSum = Math.pow(sqrSum, 2);

        System.out.printf("%.0f%n", sqrSum-sumSqr);
    }
}
