package task03;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table {
    public static Object[][] GetValues(int a, int b, int h){
    int steps = Math.abs(a-b)/h;
    Object[][] table = new Object[steps + 1][2];
    for (int i = 0; i <= steps; i++){
        table[i][0] = a+i*h;
        table[i][1] = Math.tan(a+i*h);
    }
    return table;
    }
    public void DrawTable(int a, int b, int h) {

        Object[][] arr = GetValues(a,b,h);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {"Agrument","Result"};
        JTable table = new JTable(arr, columnNames);
        JScrollPane scrollPane = new JScrollPane();

        frame.setTitle("Table");
        frame.add(table);
        frame.setSize(300,600);
        frame.setVisible(true);
    }

}
