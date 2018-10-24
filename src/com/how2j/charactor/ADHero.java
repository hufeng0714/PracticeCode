package com.how2j.charactor;

public class ADHero extends Hero implements AD,Mortal{

	//ʵ����һ��ADHero(), �乹�췽���ᱻ���� 
	//�丸��Ĺ��췽��Ҳ�ᱻ���� 
	//�����Ǹ��๹�췽���ȵ��� 
	//���๹�췽����Ĭ�ϵ��ø���� �޲εĹ��췽��
	//����ADHero ad = new ADHero();//���õ��Ǹ�����޲ι��췽��
	public void ADHero(){
		System.out.println("����Ĺ��췽��");
	}
	
	public void physicAttack(){
		System.out.println("��д�ӿڷ���");
	}
	
	/**
	 * ����������ָ���Ƿ�����һ�������ǲ������Ͳ�һ��
	 */

	public void attack(){
		System.out.println(getName() + " ������һ�ι��� �����ǲ�ȷ������˭��");
	}
	public void attack(Hero h1){
		System.out.println(getName() + "��" + h1.getName() + "������һ�ι��� ");
	}
	public void attack(Hero h1,Hero h2){
		System.out.println(getName() + "ͬʱ��" + h1.getName() + "��" + h2.getName() + "�����˹��� ");
	}
	/**
	 ���Ҫ���������Ӣ�ۣ�����Ҫ��Ƹ���ķ�������������Եú���׸����������
	public void attack(Hero h1)
	public void attack(Hero h1,Hero h2)
	public void attack(Hero h1,Hero h2,Hero 3)
	
	��ʱ�����Բ��ÿɱ������Ĳ���
	ֻ��Ҫ���һ������
	public void attack(Hero ...heros)
	���ɴ����������еķ�����
	�ڷ����ʹ�ò�������ķ�ʽ�������heros����
	 */
	
	// �ɱ������Ĳ���
    public void attack(Hero... heros) {
        for (int i = 0; i < heros.length; i++) {
            System.out.println(getName() + " ������ " + heros[i].getName());
 
        }
    }
    
    //����
    //����д���ƣ���������д�����า�Ǹ���Ķ��󷽷�
    //���أ��������า�Ǹ�����෽��
    
    public static void battleWin(){
    	System.out.println("AD Hero battle Win");
    }
    
    
	public static void main(String[] args) {
		
        ADHero bh = new ADHero();
        bh.setName("�ͽ�����");
 
        Hero h1 = new Hero();
        h1.setName("����");
        Hero h2 = new Hero();
        h2.setName("��Ī");
        Hero h3 = new Hero();
        h3.setName("��ϫ");
        
        bh.attack();
        bh.attack(h1);
        bh.attack(h1, h2);
        bh.attack(h1,h2,h3);
        
        //����
        //���಻��̳��෽���ģ���Ϊ�̳�˵�ĺ�����������̳и����ʵ��������ʵ������
        //����������಻���ظ����෽��������������ʱ���ǵ��ø����෽����������أ����ǵ��������෽����
        //��������󲻹��������ض��ǵ��ø����෽��
        Hero.battleWin();
        ADHero.battleWin();
        h1.battleWin();
        bh.battleWin();

	}

	@Override
	public void die() {

		System.out.println("ADHero die");
		
	}

}
