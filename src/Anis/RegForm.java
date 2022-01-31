package Anis;

        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.sql.SQLException;
        import java.util.regex.Pattern;
        import javax.swing.*;
        import javax.swing.border.LineBorder;

public class RegForm extends JFrame {

    public RegForm(){
        setTitle("REGISTRATION");
        setSize(500,460);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        Font labelFont = (new Font("Arial", Font.BOLD,16));

        JPanel headerpanel1 = new JPanel();
        headerpanel1.setBackground(Color.YELLOW);
        headerpanel1.setBounds(5,5,490,60);
        add(headerpanel1);

        JLabel headerTxt = new JLabel("Registration Form");
        headerTxt.setFont(new Font("Arial", Font.BOLD,30));
        headerpanel1.add(headerTxt);

        JPanel inputpanel = new JPanel();
        inputpanel.setBackground(new Color(137,207,240));
        inputpanel.setBounds(5,70,490,425);
        inputpanel.setLayout(null);
        add(inputpanel);

        ///NameField
        JLabel namelabel = new JLabel("Name  :");
        namelabel.setBounds(130,5,100,25);
        namelabel.setFont(labelFont);
        inputpanel.add(namelabel);

        JTextField nameTxt = new JTextField();
        nameTxt.setBounds(200,5,200,25);
        nameTxt.setFont(labelFont);
        inputpanel.add(nameTxt);

        ///EmailField
        JLabel emaillabel = new JLabel("Email  :");
        emaillabel.setBounds(130,50,100,25);
        emaillabel.setFont(labelFont);
        inputpanel.add(emaillabel);

        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(200,50,200,25);
        emailTxt.setFont(labelFont);
        inputpanel.add(emailTxt);

        ///PasswordField
        JLabel passlabel = new JLabel("Password  :");
        passlabel.setBounds(95,100,100,25);
        passlabel.setFont(labelFont);
        inputpanel.add(passlabel);

        JTextField passTxt = new JTextField();
        passTxt.setBounds(200,100,200,25);
        passTxt.setFont(labelFont);
        inputpanel.add(passTxt);

        ///Confirm PasswordField
        JLabel conPasslabel = new JLabel("Confirm Password  :");
        conPasslabel.setBounds(30,150,170,25);
        conPasslabel.setFont(labelFont);
        inputpanel.add(conPasslabel);

        JTextField conPassTxt = new JTextField();
        conPassTxt.setBounds(200,150,200,25);
        conPassTxt.setFont(labelFont);
        inputpanel.add(conPassTxt);

        ///MobileField
        JLabel mobilelabel = new JLabel("Mobile  :");
        mobilelabel.setBounds(120,200,100,25);
        mobilelabel.setFont(labelFont);
        inputpanel.add(mobilelabel);

        JTextField mobileTxt = new JTextField();
        mobileTxt.setBounds(200,200,200,25);
        mobileTxt.setFont(labelFont);
        inputpanel.add(mobileTxt);

        ////AddressField
        JLabel addresslabel = new JLabel("Address  :");
        addresslabel.setBounds(110,250,100,25);
        addresslabel.setFont(labelFont);
        inputpanel.add(addresslabel);

        JTextField addressTxt = new JTextField();
        addressTxt.setBounds(200,250,200,25);
        addressTxt.setFont(labelFont);
        inputpanel.add(addressTxt);

        JButton regBtn = new JButton("Register");
        regBtn.setBounds(300,300,100,30);
        regBtn.setBackground(new Color(219,143,160));
        regBtn.setFont(labelFont);
        regBtn.setForeground(Color.WHITE);
        regBtn.setBorder(new LineBorder(Color.RED));
        //regBtn.setRequestFocusEnabled(false);
        regBtn.setFocusable(false);
        inputpanel.add(regBtn);

        JButton logBtn = new JButton("Login");
        logBtn.setBounds(100,300,100,30);
        logBtn.setBackground(new Color(93,161,217));
        logBtn.setFont(labelFont);
        logBtn.setForeground(Color.WHITE);
        logBtn.setBorder(new LineBorder(Color.BLUE));
        //logBtn.setRequestFocusEnabled(false);
        logBtn.setFocusable(false);
        inputpanel.add(logBtn);

        setVisible(true);

        logBtn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginForm();

            }
        });
        regBtn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = nameTxt.getText();
                String email = emailTxt.getText();
                String pass = passTxt.getText();
                String conPass = conPassTxt.getText();
                String mobile = mobileTxt.getText();
                String address = addressTxt.getText();

                //  Validation for Registration

                String userNameRegex = "^[a-zA-Z .]+$";

                String emailRegex = "^[a-z0-9]+@[a-z]+.[a-z]+$";

                String mobileRegex = "(\\+88)?-?01[3-9]\\d{8}";

                String passRegex = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%&*()]).{6,20}";


                if(!Pattern.matches(userNameRegex,userName))
                {
                    JOptionPane.showMessageDialog(null, "Only char is allowed!!");
                }
                else if(!Pattern.matches(emailRegex,email))
                {
                    JOptionPane.showMessageDialog(null, "In-valid Email!!");
                }

                else if(!Pattern.matches(passRegex,pass))
                {
                    JOptionPane.showMessageDialog(null, "At least 1 digit, 1 lower, 1 upper, 1 special char and length 6-20 required");
                }
                else if(!conPass.equals(conPass))
                {
                    JOptionPane.showMessageDialog(null, "Password and confirm password is not matching!!");
                }
                else if(!Pattern.matches(mobileRegex,mobile))
                {
                    JOptionPane.showMessageDialog(null, "In-valid Mobile Number!!");
                }
                else if(address.equals("")) {
                    JOptionPane.showMessageDialog(null, "In valid address");
                }

                else
                {
                    String insertQuery = "INSERT INTO `secf`(`Username`, `Email`, `Password`, `Mobile`, `Address`) VALUES ('"+userName+"','"+email+"','"+pass+"','"+mobile+"','"+address+"')";
                    DbConnect db = new DbConnect();
                    db.RegisterInsert(insertQuery);
                }
            }
        });
    }
}