package com.how2j.charactor;

public class HeroProperty {
		/**
		 ���һ�����ԣ�ÿ��Ӣ�۶���һ��������name�����������Ծ�Ӧ�����Ϊ�������ԣ�
		 ��Ϊ���Ǹ��Ŷ����ߵģ�ÿ�������name���ǲ�ͬ��

		���һ�����ԣ����е�Ӣ�۶���������һ���ģ���ô��Ӧ�����Ϊ�����ԡ�
		����Ѫ�����ޣ����е�Ӣ�۵�Ѫ�����޶��� 9999��������ΪӢ�۲�ͬ����ȡ��ͬ��ֵ�� ���������ԣ����ʺ����Ϊ������
		 */
	    public String name; //ʵ�����ԣ��������ԣ��Ǿ�̬����
	    protected float hp;
	    static String copyright;//������,��̬����
	     
	    public static void main(String[] args) {
	    	HeroProperty garen =  new HeroProperty();
	           garen.name = "����";
	            
	           HeroProperty.copyright = "��Ȩ��Riot Games��˾����";
	            
	           System.out.println(garen.name);
	           System.out.println(garen.copyright);//����.������
	           /**
	            * ͨ��garen.copyright�޸���ֵ
	            * garen.copyright = "Blizzard Entertainment Enterprise";
	            * Ȼ���ӡteemo.copyright���۲��Ƿ��б仯
	            */
	           garen.copyright = "Blizzard Entertainment Enterprise";
	            
	           HeroProperty teemo =  new HeroProperty();
	           teemo.name = "��Ī";
	           System.out.println(teemo.name);    
	           System.out.println(teemo.copyright);//��.������
	        
	     
	}
}
