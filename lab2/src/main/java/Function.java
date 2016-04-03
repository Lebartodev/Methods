/**
 * Created by Sasha on 17.03.2016.
 */
public class Function {
    public static double func(double x){
        return Math.PI*x*x*Math.exp(5*x)+1/x;

    }
    public static double dfunc(double x, int n){
        switch (n){
            case 0:return func(x);
            case 1:return x*(Math.PI*(5*x+2)*Math.exp(5*x)-Math.pow(x,-3));
            case 2:return (Math.PI*Math.exp(5*x)*(25*x*x+20*x+2)*Math.pow(x,3)+2)/Math.pow(x,3);
            case 3:return (5*Math.PI*Math.exp(5*x)*(25*x*x+30*x+6)*Math.pow(x,4)-6)/Math.pow(x,4);
            case 4:return (25*Math.PI*Math.exp(5*x)*(25*x*x+40*x+12)*Math.pow(x,5)+24)/Math.pow(x,5);
        }
        return 0;
    }

}
