package prac09.number2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;

public class LabClassUI extends JFrame {

    private ArrayList<Student> students;
    private JButton findStudentBtn;
    private JTable table;
    private JPanel pN;
    private JMenuBar menuBar;
    private Box contents;

    public LabClassUI(ArrayList<Student> students) {
        super("Студенты");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);

        this.students = students;

        contents = new Box(BoxLayout.Y_AXIS);
        initSettingsPane();
        initStudentsPane();

        setContentPane(contents);
        setSize(500, 400);
        setVisible(true);

    }

    private void initSettingsPane() {
        pN = new JPanel(new FlowLayout());
        findStudentBtn = new JButton("Поиск студента");
        //pN.add(findStudentBtn);
        findStudentBtn.addActionListener(e->{
            try{
                findBtnClicked();
            }catch (StudentNotFoundException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });
        contents.add(new JScrollPane(pN));

        menuBar = new JMenuBar();
        menuBar.add(createSortSelector());
        menuBar.add(findStudentBtn);
        setJMenuBar(menuBar);
        //pN.add(createSortSelector());
    }

    private JMenu createSortSelector() {
        JMenu file = new JMenu("Сортировать по");
        JMenuItem byName = new JMenuItem("ФИО");
        JMenuItem byGPA = new JMenuItem("GPA");
        JMenuItem byId = new JMenuItem("Id");
        file.add(byName);
        file.add(byGPA);
        file.add(byId);
        file.addSeparator();

        byName.addActionListener(e -> sortStudents(new NameComparator()));
        byGPA.addActionListener(e -> sortStudents(new GpaComparator()));
        byId.addActionListener(e -> sortStudents(new IdComparator()));

        return file;
    }

    private void sortStudents(Comparator<Student> comp){
        for (int i = 1; i < students.size(); i++) {
            Student current = students.get(i);
            int j = i-1;
            for(; j >= 0 && comp.compare(current, students.get(j)) < 0; j--) {
                students.set(j+1, students.get(j));
            }
            students.set(j+1, current);
        }
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();

        for (int i = 0; i < students.size(); i++) {
            dtm.removeRow(i);
            Student st = students.get(i);
            dtm.insertRow(i, new Object[]{st.getId(), st.getName(), st.getGpa()});
        }
    }
    private void findBtnClicked() throws StudentNotFoundException {
        String s = JOptionPane.showInputDialog("Введите искомые ФИО");
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getName().equals(s)){
                JOptionPane.showMessageDialog(this, "Найден студент: "+
                        students.get(i).toString());
                return;
            }
        }
        throw new StudentNotFoundException(s);
    }

    private void initStudentsPane() {
        Object[] columnHeader = new String[] {"ID", "Name", "GPA"};
        Object [][] array = new String[students.size()][3];
        for(int i = 0; i < students.size(); i++){
            array[i][0] = ((Integer)(students.get(i).getId())).toString();
            array[i][1] = ((students.get(i).getName()));
            array[i][2] = ((Integer)(students.get(i).getGpa())).toString();
        }

        //table = new JTable(array, columnHeader);
        table = new JTable( new DefaultTableModel(array, columnHeader)){
            @Override
            public boolean isCellEditable(int x, int y){
                return false;
            }
        };
        contents.add(new JScrollPane(table));
    }
}
