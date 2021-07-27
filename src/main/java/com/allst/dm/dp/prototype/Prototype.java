package com.allst.dm.dp.prototype;

import java.io.*;

/**
 * 1、利用Java克隆的机制实现原型对象的拷贝
 * 2、利用序列化进行对象的深拷贝
 *
 * @author June
 * @since 2021年07月
 */
public class Prototype {
    public static void main(String... args) throws CloneNotSupportedException {
        Produce produce = new Produce("part-1", "part-2", 3, 4, new BaseInfo("Lenovo"));
        Produce cloneProduce = produce.clone();
        System.out.println(produce);
        System.out.println(cloneProduce);

        produce.getBaseInfo().setCompanyName("HuaWei Mate Book");
        System.out.println(produce);
        System.out.println(cloneProduce);
    }
}

class BaseInfo implements Cloneable, Serializable {
    static final long serialVersionUID = 42L;
    private String companyName;

    public BaseInfo(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BaseInfo{" +
                "companyName='" + companyName + '\'' +
                '}';
    }

    @Override
    protected BaseInfo clone() throws CloneNotSupportedException {
        return (BaseInfo) super.clone();
    }
}

/**
 * Cloneable
 */
class Produce implements Cloneable, Serializable {
    static final long serialVersionUID = 42L;
    private String part1;
    private String part2;
    private Integer part3;
    private Integer part4;
    private BaseInfo baseInfo;

    @Override
    protected Produce clone() throws CloneNotSupportedException {
        // version1
        /*Produce clone = (Produce) super.clone();
        BaseInfo clone2 = this.baseInfo.clone();
        clone.setBaseInfo(clone2);
        return clone;*/

        // version2: 序列化
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream)) {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        try (ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream)) {
            Produce produce = (Produce) ois.readObject();
            return produce;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Produce() {
    }

    public Produce(String part1, String part2, Integer part3, Integer part4, BaseInfo baseInfo) {
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
        this.part4 = part4;
        this.baseInfo = baseInfo;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public Integer getPart3() {
        return part3;
    }

    public void setPart3(Integer part3) {
        this.part3 = part3;
    }

    public Integer getPart4() {
        return part4;
    }

    public void setPart4(Integer part4) {
        this.part4 = part4;
    }

    @Override
    public String toString() {
        return "[" + super.hashCode() + "] Produce{" +
                "part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                ", part3=" + part3 +
                ", part4=" + part4 +
                ", baseInfo=" + baseInfo +
                '}';
    }
}
