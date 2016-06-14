package com.zfb.service;

import com.alibaba.fastjson.JSON;
import com.zfb.model.StudentInfo;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mvc.xml"})
public class StudentServiceTest{
    private static Logger logger = Logger.getLogger(StudentServiceTest.class);
    @Autowired
    private StudentService studentService;
//    private static ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    @org.junit.Test
    public void testGetStudentById() {
//        StudentService studentService = (StudentService)ctx.getBean("studentService");
        StudentInfo studentInfo = studentService.getStudentById("1002");
//        System.out.println("Get a student:id=1002 ,name=" + studentInfo.getName());
        logger.info(JSON.toJSON(studentInfo));
    }

    @org.junit.Test
    public void testGetStudents(){
//        StudentService studentService = (StudentService)ctx.getBean("studentService");
        List<StudentInfo> studentInfos = studentService.getStudents();
        logger.info(JSON.toJSON(studentInfos));
    }

    @org.junit.Test
    public void testInsert(){
//        StudentService studentService = (StudentService)ctx.getBean("studentService");
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setId("1222");
        studentInfo.setName("Henry");
        studentInfo.setAge(23);
        studentInfo.setSex('M');
        int result = studentService.insert(studentInfo);
//        System.out.println("insert id=" + studentInfo.getId());
        System.out.println(result);
    }
}