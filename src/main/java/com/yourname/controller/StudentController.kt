package com.yourname.controller

import com.yourname.entity.Student
import com.yourname.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
class StudentController {

    @Autowired
    val studentService: StudentService? = null

    @RequestMapping(value = "/{id}", method = arrayOf(RequestMethod.GET))
    fun getStudentById(@PathVariable("id") id: Int): Student? {
        return studentService?.getStudentById(id)
    }

    @RequestMapping(value = "/{id}", method = arrayOf(RequestMethod.DELETE))
    fun deleteStudentById(@PathVariable("id") id: Int) {
        studentService?.removeStudentById(id)
    }

    @RequestMapping(method = arrayOf(RequestMethod.PUT), consumes = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun deleteStudentById(@RequestBody student: Student) {
        studentService?.updateStudent(student)
    }

    @RequestMapping(method = arrayOf(RequestMethod.POST), consumes = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun insertStudent(@RequestBody student: Student) {
        studentService?.insertStudent(student)
    }
}
