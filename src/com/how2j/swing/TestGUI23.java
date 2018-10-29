package com.how2j.swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestGUI23 {
    public static void main(String[] args) {

        final JFrame f = new JFrame("LoL");
        f.setSize(400, 400);
        f.setLocation(200, 200);
        int gap = 10;
        JPanel pInput = new JPanel();
        pInput.setLayout(new GridLayout(4, 3, gap, gap));

        JLabel lLocation = new JLabel("������");
        final JTextField tfLocation = new JTextField("");

        JLabel lType = new JLabel("��˾���ͣ�");
        final JTextField tfType = new JTextField("");

        JLabel lCompanyName = new JLabel("��˾���ƣ�");
        final JTextField tfCompanyName = new JTextField("");

        JLabel lBossName = new JLabel("�ϰ����ƣ�");
        final JTextField tfBossName = new JTextField("");

        JLabel lMoney = new JLabel("��");
        final JTextField tfMoney = new JTextField("");

        JLabel lProduct = new JLabel("��Ʒ��");
        final JTextField tfProduct = new JTextField("");

        JLabel lUnit = new JLabel("�۸������λ");
        final JTextField tfUnit = new JTextField("");

        pInput.add(lLocation);
        pInput.add(tfLocation);
        pInput.add(lType);
        pInput.add(tfType);
        pInput.add(lCompanyName);
        pInput.add(tfCompanyName);
        pInput.add(lBossName);
        pInput.add(tfBossName);
        pInput.add(lMoney);
        pInput.add(tfMoney);
        pInput.add(lProduct);
        pInput.add(tfProduct);
        pInput.add(lUnit);
        pInput.add(tfUnit);

        f.setLayout(null);
        pInput.setBounds(gap, gap, 375, 120);

        JButton b = new JButton("����");
        final JTextArea ta = new JTextArea();
        ta.setLineWrap(true);

        b.setBounds(150, 120 + 30, 80, 30);
        ta.setBounds(gap, 150 + 60, 375, 120);

        f.add(pInput);
        f.add(b);
        f.add(ta);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);

        b.addActionListener(new ActionListener() {

            boolean checkedpass = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                checkedpass = true;
                checkEmpty(tfLocation, "��ַ");
                checkEmpty(tfType, "��˾����");
                checkEmpty(tfCompanyName, "��˾����");
                checkEmpty(tfBossName, "�ϰ�����");
                checkNumber(tfMoney, "���");
                checkEmpty(tfProduct, "��Ʒ");
                checkEmpty(tfUnit, "�۸������λ");

                String location = tfLocation.getText();
                String type = tfType.getText();
                String companyName = tfCompanyName.getText();
                String bossName = tfBossName.getText();
                String money = tfMoney.getText();
                String product = tfProduct.getText();
                String unit = tfUnit.getText();

                if (checkedpass) {
                    String model = "%s���%s%s�����ˣ����˵��ϰ�%s�Ժ��ζģ�Ƿ����%s���ڣ�"
                            + "��������С��������!����û�а취������%s�ֹ���!ԭ�۶���һ%s�ࡢ��%s�ࡢ��%s���%s��"
                            + "����ȫ��ֻ����ʮ�飬ͳͳֻҪ��ʮ��!%s���˵����㲻����!����������������˴���꣬"
                            + "�㲻�����ʣ��㻹��Ѫ��Ǯ������Ѫ��Ǯ!";
                    String result = String.format(model, location, type, companyName, bossName, 
                    		money, product, unit, unit, unit, product, bossName);
                    ta.setText("");
                    ta.append(result);
                }
            }

            private void checkNumber(JTextField tf, String msg) {
                if (!checkedpass)
                    return;
                String value = tf.getText();
                try {
                    Integer.parseInt(value);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(f, msg + " ����������");
                    tf.grabFocus();
                    checkedpass = false;
                }
            }

            private void checkEmpty(JTextField tf, String msg) {
                if (!checkedpass)
                    return;
                String value = tf.getText();
                if (0 == value.length()) {
                    JOptionPane.showMessageDialog(f, msg + " ����Ϊ��");
                    tf.grabFocus();
                    checkedpass = false;
                }
            }
        });
    }

}
