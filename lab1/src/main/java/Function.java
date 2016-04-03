import java.lang.Math;
public class Function {

    public static double  function(double x){

        return (Math.pow(x,3)-5.4*Math.pow(x,2)-2.5*x+12.5);


    }
    public static double dfunction(double x){
        return (3*Math.pow(x,2)-10.8*x-2.5);
    }
    public static double func1(double x,double y){
        return Math.sin(x+1)-y-1.2;

    }
    public static double func1(double x){
        return Math.sin(x+1)-1.2;

    }
    public static double func2(double x,double y){
        return 2*x+Math.cos(y)-2;

    }
    public static double func2(double y){
        return (2-Math.cos(y))/2;

    }
    public static double dfunc1x(double x,double y){
        return Math.cos(x+1);

    }
    public static double dfunc2x(double x,double y){
        return 2;

    }
    public static double dfunc1y(double x,double y){
        return -1;

    }
    public static double dfunc2y(double x,double y){
        return -Math.sin(y);

    }

}
