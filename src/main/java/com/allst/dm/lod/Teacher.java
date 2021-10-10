package com.allst.dm.lod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author June
 * @since 2021年10月
 */
public class Teacher {
    // 老师姓名
    private String name;
    // 班级
    private String clazz;
    // 学生人数
    private static List<Student> studentList;

    public Teacher() {
    }

    public Teacher(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    static {
        studentList = new ArrayList<>();
        studentList.add(new Student("kangkang", 10, 600));
        studentList.add(new Student("shujun", 11, 590));
        studentList.add(new Student("xiaoqiang", 15, 581));
        studentList.add(new Student("xiaohu", 22, 570));
        studentList.add(new Student("pidan", 7, 666));
    }

    public String getName() {
        return name;
    }

    public String getClazz() {
        return clazz;
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    // 总分
    public double clazzTotalScore() {
        double totalScore = 0;
        for (Student student : studentList) {
            totalScore += student.getGrade();
        }
        return totalScore;
    }

    // 平均分
    public double clazzAverageScore() {
        double totalScore = 0;
        for (Student student : studentList) {
            totalScore += student.getGrade();
        }
        return totalScore / studentList.size();
    }

    // 班级人数
    public int clazzStudentCount() {
        return studentList.size();
    }
}
