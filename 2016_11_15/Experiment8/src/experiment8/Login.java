package experiment8;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends JFrame {
	private JLabel nameLbl=new JLabel("用户名：");
	private JTextField nameTxt=new JTextField();
	private JLabel passLbl=new JLabel("密码：");
	private JTextField passTxt=new JTextField();
	private JButton okBtn=new JButton("ok");
	private JButton closeBtn=new JButton("close");
	
	public Login(){
		this.setLayout(new GridLayout(3,2));
		this.setSize(250, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(nameLbl);
		this.add(nameTxt);
		this.add(passLbl);
		this.add(passTxt);
		this.add(okBtn);
		this.add(closeBtn);
		okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nameTxt.getText().equals("admin")&&passTxt.getText().equals("123")){
                	JOptionPane.showMessageDialog(null, "welcome", "消息提示", JOptionPane.PLAIN_MESSAGE);
                }else{
                	JOptionPane.showMessageDialog(null, "fail", "消息提示", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
		closeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
	}
	public Login(String title){
		this();
		this.setTitle(title);
	}
	
	public static void main(String[] args) {
		Login mf=new Login("欢迎登陆!");
        mf.setVisible(true);
    }
}
