import info.monitorenter.gui.chart.Chart2D;
import info.monitorenter.gui.chart.ITrace2D;
import info.monitorenter.gui.chart.traces.Trace2DSimple;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class main {
    public static void main(String[] args) {
        draw();
        //(Math.pow(x,3)-5.4*Math.pow(x,2)-2.5*x+12.5);
        /*Scanner in = new Scanner(System.in);
        System.out.println("---------Newton-------------");
        System.out.println("x0= ");
        double  x=in.nextDouble();
        System.out.println("eps=");
        double eps = in.nextDouble();

        NewtonMethod nm = new NewtonMethod(100,eps,x);
        System.out.println("f(x)= "+nm.checkRoots());

        System.out.println("---------HalfDiv---------[a,b]----");
        System.out.println("a= ");
        double  a=in.nextDouble();
        System.out.println("b=");
        double b = in.nextDouble();
        System.out.println("eps=");
        double eps1 = in.nextDouble();
        HalfDivMethod hlm=new HalfDivMethod(x,b,eps);

        System.out.println("f(x)= "+hlm.checkRoots());*/

        System.out.println("---------System Ur Newton-------------");
       SysNewton nm2 = new SysNewton(-2,-2,0.01);
        System.out.println("--------Modif Newton's Method---------------- ");
        SysNewtonModif nmm2 = new SysNewtonModif(-2,-2,0.001);




    }
    public static void draw() {
        Chart2D chart = new Chart2D();
        ITrace2D graph = new Trace2DSimple();
        chart.addTrace(graph);
        for (double i = -5; i < 6; i+=0.001) {
            graph.addPoint(i, Function.func1(i));

        }
        ITrace2D graph2 = new Trace2DSimple();
        chart.addTrace(graph2);
        for (double i = -5; i < 6; i+=0.001) {
            graph2.addPoint(Function.func2(i), i);
        }


        JFrame frame = new JFrame("Main");
        frame.getContentPane().add(chart);
        frame.setSize(800, 500);
        frame.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
        frame.setVisible(true);
    }

}
