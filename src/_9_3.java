import java.util.Date;
public class _9_3 {
    public static void main(String[] args) {
        long l = 10000;
        Date date = new Date(l);
        for(int i = 0; i < 8; i++) {
            date.setTime(l);
            System.out.println(l + ": " + date.toString());
            l *= 10;
        }


    }

}
