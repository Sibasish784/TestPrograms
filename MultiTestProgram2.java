public class MultiTestProgram2
{
    static void check()
    {
        MultiMainProgram1 mp1 = new MultiMainProgram1();
        double result = mp1.mul(3, 3);
        if (result == 9)
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }
    }
    public static void main(String[] args)
    {
        check();
    }
}
