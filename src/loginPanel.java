import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class loginPanel extends JPanel implements ActionListener{
    protected JTextField idField;
    protected JPasswordField passwordField;
    protected JRadioButton passwordHider;

    protected JButton loginButton;

    private boolean passwordHidden;
    private final static String newline = "\n";

    public loginPanel() {
        super(new GridBagLayout());

        idField = new JTextField("Enter your doctor ID",20);
        idField.addActionListener(getInput);

        passwordField = new JPasswordField("Enter your pasword",20);
        passwordField.addActionListener(getInput);

        //passwordField.setEchoChar('0');
        //passwordField.setEchoChar('*');

        passwordHider = new JRadioButton("Hide Password");
        passwordHider.addActionListener(passwordState);
        passwordField.setEchoChar((char)0);
        passwordHidden = false;

        loginButton = new JButton("Login");
        loginButton.addActionListener(getInput);

        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;

        c.fill = GridBagConstraints.HORIZONTAL;
        add(idField, c);
        add(passwordField, c);
        add(passwordHider, c);
        add(loginButton, c);

        //c.fill = GridBagConstraints.VERTICAL;
        //add(passwordHider, c);

    }

    //The standard action listener referenced by this
    //Takes the inputs from the login fields and checks it against the database
    ActionListener getInput = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            String id = idField.getText();
            System.out.println(id);
            String password = passwordField.getText();
            System.out.println(password);
        }
    };

    //An action listener for the hide password radio button
    //Hides or shows password depending on the state of the button
    ActionListener passwordState = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            if (passwordHidden) {
                passwordField.setEchoChar((char)0);
                passwordHidden = false;
            }
            else {
                passwordField.setEchoChar('*');
                passwordHidden = true;
            }
        }
    };

    public void actionPerformed(ActionEvent e) {
    }
}

