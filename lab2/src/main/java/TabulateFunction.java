import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sasha on 17.03.2016.
 */
public class TabulateFunction {
    double a=2,b=3.5;
    int n=3;
    private List<Point> points = new ArrayList<Point>();
    public  double  getM(int n){
        double res=0;
        for(double i = 0;i<1;i=i+0.1){
            double tmp = Function.dfunc(a+(b-a)*i,n);
            if(res<tmp){
                res = tmp;


            }
            System.out.println(tmp);
            //System.out.println(i);

        }
        return res;

    }
    public void findGap(double a,double b,double eps){
        double x0=a,x3=b;
        double h = (a-b)/n;
        double res = 1;
        double xs[] = new double[]{x0,x0+h,x0+2*h,x3};


        while(x0<x3||res>eps) {
            for(double e=x0;e<x3;e+=0.1) {
                for (double x = x0; x < x3; x += 0.1) {
                    System.out.println(res = (getM(n + 1) / factorial(n + 1)) * Math.abs(getP(n + 1, xs, x)));
                }


            }
            x3-=0.1;
            h = (x0-x3)/n;
            xs= new double[]{x0,x0+h,x0+2*h,x3};
            System.out.println("x3 = "+x3);
        }

    }
    public double getP(int n,double[] xs,double x){
        double res = 1;
        for(int i=0;i<n;i++){
            res*=x-xs[i];
        }
        return res;

    }
    public int factorial(int num) {
        int fact=1;

        for (; num > 0; fact *= num--);

        return fact;
    }
    public void tabulate(int n){
        double q = (b-a)/n;
        for(double i = 0;a+i<b;i+=q){
            System.out.println(Function.func(i));
            points.add(new Point(i,Function.func(i)));
        }

    }
}
