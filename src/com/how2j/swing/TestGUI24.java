package com.how2j.swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
		�ο���ϰ-�����̣��� ��ҳ��ĸ��������� �ĳ�swing����
		������ʽ��
		F = p* ( (1+r)^n );
		F ��������
		p ����
		r ������
		n ���˶�����
		�����龰һ��
		p = 10000
		r = 0.05
		n = 1
		�����
		������10000
		��������5%
		����һ�� 1��
		�������� 10000*( (1+0.05)^1 ) = 10500
		�����龰����
		p = 10000
		r = 0.05
		n = 2
		�����
		������10000
		��������5%
		��������
		�������� 10000*( (1+0.05)^2 ) = 11025
		 */
public class TestGUI24 {
	 public static void main(String[] args) {

	        final JFrame f = new JFrame("LoL");
	        f.setLayout(null);

	        f.setSize(400, 400);
	        f.setLocation(200, 200);
	        int gap = 10;
	        JPanel pInput = new JPanel();
	        pInput.setLayout(new GridLayout(4, 6, gap, gap));
	        pInput.setBounds(gap, gap, 375, 120);

	        JLabel lInit = new JLabel("��ʼ�ʽ�");
	        JLabel lRate = new JLabel("ÿ������");
	        JLabel lYear = new JLabel("��������");
	        JLabel lInverst = new JLabel("ÿ��׷���ʽ�");

	        final JTextField tfInit = new JTextField("12000");
	        final JTextField tfRate = new JTextField("20");
	        final JTextField tfYear = new JTextField("2");
	        final JTextField tfInvest = new JTextField("12000");

	        JLabel lInitSign = new JLabel("��");
	        JLabel lRateSign = new JLabel("%");
	        JLabel lYearSign = new JLabel("��");
	        JLabel lInvestSign = new JLabel("��");

	        pInput.add(lInit);
	        pInput.add(tfInit);
	        pInput.add(lInitSign);

	        pInput.add(lRate);
	        pInput.add(tfRate);
	        pInput.add(lRateSign);

	        pInput.add(lYear);
	        pInput.add(tfYear);
	        pInput.add(lYearSign);

	        pInput.add(lInverst);
	        pInput.add(tfInvest);
	        pInput.add(lInvestSign);

	        JPanel pResult = new JPanel();
	        pResult.setLayout(new GridLayout(4, 6, gap, gap));

	        JLabel lBaseSum = new JLabel("�����");
	        JLabel lInterestSum = new JLabel("��Ϣ��");
	        JLabel lTotalSum = new JLabel("��Ϣ��");

	        final JTextField tfBaseSum = new JTextField();
	        final JTextField tfInterestSum = new JTextField();
	        final JTextField tfTotalSum = new JTextField();

	        JLabel lBaseSumSign = new JLabel("��");
	        JLabel lInterestSumSign = new JLabel("��");
	        JLabel lTotalSumSign = new JLabel("��");

	        pResult.add(lBaseSum);
	        pResult.add(tfBaseSum);
	        pResult.add(lBaseSumSign);

	        pResult.add(lInterestSum);
	        pResult.add(tfInterestSum);
	        pResult.add(lInterestSumSign);

	        pResult.add(lTotalSum);
	        pResult.add(tfTotalSum);
	        pResult.add(lTotalSumSign);

	        JButton b = new JButton("����");
	        b.setBounds(150, 120 + 30, 80, 30);
	        pResult.setBounds(gap, 150 + 60, 375, 120);

	        f.add(pInput);
	        f.add(b);
	        f.add(pResult);

	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        f.setVisible(true);

	        b.addActionListener(new ActionListener() {

	            boolean checkedpass = true;

	            @Override
	            public void actionPerformed(ActionEvent e) {
	                checkedpass = true;
	                check(tfInit, "��ʼ�ʽ�");
	                check(tfRate, "ÿ������");
	                check(tfYear, "��������");
	                check(tfInvest, "ÿ��׷���ʽ�");

	                if (checkedpass) {
	                    int init = Integer.parseInt(tfInit.getText());
	                    int rate = Integer.parseInt(tfRate.getText());
	                    int year = Integer.parseInt(tfYear.getText());
	                    int invest = Integer.parseInt(tfInvest.getText());

	                    int baseSum = (year - 1) * invest + init;
	                    int totalSum = (int) (invest * fuli((1 + (double) rate / 100), (year - 1)) + init * Math.pow((1 + (double) rate / 100), year));
	                    int interestSum = totalSum - baseSum;

	                    tfBaseSum.setText(String.format("%,d", baseSum));

	                    tfInterestSum.setText(String.format("%,d", interestSum));
	                    tfTotalSum.setText(String.format("%,d", totalSum));
	                }
	            }

	            private int fuli(double rate, int year) {
	                int result = 0;
	                for (int i = year; i > 0; i--) {
	                    result += Math.pow(rate, i);
	                }
	                return result;
	            }

	            private void check(JTextField tf, String msg) {
	                if (!checkedpass)
	                    return;
	                String value = tf.getText();
	                if (0 == value.length()) {
	                    JOptionPane.showMessageDialog(f, msg + " ����Ϊ��");
	                    tf.grabFocus();
	                    checkedpass = false;
	                    return;
	                }
	                try {
	                    Integer.parseInt(value);
	                } catch (NumberFormatException e) {
	                    JOptionPane.showMessageDialog(f, msg + " ����������");
	                    tf.grabFocus();
	                    checkedpass = false;
	                }
	            }
	        });
	    }
}
