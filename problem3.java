class Problem3
{
    public static void main(String[] args)
    {
        long number = 600851475143L;

        int biggestPrimeFactor = 0;

        int primeFactor = 2;

        while (number > 1) {
            if (number % primeFactor == 0 && primeFactor > biggestPrimeFactor) {
                number = number / primeFactor;
                biggestPrimeFactor = primeFactor;
            }
            primeFactor++;
        }

        System.out.println(biggestPrimeFactor);
    }
}
