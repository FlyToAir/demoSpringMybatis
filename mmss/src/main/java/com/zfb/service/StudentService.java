package com.zfb.service;

import com.zfb.model.StudentInfo;

import java.util.List;

/**
 * Created by BG241127 on 2016/6/12.
 */
public interface StudentService {
    StudentInfo getStudentById(String id);
    List<StudentInfo> getStudents();
    int insert(StudentInfo studentInfo);
}
