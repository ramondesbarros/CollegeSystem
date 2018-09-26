package br.com.collegesystem.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="subject")
public class Subject {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="subject_id")
    private Long idSubject;
    
    @NotEmpty
    private String name;
    
    private Type type;
    
    @ManyToMany(mappedBy = "subjects")
    //private Set<Teacher> teacher = new HashSet<>();
    private List<Teacher> teacher;
    
    @ManyToMany(mappedBy = "subjects")
    //private Set<Course> courses = new HashSet<>();
    private List<Course> courses;

    public Long getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Long idSubject) {
        this.idSubject = idSubject;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((courses == null) ? 0 : courses.hashCode());
        result = prime * result + ((idSubject == null) ? 0 : idSubject.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((teacher == null) ? 0 : teacher.hashCode());
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
        Subject other = (Subject) obj;
        if (courses == null) {
            if (other.courses != null)
                return false;
        } else if (!courses.equals(other.courses))
            return false;
        if (idSubject == null) {
            if (other.idSubject != null)
                return false;
        } else if (!idSubject.equals(other.idSubject))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (teacher == null) {
            if (other.teacher != null)
                return false;
        } else if (!teacher.equals(other.teacher))
            return false;
        if (type != other.type)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Subject [idSubject=" + idSubject + ", name=" + name + ", type=" + type + ", teacher=" + teacher
                + ", courses=" + courses + "]";
    }
}
