package com.attc.cathair.service.impl;

import com.attc.cathair.entity.Student;
import com.attc.cathair.mapper.StudentMapper;
import com.attc.cathair.service.StudentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
}