package com.how2j.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TestGUI22 {
	 
	public static void main(String[] args) {

	        final JFrame f = new JFrame("LoL");
	        f.setSize(400, 300);
	        f.setLocation(200, 200);

	        JPanel pNorth = new JPanel();
	        pNorth.setLayout(new FlowLayout());
	        JPanel pCenter = new JPanel();

	        JLabel lName = new JLabel("�˺ţ�");
	        final JTextField tfName = new JTextField("");
	        tfName.setText("");
	        tfName.setPreferredSize(new Dimension(80, 30));

	        JLabel lPassword = new JLabel("���룺");
	        final JPasswordField tfPassword = new JPasswordField("");
	        tfPassword.setText("");
	        tfPassword.setPreferredSize(new Dimension(80, 30));

	        pNorth.add(lName);
	        pNorth.add(tfName);
	        pNorth.add(lPassword);
	        pNorth.add(tfPassword);

	        JButton b = new JButton("��½");
	        pCenter.add(b);

	        b.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {

	                String name = tfName.getText();
	                String password = new String(tfPassword.getPassword());
	                if (0 == name.length()) {
	                    JOptionPane.showMessageDialog(f, "�˺Ų���Ϊ��");
	                    tfName.grabFocus();
	                    return;
	                }
	                if (0 == password.length()) {
	                    JOptionPane.showMessageDialog(f, "���벻��Ϊ��");
	                    tfPassword.grabFocus();
	                    return;
	                }

	                if (check(name, password))
	                    JOptionPane.showMessageDialog(f, "��½�ɹ�");
	                else
	                    JOptionPane.showMessageDialog(f, "�������");

	            }
	        });

	        f.setLayout(new BorderLayout());
	        f.add(pNorth, BorderLayout.NORTH);
	        f.add(pCenter, BorderLayout.CENTER);

	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        f.setVisible(true);
	    }

	    public static boolean check(String name, String password) {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }

	        boolean result = false;
	        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
	                "root", "admin");
	             Statement s = c.createStatement();

	        ) {

	            String sql = "select * from user where name = '" + name + "' and password = '" + password + "'";

	            // ִ�в�ѯ��䣬���ѽ�������ظ�ResultSet
	            ResultSet rs = s.executeQuery(sql);

	            if (rs.next())
	                result = true;

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return result;

	    }
	}