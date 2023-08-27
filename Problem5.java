class Problem5
{
    public static void main(String[] args)
    {
        int min = 20;

        while (true)
        {
            boolean noRemainder = true;

            for (int i = 1; i < 21; i++) {
                if (min % i != 0) {
                    noRemainder = false;
                    break;
                }
            }

            if (noRemainder) {
                System.out.println(min);
                break;
            }

            min++;
        }
    }
}
