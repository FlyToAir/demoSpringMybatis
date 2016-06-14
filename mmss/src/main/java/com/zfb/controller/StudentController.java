package com.zfb.controller;

import com.zfb.model.StudentInfo;
import com.zfb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @auther BG241127
 * @create 2016-06-12 18:36
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/showAllStudent")
    public @ResponseBody
    Object showStudentInfos(){
        List<StudentInfo> studentInfos = studentService.getStudents();
        return studentInfos;
    }
    @RequestMapping("/studentList")
    public String showall(ModelMap modelMap){
        List<StudentInfo> studentInfoList = studentService.getStudents();
        modelMap.addAttribute("studentInfoList", studentInfoList);
        return "/list";
    }
    @RequestMapping("/showStudent/{studentId}")
    public String showStudentInfo(Model modelMap, @PathVariable String studentId){
        StudentInfo studentInfo = studentService.getStudentById(studentId);
        modelMap.addAttribute("studentInfo", studentInfo);
        return "/showStudent";
    }

    @RequestMapping(value = "/insertStudent")
    public String view(){
        return "/addStudent";
    }


    @RequestMapping(value = "/addStudent")
    public String insertStudent(ModelMap model, @ModelAttribute("SpringWeb")StudentInfo studentInfo){
        studentService.insert(studentInfo);
        model.addAttribute("studentInfo",studentInfo);
        return "/insertResult";
    }


/*    @RequestMapping("/showStudent")
    public String showStudent(HttpServletRequest request, Model model){
        String studentId = request.getParameter("id");
        StudentInfo studentInfo = this.studentService.getStudentById(studentId);
        model.addAttribute("student", studentInfo);
        return "showStudent";
    }*/

//    @RequestMapping("/showStudent")
//    public  String  showStudent(Model model){
//        List<StudentInfo> studentInfos = studentService.getStudents();
//        model.addAttribute("students", studentInfos);
//        System.out.println(studentInfos);
//        return "showStudent";
//    }


}
