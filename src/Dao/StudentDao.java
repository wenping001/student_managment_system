package Dao;

import entity.Student;

import java.util.List;

public interface StudentDao {

    public List<Student> studentList();
    public int addStudent(Student student);
    public boolean delete(String id);
    public List<Student> query();
    public boolean update(String id);
}
