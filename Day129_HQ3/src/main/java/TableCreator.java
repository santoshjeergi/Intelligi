public class TableCreator implements Runnable{
    int x = 0;
    int idx = 0;

    TableCreator(int x, int idx)
    {
        this.x = x;
        this.idx = idx;
    }
    @Override
    public void run() {
        System.out.println(  idx +" times " + x + " is " + x*idx );
    }
}
