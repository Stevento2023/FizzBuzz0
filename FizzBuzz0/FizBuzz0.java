public class FizBuzz0
{
    int i = 0;
    int a = 0;
    int b = 0;
    
    public void run() {
        for (int i=0; i <= 100; i=i+1) {
            System.out.println(i);
            if (i==a) {
                System.out.println("Fizz");
            }
            if (i==b) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
        
        a = 0;
        do {
            a=a+3;
        } while (a <= 100);
        
        b = 0;
        do {
            b=b+5;
        } while (b <= 100);
    }
    
    public static void main(String[] args)
    {
        FizBuzz0 hw = new FizBuzz0();
        hw.run();
    }
}