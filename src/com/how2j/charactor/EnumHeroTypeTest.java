package com.how2j.charactor;

public class EnumHeroTypeTest {

	public static void main(String[] args) {
		
		for(EnumHeroType eht:EnumHeroType.values()){
			System.out.print(eht+"===>");
			
			switch(eht){
			
				case TANK:
					System.out.println("̹��");
					break;
				case WIZARD:
					System.out.println("��ʦ");
					break;
				case ASSASSIN:
					System.out.println("�̿�");
					break;
				case ASSIST:
					System.out.println("����");
					break;
				case WARRIOR:
					System.out.println("��ս");
					break;
				case RANGED:
					System.out.println("Զ��");
					break;		
				case PUSH:
					System.out.println("�ƽ�");
					break;		
				case FARMING:
					System.out.println("��Ұ");
					break;	
				default:
					System.out.println("����");
					break;
		
			}
			
		}

	}

}
