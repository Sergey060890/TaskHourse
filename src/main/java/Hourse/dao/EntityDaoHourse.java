package Hourse.dao;

import Hourse.entity.Hourse;
import Hourse.util.HibernateUtil;

import javax.persistence.EntityManager;

public class EntityDaoHourse extends EntityDaoImpl<Hourse> implements HourseDao {

    public EntityDaoHourse() {
        super(Hourse.class, HibernateUtil.getEntityManager());
    }
}
