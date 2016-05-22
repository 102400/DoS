package gui.dos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DoSPanel extends JPanel {
	
	public static JTextField text_address = new JTextField();
	public static JTextField text_thread = new JTextField();
	private DoS dos;
	
	public DoSPanel()
	{
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		JLabel label0 = new JLabel("地址:     (如 http://www.baidu.com)");
		//JTextField text_address = new JTextField();
		text_address.setSize(100, 100);
		
		JLabel label1 = new JLabel("线程:     (如 1000,建议不超过10000)");
		//JTextField text_thread = new JTextField();
		text_thread.setSize(100, 100);
		
		JButton botton_startstop = new JButton();
		botton_startstop.setText("启动");
		botton_startstop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(botton_startstop.getText().equals("启动"))
				{
					dos = new DoS();
					dos.run();
					botton_startstop.setText("停止");
				}
				else if(botton_startstop.getText().equals("停止"))
				{
					dos.stop();
					botton_startstop.setText("启动");
				}
			}
		});
		
		add(label0);
		add(text_address);
		add(label1);
		add(text_thread);
		add(botton_startstop);
	}

}
