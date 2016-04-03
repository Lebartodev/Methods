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

        return 12 * (-3/(8 *Math.pow((1 + Math.sqrt(x)),2)* Math.pow(x,5/2)) - 3/(4* Math.pow((1 + Math.sqrt(x)),3)* Math.pow(x,2)) - 3/(4 *Math.pow((1 + Math.sqrt(x)),4) *Math.pow(x,(3/2))))* Math.cos(3*x) + (54* Math.cos(3*x))/(Math.pow((1 + Math.sqrt(x)),2)* Math.sqrt(x)) + (15/(16 *Math.pow((1 + Math.sqrt(x)),2)*Math.pow(x,(7/2))) + 15/(8* Math.pow((1 + Math.sqrt(x)),3)*Math.pow(x,3)) + 9/(4 *Math.pow((1 + Math.sqrt(x)),4)*Math.pow(x,(5/2))) + 3/(2 *Math.pow((1 + Math.sqrt(x)),5)*Math.pow (x,2))) *Math.sin(3*x) - 54 *(1/(4 *Math.pow((1 + Math.sqrt(x)),2) *Math.pow(x,(3/2))) + 1/(2 *Math.pow((1 + Math.sqrt(x)),3)* x))* Math.sin(3*x) + (81* Math.sin(3*x))/(1 + Math.sqrt(x));
    }


}
