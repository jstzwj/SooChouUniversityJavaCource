package experiment8;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Calculator extends JFrame {
	private JPanel inner=new JPanel();
	private JTextArea output=new JTextArea();
	private JButton btn1=new JButton("1");
	private JButton btn2=new JButton("2");
	private JButton btn3=new JButton("3");
	private JButton btn4=new JButton("4");
	private JButton btn5=new JButton("5");
	private JButton btn6=new JButton("6");
	private JButton btn7=new JButton("7");
	private JButton btn8=new JButton("8");
	private JButton btn9=new JButton("9");
	private JButton btn0=new JButton("0");
	private JButton btn_plus=new JButton("+");
	private JButton btn_min=new JButton("-");
	private JButton btn_multi=new JButton("*");
	private JButton btn_div=new JButton("/");
	private JButton btn_dot=new JButton(".");
	private JButton btn_equal=new JButton("=");
	
	public Calculator(){
		this.setLayout(new GridLayout(2,1));
		this.setSize(250, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		output.setEditable(false);
		
		this.add(output);
		this.add(inner);
		inner.setLayout(new GridLayout(4,4));
		inner.add(btn7);
		inner.add(btn8);
		inner.add(btn9);
		inner.add(btn_plus);
		inner.add(btn4);
		inner.add(btn5);
		inner.add(btn6);
		inner.add(btn_min);
		inner.add(btn1);
		inner.add(btn2);
		inner.add(btn3);
		inner.add(btn_multi);
		inner.add(btn0);
		inner.add(btn_dot);
		inner.add(btn_equal);
		inner.add(btn_div);
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
