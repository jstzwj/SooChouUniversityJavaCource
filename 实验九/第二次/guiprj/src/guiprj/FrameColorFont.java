package guiprj;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.*;



public class FrameColorFont extends JFrame {
	JTextArea txt= new JTextArea("����");
	JCheckBox box1= new JCheckBox("����");
	JCheckBox box2= new JCheckBox("б��");
	JRadioButton btn1=new JRadioButton("��ɫ");
	JRadioButton btn2=new JRadioButton("��ɫ");
	Font style=txt.getFont();
	FrameColorFont(){
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.add(txt);
		this.add(box1);
		this.add(box2);
		this.add(btn1);
		this.add(btn2);
		box1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(((JCheckBox)(e.getSource())).isSelected()==true){
					style=style.deriveFont(style.getStyle()+Font.BOLD);
					txt.setFont(style);
				}else{
					style=style.deriveFont(style.getStyle()-Font.BOLD);
					txt.setFont(style);
				}
				
			}
		});
		box2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(((JCheckBox)(e.getSource())).isSelected()==true){
					style=style.deriveFont(style.getStyle()+Font.ITALIC);
					txt.setFont(style);
				}else{
					style=style.deriveFont(style.getStyle()-Font.ITALIC);
					txt.setFont(style);
				}
				
			}
		});
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(((JRadioButton)(e.getSource())).isSelected()==true){
					txt.setForeground(Color.BLUE);
					btn2.setSelected(false);
				}
				
			}
		});
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(((JRadioButton)(e.getSource())).isSelected()==true){
					txt.setForeground(Color.RED);
					btn1.setSelected(false);
				}
				
			}
		});
	}
}
