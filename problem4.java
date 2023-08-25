class Main
{
    public static void main(String[] args)
    {
        int a = 999;
        int b = 999;

        int maxPalindrome = 0;

        while (a > 0)
        {
            int c = a * b;
            String sC = Integer.toString(c);

            boolean palindrome = true;

            for (int i = 0; i < sC.length()/2; i++)
            {
                if (sC.charAt(i) != sC.charAt(sC.length() - i - 1))
                {
                    palindrome = false;
                    break;
                }
            }

            if (palindrome && c > maxPalindrome)
            {
                maxPalindrome = c;
            }

            b = b - 1;
            if (b == 0)
            {
                b = 999;
                a = a - 1;
            }
        }
      
        System.out.println(maxPalindrome);
    }
}
