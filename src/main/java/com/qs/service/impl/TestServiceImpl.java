package com.qs.service.impl;

import com.qs.bean.Student;
import com.qs.dao.TestDao;
import com.qs.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/1 16:05
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao dao;
    @Override
    public List<Student> getAll() {
        return dao.getAll();
    }
}
