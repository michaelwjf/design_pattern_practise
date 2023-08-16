# 类图关系

类的关系有泛化(Generalization)、实现（Realization）、 
依赖(Dependency)和关联(Association)。

其中关联又分为一般关联关系和聚合关系(Aggregation)，合成关系(Composition)。


## 泛化 (Generalization): 即继承关系。
表示is-a的关系，是对象之间耦合度最大的一种关系，子类继承父类的所有细节。
在类图中使用带三角箭头的实线表示，箭头从子类指向父类。

>plantUML表示：<|--

>类B继承自类A，表示为 A <|-- B


## 实现（Realization）:
在类图中就是接口和实现的关系。在类图中使用带三角箭头的虚线表示，箭头从实现类指向接口。

> plantUML表示：<|..

> 类B实现了A接口，表示为 A <|.. B


## 依赖 (Dependency): 即在成员属性或者方法中使用其他类。
对象之间最弱的一种关联方式，是临时性的关联。
代码中一般指由局部变量、函数参数、返回值建立的对于其他对象的调用关系。

一个类调用被依赖类中的某些方法而得以完成这个类的一些职责。
在类图使用带箭头的虚线表示，箭头从使用类指向被依赖的类。

> plantUML表示：<..

类B依赖A，即在B的属性或者方法中使用了类A（例如B的方法B.create()，返回一个A对象），
> 表示为 A <.. B


## 关联 (Association):
对象之间一种引用关系。这种关系通常使用类的属性表达。关联又分为一般关联、聚合关联与组合关联。

> plantUML表示：-- or "N"<-->"N"


## 聚合 (Aggregation):
表示has-a的关系，是一种不稳定的包含关系。
较强于一般关联,有整体与局部的关系,并且没有了整体,局部也可单独存在。

如公司和员工的关系，公司包含员工，但如果公司倒闭，员工依然可以换公司。

在类图使用空心的菱形表示，菱形从局部指向整体。

> plantUML表示：o--

> 公司包含员工的聚合关系表示为： Company o-- Employee


## 组合 (Composition):
表示contains-a的关系，是一种强烈的包含关系。

组合类负责被组合类的生命周期。是一种更强的聚合关系。部分不能脱离整体存在。

如公司和部门的关系，没有了公司，部门也不能存在了；调查问卷中问题和选项的关系；
订单和订单选项的关系。

在类图使用实心的菱形表示，菱形从局部指向整体。

> plantUML表示：*--

> 公司和部门的组合关系表示为：Company *-- Department