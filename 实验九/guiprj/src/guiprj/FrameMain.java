package guiprj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class FrameMain extends JFrame{
	JMenuBar  br=new  JMenuBar() ;
	
	JMenu jm_layout=new JMenu("布局") ;
	JMenu jm_event=new JMenu("事件") ;
	JMenu jm_dialog=new JMenu("对话框") ;
	
	JMenuItem jm_layout_t1=new JMenuItem("FlowLayout布局");
	JMenuItem jm_layout_t2=new JMenuItem("混合布局");
	
	JMenuItem jm_event_t1=new JMenuItem("改变字体颜色");
	
	JMenuItem jm_dialog_t1=new JMenuItem("打开文本文件对话框");
	
	
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
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args){
		FrameMain mainWindow= new FrameMain();
		
		mainWindow.setVisible(true);
	}
}
