import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class TodoListApp {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static DefaultListModel<String> taskListModel = new DefaultListModel<>();
    private static JList<String> taskList = new JList<>(taskListModel);

    public static void main(String[] args) {
        JFrame frame = new JFrame("create your list");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1600, 750);

        // Layout setup
        frame.setLayout(new BorderLayout());

        // Task list setup
        JScrollPane scrollPane = new JScrollPane(taskList);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Input panel setup
        JPanel inputPanel = new JPanel();
        JTextField taskInputField = new JTextField(15);
        JButton addButton = new JButton("Add Task");
        JButton removeButton = new JButton("Remove Task");

        inputPanel.add(taskInputField);
        inputPanel.add(addButton);
        inputPanel.add(removeButton);

        frame.add(inputPanel, BorderLayout.SOUTH);

        // Add task button action
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String taskName = taskInputField.getText();
                if (!taskName.isEmpty()) {
                    Task task = new Task(taskName);
                    tasks.add(task);
                    taskListModel.addElement(task.toString());
                    taskInputField.setText("");  // Clear input field
                }
            }
        });

        // Remove task button action
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    tasks.remove(selectedIndex);
                    taskListModel.remove(selectedIndex);
                }
            }
        });

        frame.setVisible(true);
    }
}
