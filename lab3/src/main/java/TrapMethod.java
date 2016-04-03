/**
 * Created by Sasha on 18.03.2016.
 */
public class TrapMethod {
    private double a, b;
    private int n;
    private double eps;

    public TrapMethod(double a, double b,double eps) {
        this.a = a;
        this.b = b;
        this.eps = eps;
    }
    public boolean getN(double h){
        double max = 0;
        double res = 0;
        for(double x = a;x<=b;x+=0.001)
        if(max<Function.d2func(x)){
            max = Function.d2func(x);

        }
        res =max*(b-a)*Math.pow(h,2)/24;
        if(res<eps){
            return true;
        }
        else
            return false;

    }
    public double calculate() {
        double res = Function.func(a)+Function.func(b);
        for(int i = 1;i<100;i++){
            if(getN((b - a) / i)) {
                n = i;
                break;
            }
        }
        double h = (b - a) / n;
        for (int i = 1; i <= n; i++) {
            res += 2*Function.func(a+h*i);


        }

        return res*h/2;
    }
}
