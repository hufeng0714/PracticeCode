package com.how2j.swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.how2j.jdbc.Hero;
import com.how2j.jdbc.HeroDAO;
import com.how2j.swing.HeroTableModelDAO;

public class TableExercise {

	//�� htm�� table���Ϊ��̬�������ڸ��±�����ݵ�ʱ�򣬾ͺ����׷��������������
    //����һ��TableModel
    static HeroTableModelDAO htm = new HeroTableModelDAO();
    //����htm����һ��Table
    static JTable t = new JTable(htm);

    static int start = 0;//��ʼҳ��
    static int count = 10;//ÿҳ��ʾ����

    //��ҳ��ť�������﷽��������ÿ���
    static JButton bHomePage = new JButton("��ҳ");
    static JButton bPreviousPage = new JButton("��һҳ");
    static JButton bNextPage = new JButton("��һҳ");
    static JButton bLastPage = new JButton("ĩҳ");
    static JComboBox<Integer> pages = new JComboBox<>();

    private static boolean cbListenerEnabled = true;

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setSize(400, 350);
        f.setLocation(200, 200);
        f.setLayout(null);

        JScrollPane sp = new JScrollPane(t);
        sp.setBounds(0, 0, 400, 200);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p1.setBounds(0, 200, 400, 50);
        p2.setBounds(0, 250, 400, 50);
        //���Ӱ�ť
        //������Ӱ�ť������һ��JDialog����JDialog�н�������
        JButton bAdd = new JButton("����");
        p1.add(bAdd);

        bAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add(f);
            }
        });

        //ɾ����ť
        //�ṩһ��ɾ����ť�����ɾ����ť֮��ɾ��ѡ�е��У�����ˢ��table�е����ݣ�Ȼ����Ĭ��ѡ�е�һ�С�
        //������ɾ����ʱ��û���κ��б�ѡ�У�����ʾ��ɾ��ǰӦ��ѡ��һ��

        JButton bDelete = new JButton("ɾ��");
        p1.add(bDelete);

        bDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete(f);
            }
        });

        //�༭��ť
        //�ṩһ���༭��ť�������ʱ�򣬵���һ��JDialog����ʾѡ�е����ݣ������ܹ��޸ġ�
        //��������ʱ��û��ѡ������һ�У�����ʾ "�༭ǰ��ѡ��һ������"
        JButton bEdit = new JButton("�༭");
        p1.add(bEdit);

        bEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                edit(f);
            }
        });

        //��ҳ��ť����
        bHomePage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage();
            }
        });

        //��һҳ��ť����
        bPreviousPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                previousPage();
            }
        });

        //��һҳ��ť����
        bNextPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextPage();
            }
        });

        //ĩҳ��ť����
        bLastPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lastPage();
            }
        });

        //���ð�ť״̬ͬʱ����������ҳ��
        updateButtonStatus();
        //���������
        pages.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                combobox();
            }
        });
        p2.add(bHomePage);
        p2.add(bPreviousPage);
        p2.add(pages);
        p2.add(bNextPage);
        p2.add(bLastPage);

        f.add(sp);
        f.add(p1);
        f.add(p2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }


    //���ӹ���
    private static void add(JFrame f) {
        // �����ⲿ����ʵ����JDialog
        JDialog d = new JDialog(f);
        // ����Ϊģ̬
        d.setModal(true);

        d.setSize(300, 200);
        d.setLocation(220, 220);
        d.setLayout(null);

        JPanel input = new JPanel();
        input.setLayout(new GridLayout(2, 2, 50, 50));
        input.setBounds(50, 20, 200, 100);

        JLabel lname = new JLabel("���ƣ�");
        JTextField tfname = new JTextField();

        JLabel lhp = new JLabel("Ѫ��");
        JTextField tfhp = new JTextField();

        input.add(lname);
        input.add(tfname);
        input.add(lhp);
        input.add(tfhp);
        d.add(input);

        JPanel submit = new JPanel();
        submit.setBounds(0, 130, 300, 150);

        JButton db = new JButton("ȷ��");
        submit.add(db);

        d.add(submit);

        db.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkEmpty(tfname, "����")) {
                    if (checkNumber(tfhp, "Ѫ��")) {
                        HeroDAO dao = new HeroDAO();

                        Hero h = new Hero();

                        h.name = tfname.getText();
                        h.hp = Integer.parseInt(tfhp.getText());

                        //���Ӣ��
                        dao.add(h);

                        JOptionPane.showMessageDialog(d, "�ύ�ɹ���");


                        updateTable();
                        d.setVisible(false);
                    }
                }
            }
        });
        d.setVisible(true);
    }

    //ɾ������
    private static void delete(JFrame f) {
        //�ж��Ƿ�ѡ��
        if (t.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(f, "��ѡ��һ��ɾ����");
            return;
        }

        if (JOptionPane.OK_OPTION != JOptionPane.showConfirmDialog(f, "ȷ��Ҫɾ����"))
            return;//��ɾ���ͷ���

        //ɾ������
        HeroDAO dao = new HeroDAO();
        int rowIndex = t.getSelectedRow();
        int id = (int) t.getValueAt(rowIndex, 0);
        dao.delete(id);
        updateTable();
    }

    //�༭����
    private static void edit(JFrame f) {
        int index = t.getSelectedRow();
        //�ж��Ƿ�ѡ��
        if (index == -1) {
            JOptionPane.showMessageDialog(f, "��ѡ��һ�б༭��");
            return;
        }
        // �����ⲿ����ʵ����JDialog
        JDialog d = new JDialog(f);
        // ����Ϊģ̬
        d.setModal(true);

        d.setSize(300, 200);
        d.setLocation(220, 220);
        d.setLayout(null);

        JPanel input = new JPanel();
        input.setLayout(new GridLayout(2, 2, 50, 50));
        input.setBounds(50, 20, 200, 100);

        JLabel lname = new JLabel("���ƣ�");
        JTextField tfname = new JTextField();

        JLabel lhp = new JLabel("Ѫ��");
        JTextField tfhp = new JTextField();

        input.add(lname);
        input.add(tfname);
        input.add(lhp);
        input.add(tfhp);
        d.add(input);

        JPanel submit = new JPanel();
        submit.setBounds(0, 130, 300, 150);

        JButton db = new JButton("ȷ��");
        submit.add(db);

        d.add(submit);

        db.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkEmpty(tfname, "����")) {
                    if (checkNumber(tfhp, "Ѫ��")) {
                        HeroDAO dao = new HeroDAO();

                        Hero h = htm.heros.get(index);

                        h.name = tfname.getText();
                        h.hp = Integer.parseInt(tfhp.getText());

                        //���Ӣ��
                        dao.update(h);

                        JOptionPane.showMessageDialog(d, "�ύ�ɹ���");


                        updateTable();
                        d.setVisible(false);
                    }
                }
            }
        });
        d.setVisible(true);
    }

    //��ҳ����
    private static void homePage() {
        start = 0;
        updateTable();
        updateButtonStatus();
    }

    //��һҳ����
    private static void previousPage() {
        start -= count;
        updateTable();
        updateButtonStatus();
    }

    //��һҳ����
    private static void nextPage() {
        start += count;
        updateTable();
        updateButtonStatus();
    }

    //ĩҳ����
    private static void lastPage() {
        start = lastPagestart();
        updateTable();
        updateButtonStatus();
    }

    //���ð�ť�Ƿ����
    private static void updateButtonStatus() {
        int last = lastPagestart();
        //�Ƿ�����һҳ
        if (start != 0) {
            bHomePage.setEnabled(true);
            bPreviousPage.setEnabled(true);
        }
        //�Ƿ��ǵ�һҳ
        if (start == 0) {
            bHomePage.setEnabled(false);
            bPreviousPage.setEnabled(false);
        }
        //�Ƿ�����һҳ
        if (start < last) {
            bNextPage.setEnabled(true);
            bLastPage.setEnabled(true);
        }
        //�Ƿ������һҳ
        if (start == last) {
            bLastPage.setEnabled(false);
            bNextPage.setEnabled(false);
        }

        //����������ҳ��
        int pageNumber = lastPagestart() / count + 1;
        cbListenerEnabled=false;
        pages.removeAllItems();
        for(
                int i = 0;
                i<pageNumber;i++)

        {
            pages.addItem(i + 1);
        }

        cbListenerEnabled=true;

        int currentPage = start / count + 1;
        pages.setSelectedItem(currentPage);

    }

    //�������һҳ��ʼ��λ��
    private static int lastPagestart() {
        int last;
        int total = new HeroDAO().getTotal();
        //�պ�����
        if (total % count == 0)
            last = total - count;
            //��������
        else
            last = total - total % count;

        return last;
    }

    //��������
    private static void combobox(){
        if(!cbListenerEnabled)
            return;

        int currentPage = (int) pages.getSelectedItem();
        start = (currentPage-1)*count;
        updateTable();
        updateButtonStatus();
    }

    //����
    private static void updateTable(){
        htm.heros = new HeroDAO().list(start,count);
        t.updateUI();
        if(!htm.heros.isEmpty())
            t.getSelectionModel().setSelectionInterval(0, 0);
    }

    //Ϊ���ж�
    private static boolean checkEmpty(JTextField tf, String msg) {
        String value = tf.getText();
        if(0==value.length()){
            JOptionPane.showMessageDialog(null,msg + " ����Ϊ��");
            tf.grabFocus();
            return false;
        }
        return true;
    }


    //�����ж�
    private static boolean checkNumber(JTextField tf, String msg) {
        String value = tf.getText();
        if(0==value.length()){
            JOptionPane.showMessageDialog(null,msg + " ����Ϊ��");
            tf.grabFocus();
            return false;
        }
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,msg + " ֻ��������");
            tf.grabFocus();
            return false;
        }
        return true;
    }
}
