
public class NewtonMethod {
    public double x_k(double x){
        double res =(x-(Function.function(x)/Function.dfunction(x)));
        return (x-(Function.function(x)/Function.dfunction(x)));

    }
    private int iter;
    private double x,eps;

    public NewtonMethod(int iter,double eps,double x){
        this.iter=iter;
        this.eps=eps;
        this.x=x;
        calculate();

    }
    public double checkRoots(){
        return Function.function(x);

    }
    private void calculate(){
        int  iterations=0;
        for(int iter = 1; eps < Math.abs(x_k(x)-x); iter++)
        {

            if(Function.dfunction(x) == 0)
                break;

            x = x_k(x);
            iterations=iter;


        }
        System.out.println("x= "+x);
        System.out.println("Iterations: "+iterations);

    }


}
