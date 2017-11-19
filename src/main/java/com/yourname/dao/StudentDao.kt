package com.yourname.dao

import com.yourname.entity.Student

interface StudentDao {
    val allStudents: Collection<Student>

    fun getStudentById(id: Int): Student?

    fun removeStudentById(id: Int)

    fun updateStudent(student: Student)

    fun insertStudentToDb(student: Student)
}
