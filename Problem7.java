class Problem7
{
    public static void main(String[] args)
    {
        int primeCounter = 0;
        int number = 2;
        int recentPrime = 0;
        while (primeCounter < 10001)
        {
            boolean prime = true;
            for (int i = 2; i < number; i++)
            {
                if (number % i == 0)
                {
                    prime = false;
                    break;
                }
            }
            if (prime)
            {
                primeCounter++;
                recentPrime = number;
            }
            number++;
        }
        System.out.println(recentPrime);
    }
}
