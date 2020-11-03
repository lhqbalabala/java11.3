import java.util.Scanner;

public class _9_11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("input a,b,c,d,e,f: ");
        int a=input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        int d= input.nextInt();
        int e= input.nextInt();
        int f= input.nextInt();
        LinearEquation s=new LinearEquation(a,b,c,d,e,f);
        if(s.isSolvable()){
            System.out.println("X: "+s.getX());
            System.out.println("Y: "+s.getY());
        }
        else {
            System.out.println(" The equation has no solution.");
        }
    }
}
class LinearEquation{
    private int a,b,c,d,e,f;
    public LinearEquation(int a,int b,int c,int d,int e,int f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    public int getA(){
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }
    public boolean isSolvable(){
        if(a*d-b*c==0)return false;
        return true;
    }
    public double getX(){
        return (e*d-b*f)/(a*d-b*c);
    }
    public double getY(){
        return (a*f-e*c)/(a*d-b*c);
    }
}
