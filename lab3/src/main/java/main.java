import info.monitorenter.gui.chart.Chart2D;
import info.monitorenter.gui.chart.ITrace2D;
import info.monitorenter.gui.chart.traces.Trace2DSimple;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Sasha on 18.03.2016.
 */
public class main {
    public static void main(String[] args) {
        /*SimpsonMethod sm = new SimpsonMethod(1,2,0.001);
        System.out.println("-----Simpson-----");
        System.out.println(sm.calculate());
        TrapMethod tm = new TrapMethod(1,2,0.001);
        System.out.println("-----Trap-----");
        System.out.println(tm.calculate());
        */
        Chart2D chart = new Chart2D();
        ITrace2D graph = new Trace2DSimple();
        chart.addTrace(graph);
        ///////
        RungeKutta rk = new RungeKutta();
        System.out.println("runge_kutta_3:");
        for(int i = 0;i<4;i++){
            System.out.println(rk.runge3(0.1)[i][0]+" "+rk.runge3(0.1)[i][1]);
            graph.addPoint(rk.runge3(0.1)[i][0],rk.runge3(0.1)[i][1]);
        }


        System.out.println("runge_kutta_4:");
        for(int i = 0;i<4;i++){
            System.out.println(rk.runge4(0.1)[i][0]+" "+rk.runge4(0.1)[i][1]);
        }
        System.out.println("forecast:");
        for(int i = 0;i<4;i++){
            System.out.println(rk.forecast(0.1)[i][0]+" "+rk.forecast(0.1)[i][1]);
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
        /*print("runge_kutta_3:", runge_kutta_3(0.1), '\n')
print("runge_kutta_4:", runge_kutta_4(0.1), '\n')
print("forecast:", forecast(0.1), '\n')*/

    }

}
