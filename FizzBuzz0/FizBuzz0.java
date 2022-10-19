public class FizBuzz0
{
    int i = 0;
    int a = 3;
    
    
    public void run() {
        for (int i=0; i <= 100; i=i+1) {
            System.out.println(i);
            if (i==a+3) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args)
    {
        FizBuzz0 hw = new FizBuzz0();
        hw.run();
    }
}