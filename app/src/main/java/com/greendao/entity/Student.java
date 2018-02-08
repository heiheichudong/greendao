package com.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author zl
 * @data 2018/2/8
 */
@Entity
public class Student {
    @Id(autoincrement = true)
    private Long id;
    private String name;
    private int age;
    private Long teacherId;
    @Generated(hash = 602466792)
    public Student(Long id, String name, int age, Long teacherId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.teacherId = teacherId;
    }
    @Generated(hash = 1556870573)
    public Student() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Long getTeacherId() {
        return this.teacherId;
    }
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

}
