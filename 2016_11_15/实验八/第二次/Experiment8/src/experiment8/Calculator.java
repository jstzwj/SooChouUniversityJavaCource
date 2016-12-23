package experiment8;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Calculator extends JFrame {
	private JPanel inner=new JPanel();
	private JTextField output=new JTextField("0");
	private LinkedList<JButton> btn_num=new LinkedList<JButton>();
	private LinkedList<JButton> btn_op=new LinkedList<JButton>();
	private String result="0";
	private int operator=-1;
	public Calculator(){
		this.setLayout(new BorderLayout());
		this.setSize(250, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		output.setEditable(false);
		output.setHorizontalAlignment(JTextField.RIGHT );
		
		
		this.add(output,BorderLayout.NORTH);
		this.add(inner,BorderLayout.CENTER);
		inner.setLayout(new GridLayout(4,4));
		
		for(int i=0;i<10;++i){
			btn_num.add(new JButton(Integer.toString(i)));
		}
		btn_op.add(new JButton("+"));
		btn_op.add(new JButton("-"));
		btn_op.add(new JButton("*"));
		btn_op.add(new JButton("/"));
		btn_op.add(new JButton("."));
		btn_op.add(new JButton("="));
		
		inner.add(btn_num.get(7));
		inner.add(btn_num.get(8));
		inner.add(btn_num.get(9));
		inner.add(btn_op.get(0));
		inner.add(btn_num.get(4));
		inner.add(btn_num.get(5));
		inner.add(btn_num.get(6));
		inner.add(btn_op.get(1));
		inner.add(btn_num.get(1));
		inner.add(btn_num.get(2));
		inner.add(btn_num.get(3));
		inner.add(btn_op.get(2));
		inner.add(btn_num.get(0));
		inner.add(btn_op.get(4));
		inner.add(btn_op.get(5));
		inner.add(btn_op.get(3));
		
		
		for(int i=0;i<10;++i){
			btn_num.get(i).addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					String cur=output.getText();
					if(cur.equals("0")){
						output.setText(""+btn_num.indexOf(e.getSource()));
					}else{
						output.setText(cur+btn_num.indexOf(e.getSource()));
					}
					
				}
				
			});
		}
		
		for(JButton each:btn_op){
			each.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(btn_op.indexOf(e.getSource())==4){
						if(!output.getText().contains(".")){
							output.setText(output.getText()+".");
						}
						
					}else if(btn_op.indexOf(e.getSource())==5){
						switch(operator){
						case 0:
							result=String.valueOf(Double.parseDouble(result)+Double.parseDouble(output.getText()));
							break;
						case 1:
							result=String.valueOf(Double.parseDouble(result)-Double.parseDouble(output.getText()));
							break;
						case 2:
							result=String.valueOf(Double.parseDouble(result)*Double.parseDouble(output.getText()));
							break;
						case 3:
							result=String.valueOf(Double.parseDouble(result)/Double.parseDouble(output.getText()));
							break;
						default:
							break;
						}
						if(result.endsWith(".0")){
							result=result.substring(0, result.length()-2);
						}else if(result.equals("infinity")){
							result="0";
						}
						output.setText(result);
					}else{
						result=output.getText();
						output.setText("0");
						operator=btn_op.indexOf(e.getSource());
					}
				}
			});
		}
	}
	public Calculator(String title){
		this();
		this.setTitle(title);
	}
	
	public static void main(String []args){
		Calculator cal=new Calculator("¼ÆËãÆ÷");
		cal.setVisible(true);
	}
}
