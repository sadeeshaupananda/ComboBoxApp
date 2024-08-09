import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ComboBoxApp1 extends JFrame {
    JComboBox<String> cmbSemester;
    Vector<String> Subjects;
    DefaultComboBoxModel<String> cmbModel;
    JComboBox<String> cmbSubjects;

    ComboBoxApp1() {
        setTitle("Combo App");
        setSize(500, 300);
        setLocation(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //  Define data using a vector
        Vector<String> sem = new Vector<>();
        sem.add("Select semester");
        sem.add("sem1");
        sem.add("sem2");
        sem.add("sem3");
        sem.add("sem4");
        sem.add("sem5");
        sem.add("sem6");

        //  Create an empty comboBox
        cmbSemester = new JComboBox<>();

        //  Create comboBox model using above data
        DefaultComboBoxModel<String> cmbModel = new DefaultComboBoxModel<>(sem);

        // Add data to the comboBox
        cmbSemester.setModel(cmbModel);

        // Create subjects comboBox
        Subjects = new Vector<>();
        Subjects.add("Select a subject");

        cmbSubjects = new JComboBox<>();
        DefaultComboBoxModel<String> cmbModel1 = new DefaultComboBoxModel<>(Subjects);

        cmbSubjects.setModel(cmbModel1);

        // Set layout and add components
        Container con = getContentPane();
        FlowLayout lay = new FlowLayout();
        con.setLayout(lay);

        con.add(cmbSemester);
        con.add(cmbSubjects);

        // Add action listener to cmbSemester
        cmbSemester.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cmbSemesterApr(e);
            }
        });

        setVisible(true);
    }

    public void cmbSemesterApr(ActionEvent e) {
        // Get the selected item
        Object s_item = cmbSemester.getSelectedItem();

        if (s_item.equals("sem1")) {
            Subjects = new Vector<>();
            Subjects.add("Select a subject");
            Subjects.add("PC");
            Subjects.add("IS");
            Subjects.add("IP");
            Subjects.add("IM");
            Subjects.add("CS");

            cmbModel = new DefaultComboBoxModel<>(Subjects);
            cmbSubjects.setModel(cmbModel);
        }
        // Add more conditions for other semesters as needed
    }

    public static void main(String[] args) {
        new ComboBoxApp1();
    }
}
