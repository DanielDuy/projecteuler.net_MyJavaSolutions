class Main
{
    public static void main(String[] args)
    {
        int sumMulti = 0;

        for (int i = 3; i < 1000; i++)
        {
            if (i % 3 == 0 || i % 5 == 0)
            {
                sumMulti += i;
            }
        }

        System.out.println(sumMulti);
    }
}
