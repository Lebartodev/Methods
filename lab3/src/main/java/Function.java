/**
 * Created by Sasha on 18.03.2016.
 */
public class Function {
    public static double func (double x){
        return Math.sin(3*x)/(Math.sqrt(x)+1);
    }
    public static double d2func (double x){

        return (-3*Math.cos(3* x))/((Math.pow(1 + Math.sqrt(x),2))* Math.sqrt(x)) + (1/((4* Math.pow(1 + Math.sqrt(x),2))* Math.pow(x,(3/2))) + 1/(2* Math.pow(1 + Math.sqrt(x),3)* x))*Math.sin(3 *x) - (9 *Math.sin(3* x))/(1 + Math.sqrt(x));
    }
    public static double d4func (double x){

        return 12 * (-3/(8 *Math.pow((1 + Math.sqrt(x)),2)
                * Math.pow(x,5/2)) - 3/(4* Math.pow((1 + Math.sqrt(x)),3)
                * Math.pow(x,2)) - 3/(4 *Math.pow((1 + Math.sqrt(x)),4)
                *Math.pow(x,(3/2))))* Math.cos(3*x)
                + (54* Math.cos(3*x))/(Math.pow((1 + Math.sqrt(x)),2)
                * Math.sqrt(x)) + (15/(16 *Math.pow((1 + Math.sqrt(x)),2)
                *Math.pow(x,(7/2))) + 15/(8* Math.pow((1 + Math.sqrt(x)),3)
                *Math.pow(x,3)) + 9/(4 *Math.pow((1 + Math.sqrt(x)),4)
                *Math.pow(x,(5/2))) + 3/(2 *Math.pow((1 + Math.sqrt(x)),5)
                *Math.pow (x,2))) *Math.sin(3*x) -
                54 *(1/(4 *Math.pow((1 + Math.sqrt(x)),2)*Math.pow(x,(3/2)))
                        + 1/(2 *Math.pow((1 + Math.sqrt(x)),3)* x))
                        * Math.sin(3*x) + (81* Math.sin(3*x))/(1 + Math.sqrt(x));
    }
    public static double  func2(double x, double y){
        return Math.pow((x+y),2)+0.5*(x+y);

    }
    /*def f(x, y):
    return (x + y) * (x + y) + 0.5 * (x + y)


def runge_kutta_3(h):
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


def runge_kutta_4(h):
    x = 0
    y = 0
    res = [[x, y], [0, 0], [0, 0], [0, 0]]
    i = 1
    while i < 4:
        fi0 = h * f(x, y)


*/
}