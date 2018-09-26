package br.com.collegesystem.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="course")
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="course_id")
    private Long idCourse;
    
    @NotEmpty
    private String name;
    
    private Type type;
    
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Course_Subject", 
        joinColumns = { @JoinColumn(name = "course_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "subject_id") }
    )
    Set<Subject> subjects = new HashSet<>();
    
    @OneToMany(mappedBy = "course", targetEntity = StudentClass.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<StudentClass> studentsClass;

    public Long getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Long idCourse) {
        this.idCourse = idCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    public Set<StudentClass> getStudentsClass() {
        return studentsClass;
    }

    public void setStudentsClass(Set<StudentClass> studentsClass) {
        this.studentsClass = studentsClass;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idCourse == null) ? 0 : idCourse.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((studentsClass == null) ? 0 : studentsClass.hashCode());
        result = prime * result + ((subjects == null) ? 0 : subjects.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
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
        Course other = (Course) obj;
        if (idCourse == null) {
            if (other.idCourse != null)
                return false;
        } else if (!idCourse.equals(other.idCourse))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (studentsClass == null) {
            if (other.studentsClass != null)
                return false;
        } else if (!studentsClass.equals(other.studentsClass))
            return false;
        if (subjects == null) {
            if (other.subjects != null)
                return false;
        } else if (!subjects.equals(other.subjects))
            return false;
        if (type != other.type)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Course [idCourse=" + idCourse + ", name=" + name + ", type=" + type + ", subjects=" + subjects
                + ", studentsClass=" + studentsClass + "]";
    }
}
