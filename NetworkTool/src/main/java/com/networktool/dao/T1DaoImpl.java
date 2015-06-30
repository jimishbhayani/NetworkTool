package com.networktool.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.networktool.model.T1;

@Repository("t1Dao")
public class T1DaoImpl extends AbstractDataAccess {

    @Transactional
    @SuppressWarnings("unchecked")
    public List<T1> findAllT1() {
        Criteria criteria = getSession().createCriteria(T1.class);
        return (List<T1>) criteria.list();
    }

}
