package guiprj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;
import java.awt.FileDialog; 

import javax.swing.*;

public class FrameMain extends JFrame{
	JMenuBar  br=new  JMenuBar() ;
	
	JMenu jm_layout=new JMenu("����") ;
	JMenu jm_event=new JMenu("�¼�") ;
	JMenu jm_dialog=new JMenu("�Ի���") ;
	
	JMenuItem jm_layout_t1=new JMenuItem("FlowLayout����");
	JMenuItem jm_layout_t2=new JMenuItem("��ϲ���");
	
	JMenuItem jm_event_t1=new JMenuItem("�ı�������ɫ");
	
	JMenuItem jm_dialog_t1=new JMenuItem("���ı��ļ��Ի���");
	
	FileDialog fd=new FileDialog(this, "���ļ��Ի���",FileDialog.LOAD);
	
	LoginDialog login=new LoginDialog();
	
	FrameMain(){
		this.setSize(500, 500);
		
		jm_layout.add(jm_layout_t1);
		jm_layout.add(jm_layout_t2);
		
		jm_event.add(jm_event_t1);
		
		jm_dialog.add(jm_dialog_t1);
		
		br.add(jm_layout);
		br.add(jm_event);
		br.add(jm_dialog);
		
		this.setJMenuBar(br) ;
		
		this.addWindowListener(new WindowAdapter(){
			public void windowOpened(WindowEvent e) {
				login.setVisible(true);
			}
		});
		
		
		jm_layout_t1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				FocusEvent focusevent=new FocusEvent();
				focusevent.setVisible(true);
			}
		});
		jm_layout_t2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Calculator calculator=new Calculator();
				calculator.setVisible(true);
			}
		});
		jm_event_t1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				FrameColorFont framecolorfont=new FrameColorFont();
				framecolorfont.setVisible(true);
			}
		});
		//
		jm_dialog_t1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					fd.setVisible(true);
					if(fd.getFile()!=null&&!fd.getFile().endsWith(".txt")){
						throw (new ErrorFileType());
					}
				} catch (ErrorFileType e1) {
					JOptionPane.showMessageDialog(null, e1.toString(), "��Ϣ��ʾ", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args){
		FrameMain mainWindow= new FrameMain();
		
		mainWindow.setVisible(true);
	}
}
