package com.example.dao;
import java.util.List;

import org.apache.ibatis.annotations.*;

import com.example.model.StudentModel;

@Mapper
public interface StudentDAO {
    StudentModel selectStudent(String npm);
    List<StudentModel> selectAllStudents();
}
