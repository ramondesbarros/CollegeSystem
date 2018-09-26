package br.com.collegesystem.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student_class")
public class StudentClass {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="student_class_id")
    private Long idStudentClass;
    
    private String name;
    
    @ManyToOne
    @JoinColumn(name="course_id")
    private Course course;
    
    @OneToMany(mappedBy = "studentClass", targetEntity = Student.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Student> students;

    public Long getIdStudentClass() {
        return idStudentClass;
    }

    public void setIdStudentClass(Long idStudentClass) {
        this.idStudentClass = idStudentClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((course == null) ? 0 : course.hashCode());
        result = prime * result + ((idStudentClass == null) ? 0 : idStudentClass.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((students == null) ? 0 : students.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StudentClass other = (StudentClass) obj;
        if (course == null) {
            if (other.course != null)
                return false;
        } else if (!course.equals(other.course))
            return false;
        if (idStudentClass == null) {
            if (other.idStudentClass != null)
                return false;
        } else if (!idStudentClass.equals(other.idStudentClass))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (students == null) {
            if (other.students != null)
                return false;
        } else if (!students.equals(other.students))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "StudentClass [idStudentClass=" + idStudentClass + ", name=" + name + ", course=" + course
                + ", students=" + students + "]";
    }
}
