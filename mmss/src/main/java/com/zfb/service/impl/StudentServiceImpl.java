package com.zfb.service.impl;

import com.zfb.dao.StudentInfoMapper;
import com.zfb.model.StudentInfo;
import com.zfb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther BG241127
 * @create 2016-06-12 18:38
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentInfoMapper studentInfoMapper;

    @Override
    public StudentInfo getStudentById(String id) {
        return studentInfoMapper.selectById(id);
    }

    @Override
    public List<StudentInfo> getStudents() {
        return studentInfoMapper.selectAllStudentInfo();
    }

    @Override
    public int insert(StudentInfo studentInfo) {
        int result = studentInfoMapper.add(studentInfo);
        System.out.println(result);
        return result;
    }
}
