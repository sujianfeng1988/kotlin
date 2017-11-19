package com.yourname.service

import com.yourname.dao.StudentDao
import com.yourname.entity.Student
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
class StudentService {

    @Autowired
    @Qualifier("mongoData")

    private val studentDao: StudentDao? = null

    fun getStudentById(id: Int): Student? {
        return this.studentDao?.getStudentById(id)
    }

    fun removeStudentById(id: Int) {
        this.studentDao?.removeStudentById(id)
    }

    fun updateStudent(student: Student) {
        this.studentDao?.updateStudent(student)
    }

    fun insertStudent(student: Student) {
        this.studentDao?.insertStudentToDb(student)
    }
}
