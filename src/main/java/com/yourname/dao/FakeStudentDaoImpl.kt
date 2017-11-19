package com.yourname.dao

import com.yourname.entity.Student
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository
import java.util.HashMap

@Repository
@Qualifier("fakeData")
class FakeStudentDaoImpl : StudentDao {

    private var students: MutableMap<Int, Student>? = null

    init {

        students = object : HashMap<Int, Student>() {

            init {
                put(1, Student(1, "Said", "Computer Science"))
                put(2, Student(2, "Alex U", "Finance"))
                put(3, Student(3, "Anna", "Maths"))
            }
        }
    }

    override val allStudents: Collection<Student>
        get() = this.students!!.values

    override fun getStudentById(id: Int): Student? {
        return this.students!!.get(id)
    }

    override fun removeStudentById(id: Int) {
        this.students!!.remove(id)
    }

    override fun updateStudent(student: Student) {
        val s = students!![student.id]
        s!!.course = student.course
        s.name = student.name
        students!!.put(student.id, student)
    }

    override fun insertStudentToDb(student: Student) {
        this.students!!.put(student.id, student)
    }

}
