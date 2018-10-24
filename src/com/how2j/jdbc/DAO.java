package com.how2j.jdbc;

import java.util.List;
import com.how2j.jdbc.Hero;

public interface DAO {
    //����
    public void add(Hero hero);
    //�޸�
    public void update(Hero hero);
    //ɾ��
    public void delete(int id);
    //��ȡ
    public Hero get(int id);
    //��ѯ
    public List<Hero> list();
    //��ҳ��ѯ
    public List<Hero> list(int start, int count);
}
