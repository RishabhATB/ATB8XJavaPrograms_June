package june.ex_05062025;

public class PrintMyBook extends Book{
    public PrintMyBook(String name,String author,int price) {
        super(name, author, price);
    }

    @Override
    void getdetails() {
        System.out.println(name);;
        System.out.println(author);;
        System.out.println(price);;
    }
}
