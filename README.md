# Java设计模式
```text
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
```text
单一职责：single responsibility

```

## 接口隔离原则
```text
“接口隔离原则”的定义是：客户端不应该被迫依赖于它不使用的方法,该原则还有另外一个定义：一个类对另一个类的依赖应该建立在最小的接口上。

接口隔离原则（Interface Segregation Principle，ISP）要求程序员尽量将臃肿庞大的接口拆分成更小的和更具体的接口，让接口中只包含客户感兴趣的方法。

接口隔离是为了高内聚、低耦合。

在具体应用接口隔离原则时，应该根据以下几个规则衡量。
·接口尽量小，但是要有限度。一个接口只服务于一个子模块或业务逻辑。
·为依赖接口的类定制服务。只提供调用者需要的方法，屏蔽不需要的方法。
·了解环境，拒绝盲从。每个项目或产品都有选定的环境因素，环境不同，接口拆分的标准就不同，要深入了解业务逻辑。
·提高内聚，减少对外交互。让接口用最少的方法完成最多的事情。

```

## 依赖倒转原则
```text
依赖倒转原则：Dependence Inversion Princle （DIP）
依赖倒置原则（Dependence Inversion Principle，DIP）是指在设计代码架构时，高层模块不应该依赖于底层模块，二者都应该依赖于抽象。抽象不应该依赖于细节，细节应该依赖于抽象。

依赖倒置原则是实现开闭原则的重要途径之一，它降低了类之间的耦合，提高了系统的稳定性和可维护性，同时这样的代码一般更易读，且便于传承。
```

## 里氏替换原则
```text
如果S是T的子类型，那么所有T类型的对象都可以在不破坏程序的情况下被S类型的对象替换。
简单来说，子类可以扩展父类的功能，但不能改变父类原有的功能。
也就是说：当子类继承父类时，除添加新的方法且完成新增功能外，尽量不要重写父类的方法。
这句话包括了四点含义：
·子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法。
·子类可以增加自己特有的方法。
·当子类的方法重载父类的方法时，方法的前置条件（即方法的输入参数）要比父类的方法更宽松。
·当子类的方法实现父类的方法（重写、重载或实现抽象方法）时，方法的后置条件（即方法的输出或返回值）要比父类的方法更严格或与父类的方法相等。

里氏替换原则的作用
·里氏替换原则是实现开闭原则的重要方式之一。
·解决了继承中重写父类造成的可复用性变差的问题。
·是动作正确性的保证，即类的扩展不会给已有的系统引入新的错误，降低了代码出错的可能性。
·加强程序的健壮性，同时变更时可以做到非常好的兼容性，提高程序的维护性、可扩展性，降低需求变更时引入的风险。
```

## 开闭原则
```text
开闭原则是编程中最基础最重要的设计原则
用抽象构建框架， 用实现扩展细节

开闭原则规定软件中的对象、类、模块和函数对扩展应该是开放的，但对于修改是封闭的。
这意味着应该用抽象定义结构，用具体实现扩展细节，以此确保软件系统开发和维护过程的可靠性。
开闭原则的核心思想也可以理解为面向抽象编程。
```

## 迪米特法则
```text
迪米特法则（Law of Demeter，LoD）又称为最少知道原则（Least KnowledgePrinciple，LKP），是指一个对象类对于其他对象类来说，知道得越少越好。
也就是说，两个类之间不要有过多的耦合关系，保持最少关联性。

迪米特法则有一句经典语录：只和朋友通信，不和陌生人说话。也就是说，有内在关联的类要内聚，没有直接关系的类要低耦合。



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
模式定义：保证一个类只有一个实例，并且提供一个全局访问点
单例模式的注意事项和细节说明:
1、单例模式保证了系统内存中该类只存在一个对象， 节省了系统资源，对于一些需要频繁创建销毁的对象， 使用单例模式可以提高性能
2、当想实例化一个单例类的时候， 必须要记住使用相应的获取对象的方法， 而不是使用new
3、单例模式的使用场景:
   需要频繁的进行创建和销毁的对象，创建对象时耗时过多或耗费资源过多(即：重量级对象)，
   但又经常用到的对象，工具类对象， 频繁访问数据或文件的对象(如：数据源，session工厂)
场景：
重量级的对象， 不需要多个实例，如：线程池，数据库连接池
模式分类:
1、懒汉模式：延迟加载，只有在真正使用的时候才开始实例化
1.1、线程安全问题
1.2、double check 加锁优化
1.3、编译器（JIT），CPU有可能对指令进行重排序，导致使用到尚未初始化的实例，可以通过添加volatile关键字进行修饰
    对于volatile修饰的字段，可以防止指令重排序

2、饿汉模式：类加载的初始化阶段就完成了实例的初始化， 本质上就是借助于JVM的类加载机制，保证实例的唯一性。
类加载的过程：
2.1、加载二进制数据到内存中，生成对应的Class数据结构
2.2、连接：a.验证、b.准备（给类的静态成员变量赋默认值）、c.解析
2.3、初始化：给类的静态变量赋初始值
只有在真正使用对应的类时，才会触发初始化， 如（当前类是启动类即main函数所在类， 直接继续new操作， 访问静态属性， 访问静态方法、用反射访问类、初始化一个类的子类）

3、静态内部类
3.1、本质上是利用类的加载机制来保证线程的安全
3.2、只有在实际使用的时候，才会触发类的初始化，所以也是懒加载的一种形式

4、单例模式在源码中的应用
Runtime类运用了饿汉模式
Currency运用了枚举
Tomcat



JVM序列化机制：


这里的线程安全指的是：创建实例的过程
```

## 工厂设计模式
```text
简单工厂模式

