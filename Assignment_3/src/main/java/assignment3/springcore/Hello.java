package assignment3.springcore;

public class Hello
{
    private String message;

    public Hello()
    {
        System.out.println("In Hello class constructor");
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