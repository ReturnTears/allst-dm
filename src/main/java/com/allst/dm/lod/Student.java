package com.allst.dm.lod;

/**
 * @author June
 * @since 2021年10月
 */
public class Student {
    // 学生姓名
    private String name;
    // 学生排名
    private int rank;
    // 学生成绩
    private double grade;

    public Student(String name, int rank, double grade) {
        this.name = name;
        this.rank = rank;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
