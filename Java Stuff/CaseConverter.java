import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CaseConverter extends JApplet
     implements ActionListener
{
    private JTextField inputField;
    private final String UPPERCASE = "UPPERCASE";
    private final String LOWERCASE = "lowercase";
    private final String CLEAR = "Clear";


    public void init()
    {
        // GUI elements are added to the applet's content pane, so get it for us.
        Container contentPane = getContentPane();
        
        // set a layout with some spacing
        contentPane.setLayout(new BorderLayout(12,12));
        
        // add the title label
        JLabel title = new JLabel("Case Converter - A BlueJ demo applet");
        contentPane.add(title, BorderLayout.NORTH);
       
        // create the center part with prompt and text field and add it
        JPanel centerPanel = new JPanel();
        JLabel prompt = new JLabel("Enter a string:");
        centerPanel.add(prompt);
        inputField = new JTextField(16);
        centerPanel.add(inputField);
        
        contentPane.add(centerPanel, BorderLayout.CENTER);

        // make a panel for the buttons
        JPanel buttonPanel = new JPanel();
        
        // add the buttons to the button panel
        JButton uppercase = new JButton(UPPERCASE);
        uppercase.addActionListener(this);
        buttonPanel.add(uppercase);
        
        JButton lowercase = new JButton(LOWERCASE);
        lowercase.addActionListener(this); 
        buttonPanel.add(lowercase);
        
        JButton clear = new JButton(CLEAR);
        clear.addActionListener(this);
        buttonPanel.add(clear);
        
        // add the buttons panel to the content pane
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
    }


    public String getAppletInfo()
    {
        return "Title: Case Converter  \n" +
               "Author: Bruce Quig  \n" +
               "A simple applet that converts text to upper or lower case. ";
    }

    public void actionPerformed(ActionEvent evt)
    {
        String command = evt.getActionCommand();
        // if clear button pressed
        if(CLEAR.equals(command))
            inputField.setText("");
        // uppercase button pressed
        else if(UPPERCASE.equals(command))
            inputField.setText(inputField.getText().toUpperCase());
        // lowercase button pressed
        else if(LOWERCASE.equals(command))
            inputField.setText(inputField.getText().toLowerCase());
    }
}
