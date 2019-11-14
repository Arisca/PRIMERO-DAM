package TareasTema6;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JPasswordField;

public class Ejercicio1 
{
    
    public static void main(String[] args) 
    {
     final JFrame f1=new JFrame();
     f1.setTitle("Validador de Contraseñas");
     JPanel p1=new JPanel();
     final JPasswordField jt1= new JPasswordField(10);
     jt1.setBounds(0, 0, 264, 50);
     JButton b1=new JButton("Válidar");
     b1.setFont(new Font("Verdana", Font.PLAIN, 22));
     b1.setBounds(260, 0, 115, 50);
     p1.setLayout(null);
     p1.add(jt1);
     p1.add(b1);      
     f1.getContentPane().add(p1);
      
    f1.setSize(391, 86);              
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    f1.setLocationRelativeTo(null); 
    f1.setVisible(true);
     
    b1.addActionListener(new ActionListener()
    {
 
    	public void actionPerformed(ActionEvent e)
        {
    		@SuppressWarnings("deprecation")
			String password=jt1.getText();
            
            f1.dispose();
            check_password(password);
        }             
    });   
 }
    
 public static void check_password(String s) 
 {    
    try
    {
        if (s.length()<8)
            throw new Excepcionpassword1();
    }
    catch(Excepcionpassword1 e1){}
    
    try
    {
    	if(!Pattern.compile("[0-9]").matcher(s).find())
    		throw new Excepcionpassword2();
    }
   catch(Excepcionpassword2 e2){}
     try
     {
     	if(s.equals(s.toLowerCase()))
     		throw new Excepcionpassword3();
     }
     catch(Excepcionpassword3 e3){}
 	}
}


