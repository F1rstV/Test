import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;

public class TestTest extends JFrame{
	
	public TestTest(){
		setVisible(true);
		setSize(650,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(30, 24, 576, 338);
		tabbedPane.addTab("1 владка",p1);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button = new JButton("\u041A\u043D\u043E\u043F\u043A\u0430");
		button.setBackground(Color.GRAY);
		p1.add(button);
		tabbedPane.addTab("2 владка",p2);
		
		JButton button_1 = new JButton("\u041A\u043D\u043E\u043F\u043A\u0430 2");
		p2.add(button_1);
		getContentPane().add(tabbedPane);
		
	}
	
	public static void main(String[] args) {
        TestTest tt = new TestTest();
	}
}
