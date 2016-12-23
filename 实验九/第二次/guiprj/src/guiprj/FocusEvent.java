package guiprj;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class FocusEvent extends JFrame implements ActionListener{
	JTextField txt1=new JTextField(5);
	JTextField txt2=new JTextField(5);
	JTextField txt3=new JTextField(5);
	JButton btn=new JButton("х╥хо");
	FocusEvent(){
		this.setLayout(new FlowLayout());
		this.add(txt1);
		this.add(txt2);
		this.add(txt3);
		this.add(btn);
		this.setSize(500,200);

		txt1.addKeyListener(new KeyListener(){
			public void keyTyped(KeyEvent e) {
				if(e.getKeyCode()!=KeyEvent.VK_BACK_SPACE){
					JTextField txt=(JTextField)(e.getSource());
					if(txt.getText().length()>=4){
						txt2.requestFocusInWindow();
					}
				}
			}
			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		});
		txt1.addFocusListener(new FocusListener(){
			public void focusGained(java.awt.event.FocusEvent e) {
				((JTextField)(e.getSource())).setText("");
			}
			public void focusLost(java.awt.event.FocusEvent e) {}
		});
		txt2.addKeyListener(new KeyListener(){
			public void keyTyped(KeyEvent e) {
				if(e.getKeyCode()!=KeyEvent.VK_BACK_SPACE){
					JTextField txt=(JTextField)(e.getSource());
					if(txt.getText().length()>=4){
						txt3.requestFocusInWindow();
					}
				}
			}
			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		});
		txt2.addFocusListener(new FocusListener(){
			public void focusGained(java.awt.event.FocusEvent e) {
				((JTextField)(e.getSource())).setText("");
			}
			public void focusLost(java.awt.event.FocusEvent e) {}
		});
		txt3.addKeyListener(new KeyListener(){
			public void keyTyped(KeyEvent e) {
				if(e.getKeyCode()!=KeyEvent.VK_BACK_SPACE){
					JTextField txt=(JTextField)(e.getSource());
					if(txt.getText().length()>=4){
						btn.requestFocusInWindow();
					}
				}
			}
			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		});
		txt3.addFocusListener(new FocusListener(){
			public void focusGained(java.awt.event.FocusEvent e) {
				((JTextField)(e.getSource())).setText("");
			}
			public void focusLost(java.awt.event.FocusEvent e) {}
		});
		btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		this.dispose();
	}
}
