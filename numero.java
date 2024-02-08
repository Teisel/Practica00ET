public class numero {
    private int num;
    private numero next;

    public numero()
    {

    }

    public numero(int n, numero next)
    {
        this.num = n;
        this.next = next;
    }

    public int getNum()
    {
        return this.num;
    }

    public void setNum(int num)
    {
        this.num = num;
    }

    public numero getNext()
    {
        return this.next;
    }

    public void setNext(numero next)
    {
       this.next = next;
    }
}
