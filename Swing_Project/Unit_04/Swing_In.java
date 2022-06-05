package Unit_04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class P17_SwingInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingInJava obj = new SwingInJava();
		
	}

}


class SwingInJava extends JFrame{
	
	JTextField t1;
	JTextField t2;
	JButton b1;
	JLabel l1;
	JButton b2;
	JButton b3;
	JButton b4;
	
	SwingInJava(){
		
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		b1 = new JButton("Sum");
		l1 = new JLabel();
		b2 = new JButton("Sub");
		b3= new JButton("MUL");
		b4 = new JButton("Divide");
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l1);
		
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				int a1 = Integer.parseInt(s1);
				int a2 = Integer.parseInt(s2);
				
				if(e.getSource() == b1) {
					Integer sum = a1 + a2;
					
					l1.setText(sum.toString());
				}
				if(e.getSource() == b2) {
					Integer sub = a1 - a2;
					
					l1.setText(sub.toString());
				}
				if(e.getSource() == b3) {
					Integer sub = a1 * a2;
					
					l1.setText(sub.toString());
				}
				
				if(e.getSource() == b4) {
					Integer sub = a1 / a2;
					
					l1.setText(sub.toString());
				}
				
			}
		};
		
		b1.addActionListener(al);
		b2.addActionListener(al);
		b3.addActionListener(al);
		b4.addActionListener(al);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(350,350);
		setDefaultCloseOperation(3);
		
	}
	
}
