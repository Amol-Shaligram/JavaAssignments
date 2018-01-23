package assignment7.springcore;

public class Hello
{
    private String message;

    public Hello()
    {
        System.out.println("hello object created !");
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