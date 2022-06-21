package Hourse.service;

import Hourse.dao.EntityDaoHourse;
import Hourse.dao.HourseDao;
import Hourse.entity.Hourse;

import java.sql.SQLException;
import java.util.List;

public class HourseServiceImpl implements HourseService{
    HourseDao hourseDao = new EntityDaoHourse();
    @Override
    public Hourse createFlower(String type, Integer age, Integer price) {
       Hourse hourse = Hourse.builder()
                .type(type)
                .age(age)
                .price(price)

                .build();
        hourseDao.create(hourse);
        return hourse;
    }

    @Override
    public List<Hourse> findAll() {
        return hourseDao.findAll();
    }

    @Override
    public void updateFlower(Integer id, String type, Integer age, Integer price) throws SQLException {
        Hourse hourse = hourseDao.findOne(id);
        hourse.setType(type);
        hourse.setAge(age);
        hourse.setPrice(price);
        hourseDao.update(hourse);
    }

    @Override
    public void deleteFlower(Integer id) throws SQLException {
        hourseDao.deleteById(id);
    }

    @Override
    public Hourse findFlowerById(Integer id) throws SQLException {
        return hourseDao.findOne(id);
    }
}