抽象工厂模式
定义了一个interface用于创建相关或有依赖关系的对象簇，而无需指明具体的类
抽象工厂模式可以将简单工厂模式和工厂方法模式进行整合
从设计层面看，抽象工厂模式就是对简单工厂模式的改进
将工厂抽象成两层，AbstractFactory(抽象工厂)和具体实现的工厂子类。
应用场景：
程序需要处理不同系列的相关产品， 但是不希望它依赖于这些产品的具体实现类时可以使用抽象工厂
Connection 连接器类就是使用的该模式
主要优点：
1、可以确信你从工厂得到的产品彼此是兼容的
2、可以避免具体产品和客户端之间的紧密耦合
3、符合单一职责原则
4、符合开闭原则


**工厂方法模式**
定义一个创建对象的抽象方法，由子类决定要实例化的类。工厂方法模式将对象的实例化推迟到子类
应用场景：
1、当不知道该使用对象的确切类型的时候
2、当你希望为库或框架提供扩展其内部组件的方法时
主要优点：
1、将具体产品和创建者解耦
2、符合单一职责原则
3、符合开闭原则
***
一个项目的是在不断演变的，如果一个项目是很稳定的，就没有必要使用设计模式；如果一个项目一直在变化， 也灭有必要使用设计模式
引入设计模式的前提是：在项目中找到变化部分中稳定的部分，这样才有使用设计模式的价值。
***

```

## 建造者模式
将一个复杂对象的创建与它表示分离，使得同样的构建过程可以创建不同的表示
应用场景：
1、需要生成的对象具有复杂的内部结构
2、需要生成的对象内部属性本身相互依赖
3、与不可变对象的配合使用
源码应用场景：
RequestMappingInfo

## 原型模式
指原型实例指定创建对象的种类， 并且通过拷贝这些原型创建新的对象
ArrayList中有clone实现的浅拷贝
**应用场景**：
当代码不应该依赖于需要复制的对象的具体类时，请使用Prototype模式
**主要优点**：
1、可以不耦合具体类的情况下克隆对象
2、避免重复的初始化代码
3、更方便的构建复杂对象
**Spring源码中的应用**：
org.springframework.beans.factory.factory.AbstractBeanDefinition
java.unit.Arrays

## 享元模式
运用共享技术有效地支持大量细粒度的对象
**主要优点**
如果系统有大量类似的对象， 可以节省大量的内存及CPU资源
**JDK源码中的应用**
String,Integer,Long,
com.sun.org.apache.bcel.internal.generic.InstructionConstants,

## 门面模式
Facade
为子系统中的一组接口提供一个一致的接口， Facade模式定义了一个高层接口，这个接口使得这一子系统更加容易使用
应用场景：
1、当您需要使用复杂子系统的有限但直接的接口时，使用Facade模式
2、当您想要将子系统组织成层时， 使用Facade模式
主要优点：
简化客户端的调用

## 适配器模式
Adapter
模式定义：
将一个类的接口转换成客户希望的另一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作，就是用来解决兼容性问题
应用场景：
1、当希望使用某些现有类，但其接口与您的其他代码不兼容是，可以使用适配器模式
2、当你希望重用几个现有的子类，这些子类缺少一些不能添加到的超类中公共功能，可以使用该模式
主要优点：
1、符合单一职责原则
2、符合开闭原则

对象适配器模式：
**JDK源码中的应用**
ApplicationListener
ArrayList.asList(xxx)

## 装饰器模式
模式定义：
在不改变原有对象的基础上，将功能附加到对象上
应用场景：
扩展一个类的功能或给哟个类添加附加职责
主要优点：
1、不改变原有对象的情况下给一个对象扩展功能
2、使用不同的组合可以实现不同的效果
3、符合开闭原则
**JDK源码中的应用**
Servlet API:
javax.servlet.http.HttpServletRequestWrapper
javax.servlet.http.HttpServletResponseWrapper

## 策略模式
```text
Strategy Pattern (sp)
1、分析项目变化与不变部分，提取变化部分，抽象成接口+实现

策略模式：分别封装行为接口，实现算法族，超类里放行为接口对象，在子类里具体设定行为对象。原则就是：分离变化部分，封装接口，基于接口编程各种功能。此模式让行为算法的变化独立于算法的使用者。

```

## 组合模式(Composite)
```
组合模式（Composite）是针对由多个节点对象（部分）组成的树形结构的对象（整体）而发展出的一种结构型设计模式，
它能够使客户端在操作整体对象或者其下的每个节点对象时做出统一的响应，保证树形结构对象使用方法的一致性，
使客户端不必关注对象的整体或部分，最终达到对象复杂的层次结构与客户端解耦的目的。

叉树结构：
    用组合模式来表达“部分/整体”的层次结构，提取并抽象其相同的部分，特殊化其不同的部分，以提高系统的可复用性与可扩展性，最终达到以不变应万变的目的。

文件系统：
    
组合模式的角色介绍：
 /resources/picture/组合模式.png
Component（组件接口）：所有复合节点与叶节点的高层抽象，定义出需要对组件操作的接口标准。
    对应本章例程中的抽象节点类，具体使用接口还是抽象类需根据具体场景而定。
Composite（复合组件）：包含多个子组件对象（可以是复合组件或叶端组件）的复合型组件，并实现组件接口中定义的操作方法。
    对应本章例程中作为“根节点/枝节点”的文件夹类。
Leaf（叶端组件）：不包含子组件的终端组件，同样实现组件接口中定义的操作方法。对应本章例程中作为“叶节点”的文件类。
Client（客户端）：按所需的层级关系部署相关对象并操作组件接口所定义的接口，即可遍历树结构上的所有组件。
```

# Git 
```text
Git提交报错：
OpenSSL SSL_read: Connection was reset, errno 10054 错误解决
使用如下命令：
git config --global http.sslVerify "false"
``` 