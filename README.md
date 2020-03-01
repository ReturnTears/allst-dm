# Java设计模式
```
dm: design mode 设计模式

原型设计模式问题:
1、UML类图画出原型模式核心角色
2、原型设计模式的深拷贝和浅拷贝是什么
3、在Spring框架中哪里使用到了原型模式
4、Spring中原型bean的创建，就是原型模式的应用
5、代码分析 + Debug源码

设计模式的七大原则
1）、七大设计原则核心思想
2）、能够以类图的说明设计原则
3）、在项目实际开发中，哪里使用到了那些原则

设计模式常用七大原则:
1）、单一职责原则
2）、接口隔离原则
3）、依赖倒转原则
4）、里氏替换原则
5）、开闭原则
6）、迪米特发原则
7）、合成复用原则

设计模式的重要性

```
## 单一职责原则
```
单一职责：single responsibility

```

## 接口隔离原则
```

```

## 依赖倒转原则
```
依赖倒转原则：Dependence Inversion Princle （DIP）
```

## 里氏替换原则
```

```

## 开闭原则
```
开闭原则是编程中最基础最重要的设计原则
用抽象构建框架， 用实现扩展细节
```

## 迪米特法则
```text
注意事项：
1、迪米特法则的核心是降低类之间的耦合
2、注意，由于每个类都减少不必要的依赖，因此迪米特法则只是要求降低类间耦合关系，并不是要求完全的没有依赖关系

```

## 合成复用原则
```text
基本介绍：
原则是尽量使用合成/聚合的方式，而不是使用继承

```

## Java设计模式
```text
UML类图
UML -- Unified modeling language(统一建模语言)

类之间的关系:
依赖、泛化（继承）、实现、关联、聚合、组合
dependence、generalization、implementation、association、aggregation、composition
依赖: 只要是在类中用到了对方， 那么它们之间就存在依赖关系。如果没有对方， 连编译都过不了
泛化: 泛化关系实际上就是继承关系，他是依赖关系的特例
实现:
关联: 关联关系实际上就是类与类之间的联系，它是依赖关系的特例，关联具有导航性，即双向关系或单向关系
聚合: 聚合关系表示的整体和部分的关系，整体与部分可以分开。聚合关系是关联关系的特例
组合: 聚合关系表示的整体和部分的关系，整体与部分不可以分开。

设计模式概述
模式不是代码，而是某类问题的通用解决方案，设计模式（design pattern）代表了最佳的实践。
这些解决方案是众多软件开发人员经过相当长一段时间的试验和错误总结出来的。
设计模式的本质是提高软件的维护性，通用性和扩展性，并降低软件的复杂度。
并非只有23种设计模式，只是着23种设计模式包括了软件开发种绝大多数的情况

设计模式分类: 共分23种
1)、创建型模式: 单例模式、抽象工程模式、原型模式、建造者模式、工厂模式
2)、结构型模式: 适配器模式、桥接模式、装饰模式、组合模式、外观模式、亨元模式、代理模式
3)、行为型模式: 模板方法模式、命令模式、访问者模式、迭代模式、观察者模式、中介模式、备忘录模式、解释器模式、状态模式、策略模式、职责链模式

```

# 设计模式
## 单例模式
```

```
