package br.com.collegesystem.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="student")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="student_id")
    private Long idStudent;
    
    @NotEmpty
    private String name;
    
    @Column(unique = true)
    @NotEmpty 
    @Email
    private String email;
    
    @NotEmpty
    @Size(min=10, max=11)
    private String phone;
    
    @ManyToOne
    @JoinColumn(name = "student_class_id")
    private StudentClass studentClass;

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((idStudent == null) ? 0 : idStudent.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        result = prime * result + ((studentClass == null) ? 0 : studentClass.hashCode());
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
        Student other = (Student) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (idStudent == null) {
            if (other.idStudent != null)
                return false;
        } else if (!idStudent.equals(other.idStudent))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (phone == null) {
            if (other.phone != null)
                return false;
        } else if (!phone.equals(other.phone))
            return false;
        if (studentClass == null) {
            if (other.studentClass != null)
                return false;
        } else if (!studentClass.equals(other.studentClass))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student [idStudent=" + idStudent + ", name=" + name + ", email=" + email + ", phone=" + phone
                + ", studentClass=" + studentClass + "]";
    }
}
