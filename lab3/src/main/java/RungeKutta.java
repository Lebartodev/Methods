import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexnadr on 19.03.16.
 */
public class RungeKutta {
    /*def runge_kutta_3(h):
    x = 0
    y = 0
    res = [[x, y], [0, 0], [0, 0], [0, 0]]
    i = 1
    while i < 4:
        fi0 = h * f(x, y)
        fi1 = h * f(x + h / 3, y + fi0 / 3)
        fi2 = h * f(x + 2 / 3 * h, y + 2 / 3 * fi1)
        y += (fi0 + 3 * fi2) / 4
        x += h
        res[i][0] = x
        res[i][1] = y
        i += 1
    return res

*/
    public double[][] runge3(double h){
        double x=0,y=0;
        double [] []res = new double[4][2];
        res[0][0]=0;
        res[0][1]=0;
        //points.add(new Point(x,y));
        int i = 1;
        double fi0=0,fi1=0,fi2=0;
        while (i<4){
            fi0 = h * Function.func2(x, y);
            fi1 = h * Function.func2(x + h /2, y + fi0 / 2);
            fi2 = h * Function.func2(x + h, y -fi0-2*fi1);
            y += (fi0 + 3 * fi2) / 4;
            x += h;
            res[i][0] = x;
            res[i][1] = y;
            i += 1;
        }
        return res;

    }
    /*def runge_kutta_3(h):
    x = 0
    y = 0
    res = [[x, y], [0, 0], [0, 0], [0, 0]]
    i = 1
    while i < 4:
        fi0 = h * f(x, y)
        fi1 = h * f(x + h / 3, y + fi0 / 3)
        fi2 = h * f(x + 2 / 3 * h, y + 2 / 3 * fi1)
        y += (fi0 + 3 * fi2) / 4
        x += h
        res[i][0] = x
        res[i][1] = y
        i += 1
    return res*/
    public double[][] runge4(double h){
        double x=0,y=0;
        double [] []res = new double[4][2];
        res[0][0]=0;
        res[0][1]=0;

        //points.add(new Point(x,y));
        int i = 1;
        double fi0=0,fi1=0,fi2=0,fi3=0;
        while (i<4){
            fi0 = h * Function.func2(x, y);
            fi1 = h * Function.func2(x + h / 2, y + fi0 / 2);
            fi2 = h * Function.func2(x + h / 2, y + fi1 / 2);
            fi3 = h * Function.func2(x + h, y + fi2);
            y += (fi0 + 2 * fi1 + 2 * fi2 + fi3) / 6;
            x += h;
            res[i][0] = x;
            res[i][1] = y;
            i += 1;
        }
        return res;

    }
    public double[][] forecast(double h){
        double x = 0;
        double y = 0;
        int i = 1;
        double[][] res = new double[4][2];
        res[0][0]=0;
        res[0][1]=0;
        while (i < 4) {
            double y_next = y + h * Function.func2(x, y);
            y_next = y + h / 2 * (Function.func2(x, y) + Function.func2(x + h, y_next));
            y = y_next;
            x += h;
            res[i][0] = x;
            res[i][1] = y;
            i += 1;
        }
        return res ;
    }

    /*def forecast(h):
    x = 0
    y = 0
    i = 1
    res = [[x, y], [0, 0], [0, 0], [0, 0]]
    while i < 4:
        y_next = y + h * f(x, y)
        y_next = y + h / 2 * (f(x, y) + f(x + h, y_next))
        y = y_next
        x += h
        res[i][0] = x
        res[i][1] = y
        i += 1
    return res*/

}
