package com.bridgelabz.springbatch.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {	
	   @Id
	    private Integer id;
	    private String name;
	    private String dept;
	    private Integer salary;
	    private Date time;

	    public User(Integer id, String name, String dept, Integer salary, Date time) {
	        this.id = id;
	        this.name = name;
	        this.dept = dept;
	        this.salary = salary;
	        this.time = time;
	    }

	    public User() {
	    }

	    @Override
	    public String toString() {
	        final StringBuffer sb = new StringBuffer("User{");
	        sb.append("id=").append(id);
	        sb.append(", name='").append(name).append('\'');
	        sb.append(", dept='").append(dept).append('\'');
	        sb.append(", salary=").append(salary);
	        sb.append('}');
	        return sb.toString();
	    }
}
