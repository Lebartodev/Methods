/**
 * Created by alexnadr on 19.02.16.
 */
public class HalfDivMethod {
    private double a,b,c,eps;

    public HalfDivMethod(double a,double b,double eps) {
        this.b = b;
        this.eps = eps;
        this.a=a;
        calculate();
    }
    public double checkRoots(){
        return Function.function(c);
    }
    private void calculate(){
        int iter=0;
        while(b-a>eps){
            c=(a+b)/2;
            if(Function.function(b) * Function.function(c) < 0)
                a = c;
            else
                b=c;
            iter++;


        }
        System.out.println("x= "+c);
        System.out.println("Iterations: "+iter);

    }
}
