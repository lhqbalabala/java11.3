import java.util.Scanner;

public class _9_10 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("input a,b,c: ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        QuadraticEquation s=new QuadraticEquation(a,b,c);
        if(s.getDiscriminant()==1){
            System.out.println(s.getRoot1()+" "+s.getRoot2());
        }
        else if(s.getDiscriminant()==0){
            System.out.println(s.getRoot1());
        }
        else{
            System.out.println("The equation has no roots.");
        }


    }
}
class QuadraticEquation{
    private int a;
    private int b;
    private int c;
    public QuadraticEquation(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }
    public int getDiscriminant(){
        if(b*b-4*a*c<0)return -1;
        else if(b*b-4*a*c==0)return 0;
        return 1;
    }
    public double getRoot1(){
        return (-b+Math.sqrt(b*b-4*a*c))/(2*a);
    }
    public double getRoot2(){
        return (-b-Math.sqrt(b*b-4*a*c))/(2*a);
    }

}
