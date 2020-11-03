import java.util.Date;
import java.util.Random;
public class _9_6 {

    public static void sort(int[] a)
    {
        int N = a.length;
        int min,t;
        for (int i = 0; i < N-1; i++)
        {
            min = i;
            for(int j = i+1; j<N ; j++){
            if (a[j]< a[min]) min = j;}
            t=a[min];a[min]=a[i];a[i]=t;
        }
    }

    public static void main(String[] args) {

        int NUM = 100000;

        int[] number = new int[NUM];
        Random random = new Random();

        for (int i = 0; i < NUM; i++)
            number[i] = random.nextInt(100000);

        StopWatch stopWatch = new StopWatch();
        sort(number);
        stopWatch.stop();

        System.out.println(stopWatch.getElapsedTime() + "ms");

    }
}
class StopWatch{
    private  Date startTime;
    private  Date endTime;
    public StopWatch(){
        startTime=new Date();
    }
    public void start(){
        startTime=new Date();
    }
    public void stop(){
        endTime=new Date();
    }
    public long getElapsedTime(){
        return endTime.getTime()-startTime.getTime();
    }

}