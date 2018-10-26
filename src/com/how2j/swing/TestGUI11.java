package com.how2j.swing;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestGUI11 {

	public static void main(String[] args) {
		/*
		JTextField 输入框
		setText 设置文本
		getText 获取文本
		JTextField 是单行文本框，如果要输入多行数据，请使用JTextArea
		
		tfPassword.grabFocus(); 表示让密码输入框获取焦点
		 */
		
		JFrame f = new JFrame("WOW");
		f.setSize(300,400);
		f.setLocation(200, 200);
		f.setLayout(new FlowLayout());

		
		JLabel lName = new JLabel("账号：");
		JTextField tfName = new JTextField("");
		tfName.setText("请输入账号");
		/*
		1.setPreferredSize需要在使用布局管理器的时候使用，布局管理器会获取空间的preferredsize，因而可以生效。
		例如borderlayout在north中放入一个panel，panel的高度可以通过这样实现：panel.setPreferredSize(new Dimension(0, 100));
		这样就设置了一个高度为100的panel，宽度随窗口变化。
		
		2.setSize,setLocation,setBounds方法需要在不使用布局管理器的时候使用，也就是setLayout(null)的时候可以使用这三个方法控制布局。
		 */
		tfName.setPreferredSize(new Dimension(80, 30));
		
		JLabel lPassword = new JLabel("密码：");
		JTextField tfPassword = new JTextField("");
		tfPassword.setText("请输入密码");
		tfName.setPreferredSize(new Dimension(80, 30));
		
		/*
		JPasswordField 密码框 
		与文本框不同，获取密码框里的内容，推荐使用getPassword，该方法会返回一个字符数组，而非字符串
		 */
		
		JLabel lPassword1 = new JLabel("隐藏密码");
		JPasswordField pf = new JPasswordField("");
		pf.setText("&48kdh4@#");
		pf.setPreferredSize(new Dimension(80,30));
		// 与文本框不同，获取密码框里的内容，推荐使用getPassword，该方法会返回一个字符数组，而非字符串
		char[] password = pf.getPassword();
		String p = String.valueOf(password);
		System.out.println(p);
		
		/*
			JTextArea：文本域。
			和文本框JTextField不同的是，文本域可以输入多行数据
			如果要给文本域初始文本，通过\n来实现换行效果
			JTextArea通常会用到append来进行数据追加
			如果文本太长，会跑出去，可以通过setLineWrap(true) 来做到自动换行
		 */
		
		JLabel lta = new JLabel("文本框");
		JTextArea ta = new JTextArea();
		ta.setPreferredSize(new Dimension(200,150));
        //\n换行符
        ta.setText("抢人头！\n抢你妹啊抢！\n");
        //追加数据
        ta.append("我去送了了了了了了了了了了了了了了了了了了了了了了了了");
        //设置自动换行
        ta.setLineWrap(true);
		
        /*
         * JProgressBar
         * 进度条
         */
        final JProgressBar pb = new JProgressBar();
      //进度条最大100
        pb.setMaximum(100);
        //当前进度是50
        //pb.setValue(50);
        new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<101;i++) {
					try {
						Thread.sleep(100);
						pb.setValue(i);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
        	
        }).start();
        //显示当前进度
        pb.setStringPainted(true);
        
        
		f.add(lName);
		f.add(tfName);
		f.add(lPassword);
		f.add(tfPassword);		
		
		f.add(lPassword1);
		f.add(pf);
		
		f.add(lta);
		f.add(ta);
		
		f.add(pb);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
