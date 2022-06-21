package Hourse.service;

import Hourse.entity.Hourse;

import java.sql.SQLException;
import java.util.List;

public interface HourseService {


    Hourse createFlower(String type, Integer age,
                        Integer price);


    List<Hourse> findAll();


    void updateFlower(Integer id, String type, Integer age,
                      Integer price) throws SQLException;


    void deleteFlower(Integer id) throws SQLException;


    Hourse findFlowerById(Integer id) throws SQLException;

}
