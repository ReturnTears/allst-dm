package com.allst.dm.dp.builder;

/**
 * @author June
 * @since 2021年07月
 */
public class Builder2 {
    public static void main(String[] args) {
        Produce.Builder builder = new Produce.Builder()
                .productName("HuaWei Mate Book ").companyName("HuaWei").part1("part-1").part2("part-2").part3("part-3");
        builder.part4("part-4");
        Produce build = builder.build();
        System.out.println(build);
    }
}

/**
 * Builder模式与不可变对象结合
 */
class Produce {
    private final String productName;
    private final String companyName;
    private final String part1;
    private final String part2;
    private final String part3;
    private final String part4;

    public Produce(String productName, String companyName, String part1, String part2, String part3, String part4) {
        this.productName = productName;
        this.companyName = companyName;
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
        this.part4 = part4;
    }

    @Override
    public String toString() {
        return "Produce{" +
                "productName='" + productName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                ", part3='" + part3 + '\'' +
                ", part4='" + part4 + '\'' +
                '}';
    }

    // 定义一个静态内部类
    static class Builder {
        private String productName;
        private String companyName;
        private String part1;
        private String part2;
        private String part3;
        private String part4;

        public Builder productName(String productName) {
            this.productName = productName;
            return this; // 可以实现链式调用
        }

        public Builder companyName(String companyName) {
            this.companyName = companyName;
            return this; // 可以实现链式调用
        }

        public Builder part1(String part1) {
            this.part1 = part1;
            return this; // 可以实现链式调用
        }

        public Builder part2(String part2) {
            this.part2 = part2;
            return this; // 可以实现链式调用
        }

        public Builder part3(String part3) {
            this.part3 = part3;
            return this; // 可以实现链式调用
        }

        public Builder part4(String part4) {
            this.part4 = part4;
            return this; // 可以实现链式调用
        }

        public Produce build() {
            return new Produce(this.productName, this.companyName, this.part1, this.part2, this.part3, this.part4);
        }
    }
}
