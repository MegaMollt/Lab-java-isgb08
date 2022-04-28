package gui;
import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame {

    private JFrame frame;
    private JPanel pTextInput, pButtons, pNotification;
    private JScrollPane scrollPane;
    private JTextArea printArea;
    private JLabel lRegistrationNumber, lBrand, lType, lName, lAge, lNr;
    private JTextField tRegistrationNumber, tBrand, tType, tName, tAge, tNotificationMessage, tNr;
    private JButton bPrintRegistry, bPrintVehicle, bAddVehicle, bDeleteVehicle;
    private Lyssnare l;


    public GUI() {

        frame = new JFrame();

        createCarPanel();
        createButtonPanel();
        createPrintArea();
        createNotificationPanel();

        frame.pack();
        frame.setSize(600, 500);
        frame.setResizable(false);
        frame.setLayout(new FlowLayout());
        frame.add(pTextInput);
        frame.add(pButtons);
        frame.add(scrollPane);
        frame.add(pNotification);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void createCarPanel () {
        lRegistrationNumber = new JLabel("Car Registration Number: ");
        tRegistrationNumber = new JTextField(10);
        lBrand = new JLabel("Car Brand");
        tBrand = new JTextField(10);
        lType = new JLabel("Car Type: ");
        tType = new JTextField(10);
        lName = new JLabel("Owner's Name: ");
        tName = new JTextField(10);
        lAge = new JLabel("Owner's Age: ");
        tAge = new JTextField(10);
        lNr = new JLabel("Car Nr: ");
        tNr = new JTextField(10);

        pTextInput = new JPanel(new GridLayout(10, 10));
        pTextInput.add(lRegistrationNumber);
        pTextInput.add(tRegistrationNumber);
        pTextInput.add(lBrand);
        pTextInput.add(tBrand);
        pTextInput.add(lType);
        pTextInput.add(tType);
        pTextInput.add(lName);
        pTextInput.add(tName);
        pTextInput.add(lAge);
        pTextInput.add(tAge);
        pTextInput.add(lNr);
        pTextInput.add(tNr);
       
    }

    private void createButtonPanel () {
        bAddVehicle = new JButton("Add Car");
        bDeleteVehicle = new JButton("Remove Car");
        bPrintVehicle = new JButton("Print Car");
        bPrintRegistry = new JButton("Print Registry");
        pButtons = new JPanel();
        pButtons.add(bAddVehicle);
        pButtons.add(bDeleteVehicle);
        pButtons.add(bPrintVehicle);
        pButtons.add(bPrintRegistry);
        
        l = new Lyssnare(this);
        bAddVehicle.addActionListener(l);
    }

    private void createPrintArea () {
        printArea = new JTextArea();
        scrollPane = new JScrollPane(printArea);
        printArea.setEditable(false);
        scrollPane.setPreferredSize(new Dimension (500, 200));
    }

    private void createNotificationPanel () {
        tNotificationMessage = new JTextField();
        tNotificationMessage.setPreferredSize(new Dimension (500, 20));
        tNotificationMessage.setHorizontalAlignment(JTextField.CENTER);
        tNotificationMessage.setBorder(null);
        tNotificationMessage.setEditable(false);

        pNotification = new JPanel();
        pNotification.add(tNotificationMessage);
    }

    public String getVehicleRegistrationNumber () {
        return tRegistrationNumber.getText();
    }
    public String getVehicleBrand () {
        return tBrand.getText();
    }
    public String getVehicleType () {
        return tType.getText();
    }
    public String getPersonName () {
        return tName.getText();
    }
    public String getPersonAge () {
        return tAge.getText();
    }

    public void printRegistry (String v) {
        printArea.append(v);
    }
    public void printClearArea () {
        printArea.setText(" ");
    }

    public void notifyVehicleHasBeenAdded () {
        tNotificationMessage.setText("Vehicle has been added to the registry.");
    }
    public void notifyVehicleHasBeenDeleted(String regNum) {
        tNotificationMessage.setText ("Vehicle " + regNum + " has been deleted." );
    }
    public void notifyNoSuchVehicle () {
        tNotificationMessage.setText ("There is no vehicle registered with this registration number.");
    }
    public void notifyRegistryIsEmpty () {
        tNotificationMessage.setText ("The registry is empty.");
    }

    public void notifyErrorMessage () {
        tNotificationMessage.setText("Error. Something went wrong.");
    }
}