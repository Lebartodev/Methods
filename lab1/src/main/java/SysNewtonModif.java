/**
 * Created by alexnadr on 20.02.16.
 */
public class SysNewtonModif {
    double x, y,eps;

    public SysNewtonModif(double x, double y, double eps) {
        this.x = x;
        this.y = y;
        this.eps=eps;
        calculate();
    }

    public double[][] ober_matr(double[][] a) {
        double det, aa;
        double res[][] = new double[2][2];
        det = a[0][0] * a[1][1] - a[0][1] * a[1][0];
        aa = a[0][0];
        res[0][0] = a[1][1] / det;
        res[1][1] = aa / det;
        aa = a[0][1];
        res[0][1] = -a[1][0] / det;
        res[1][0] = -aa / det;
        return res;
    }

    public void calculate() {

        nuton(x, y,eps);
    }

    void nuton(double x, double y,double eps) {
        int i = 1;
        double[][] a;
        a = new double[2][2];
        double[] b = new double[2], c = new double[2];

        double x0=x, y0=y;
        do {
            a[0][0] = Function.dfunc1x(x0, y0);
            a[1][0] = Function.dfunc1y(x0, y0);
            a[0][1] = Function.dfunc2x(x0, y0);
            a[1][1] = Function.dfunc2y(x0, y0);
            a = ober_matr(a);
            b[0] = Function.func1(x, y);
            b[1] = Function.func2(x, y);
            c[0] = a[0][0] * b[0] + a[0][1] * b[1];
            c[1] = a[1][0] * b[0] + a[1][1] * b[1];
            x = x - c[0];
            y = y - c[1];
            i++;
        }

        while (Math.abs(b[0])>eps||Math.abs(b[1])>eps);

        System.out.println("Y="+y+" X="+x);
        System.out.println("Iterations = "+i);

    }
}
