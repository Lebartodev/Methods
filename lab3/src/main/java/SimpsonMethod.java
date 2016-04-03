/**
 * Created by Sasha on 18.03.2016.
 */
public class SimpsonMethod {
    private double a, b;
    private int n;
    private double eps;

    public SimpsonMethod(double a, double b,double eps) {
        this.a = a;
        this.b = b;
        this.eps = eps;
    }
    public boolean getN(double h){
        double max = Function.d4func(a);
        double res = 0;
        for(double x = a;x<=b;x+=0.001)
            if(max<Function.d4func(x)){
                max = Function.d4func(x);

            }
        res =max/(180*Math.pow(h,4));
        if(Math.abs(res)<eps){
            return true;
        }
        else
            return false;

    }
    public double calculate() {
        double res = Function.func(a)+Function.func(b);

        for(int i = 1;i<100;i++){
            if(getN(i)) {
                n = 10;
                System.out.println(n);
                break;
            }
        }
        double h = (b - a) / (2*n);
        for (int i=1; i<=2*n-1; i+=2){
            res+=4*Function.func(a+h*i);//Значения с нечётными индексами, которые нужно умножить на 4.
            res+=2*Function.func(a+h*(i+1));//Значения с чётными индексами, которые нужно умножить на 2.
        }


        return res*h/3;
    }
}
