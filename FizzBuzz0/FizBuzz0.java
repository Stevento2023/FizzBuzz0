public class FizBuzz0
{
    public void run() {
        int a = 3;
        int b = 5;
        
        for (int i=1; i <= 100; i=i+1) {
            String s = "";
            
            if (i==a) {
                a = a + 3;
                s = s + "Fizz";
            }
            if (i==b) {
                b = b + 5;
                s = s + "Buzz";
            }
            if (s=="") {
                System.out.println(i);
            } else {
                System.out.println(s);
            }
        }
    }
    
    public static void main(String[] args)
    {
        FizBuzz0 hw = new FizBuzz0();
        hw.run();
    }
}