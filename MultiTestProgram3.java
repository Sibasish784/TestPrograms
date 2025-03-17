public class MultiTestProgram3
{
    static void check()
    {
        MultiMainProgram1 mp1 = new MultiMainProgram1();
        double result = mp1.mul(2, 10);
        if (result == 20)
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
