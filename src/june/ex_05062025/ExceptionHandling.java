package june.ex_05062025;

public class ExceptionHandling {
    public static void main(String[] args) {
       ExceptionHandling exc = new ExceptionHandling();
       exc.div();

    }
    public void div(){
        try {
            int a = 100;
            int b = 10;
            int c = 0;
            int div1 = a / b;
            System.out.println("Div1 is done");
            int div2 = a/c;
            System.out.println("Div2 is done");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("end of program");
        }

    }
}
