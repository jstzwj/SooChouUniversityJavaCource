package guiprj;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginDialog extends JDialog implements ActionListener{
	JLabel name=new JLabel("�û���");
	JLabel password=new JLabel("����");
	
	JTextField name_txt=new JTextField(20);
	JTextField password_txt=new JTextField(20);
	
	JButton ok_btn=new JButton("ȷ��");
	JButton cancel_btn=new JButton("ȡ��");
	LoginDialog(){
		this.setLayout(new GridLayout(3,2));
		this.add(name);
		this.add(name_txt);
		
		this.add(password);
		this.add(password_txt);
		
		this.add(ok_btn);
		this.add(cancel_btn);
		
		this.setSize(300, 200);
		ok_btn.addActionListener(this);
		cancel_btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ok_btn){
			if(name_txt.getText().equals("admin")&&password_txt.getText().equals("123")){
				JOptionPane.showMessageDialog(null, "��½�ɹ�", "��Ϣ��ʾ", JOptionPane.QUESTION_MESSAGE);
				this.dispose();
			}else{
				JOptionPane.showMessageDialog(null, "��½ʧ��", "��Ϣ��ʾ", JOptionPane.ERROR_MESSAGE);
				System.exit(ABORT);
			}
		}
		if(e.getSource()==cancel_btn){
			System.exit(ABORT);
		}
	}
}
