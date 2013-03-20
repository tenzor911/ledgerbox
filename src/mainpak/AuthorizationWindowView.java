package mainpak;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AuthorizationWindowView extends JFrame { 
    
    AuthorizationWindowView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        add(FieldForLogin);
        add(FieldForPassw);
        add(LogInButton);
        add(ExitAuthFormButton);
        setLocationRelativeTo(null); 
        settingAuthorizationForm();
        
    } 
    
    JTextField FieldForLogin = new JTextField();
    JTextField FieldForPassw = new JTextField();
    JButton LogInButton = new JButton("login");
    JButton ExitAuthFormButton = new JButton("exit");
   
    SpringLayout layout = new SpringLayout();
    
    void settingAuthorizationForm() {
        
        FieldForLogin.setBounds(50, 40, 200, 20);   
        FieldForLogin.setVisible(true);
        
        FieldForPassw.setBounds(50, 65, 200, 20);   
        FieldForPassw.setVisible(true);
        
        LogInButton.setBounds(50, 90, 97, 20);
        LogInButton.setVisible(true);
        
        ExitAuthFormButton.setBounds(153, 90, 97, 20);
        ExitAuthFormButton.setVisible(true);
        
        
        
        
        
    }
    
  
}
