package com.yourname.dao

import com.yourname.entity.Student
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

import java.util.ArrayList

@Repository
@Qualifier("mongoData")
class MongoStudentDaoImpl : StudentDao {


    override val allStudents: Collection<Student>
        get() = object : ArrayList<Student>() {
            init {
                add(Student(1, "Mario", "Nothing"))
            }
        }

    override fun getStudentById(id: Int): Student? {
        return null
    }

    override fun removeStudentById(id: Int) {

    }

    override fun updateStudent(student: Student) {

    }

    override fun insertStudentToDb(student: Student) {

    }
}
