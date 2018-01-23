package assignment6.springcore;

public class Hello
{
    String message;

    public Hello()
    {
        System.out.println("Hello Object Created");
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public void print()
    {
        System.out.println(this.message);
    }
}
