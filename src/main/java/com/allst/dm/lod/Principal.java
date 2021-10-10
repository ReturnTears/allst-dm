package com.allst.dm.lod;

import java.util.HashMap;
import java.util.Map;

/**
 * 校长类, 不该让校长直接管理学生，校长应该管理老师，由老师提供相应的学生信息查询服务
 *
 * @author June
 * @since 2021年10月
 */
public class Principal {

    private final Teacher teacher = new Teacher("张老师", "4-1班");

    /**
     * 查询班级信息， 学生认数，总分，平均分
     *
     * @param clazzId 班级id
     * @return 结果
     */
    public Map<String, Object> queryClazzInfo(String clazzId) {
        int studentCount = teacher.clazzStudentCount();
        double totalScore = teacher.clazzTotalScore();
        double averageScore = teacher.clazzAverageScore();
        Map<String, Object> map = new HashMap<>();
        map.put("班级", teacher.getClazz());
        map.put("老师姓名", teacher.getName());
        map.put("学生人数", studentCount);
        map.put("总分", totalScore);
        map.put("平均分", averageScore);
        return map;
    }


    /*// 总分
    public double clazzTotalScore() {
        double totalScore = 0;
        for (Student student : teacher.getStudentList()) {
            totalScore += student.getGrade();
        }
        return totalScore;
    }

    // 平均分
    public double clazzAverageScore() {
        double totalScore = 0;
        for (Student student : teacher.getStudentList()) {
            totalScore += student.getGrade();
        }
        return totalScore / teacher.getStudentList().size();
    }

    // 班级人数
    public int clazzStudentCount() {
        return teacher.getStudentList().size();
    }*/
}
