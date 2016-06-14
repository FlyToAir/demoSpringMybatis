package com.zfb.dao;

import com.zfb.model.StudentInfo;

import java.util.List;

/**
 * Created by BG241127 on 2016/6/12.
 */
public interface StudentInfoMapper {
    List<StudentInfo> selectAllStudentInfo();
    StudentInfo selectById(String id);
    int add(StudentInfo student);
    int deleteById(String id);
}
