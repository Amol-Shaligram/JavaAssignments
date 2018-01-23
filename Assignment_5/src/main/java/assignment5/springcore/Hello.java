package assignment5.springcore;

public class Hello
{
    private String message;

    public Hello()
    {
        System.out.println("Hello bean created !");
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