package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZypjApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZypjApplication.class, args);
	}

}

/**
Spring Bean类
Spring Bean 是 Spring 框架中的一个组件。它是由 Spring 容器管理的对象。
在 Spring 框架中，Bean 是由 Spring IoC（Inversion of Control，控制反转）容器管理和配置的对象。
Spring 容器负责创建、配置和管理这些 Bean 的生命周期。
Bean 通常是应用程序中的业务对象或服务对象，它们可以被其他 Bean 使用或依赖。
1，定义：
Bean 是由 Spring 容器管理的对象。
Bean 的定义包括其类名、初始化方法、销毁方法、依赖关系等。
2，生命周期：
Bean 的生命周期包括创建、初始化、使用和销毁四个阶段。
Spring 容器负责管理 Bean 的整个生命周期。
3，配置方式：
可以通过 XML 配置文件、注解或 Java 配置类来定义和配置 Bean。
--生命周期
1,实例化：
Spring 容器创建 Bean 的实例。
2,属性赋值：
容器将值和 Bean 的引用注入到 Bean 对应的属性中。
3,初始化：
调用初始化方法（如 @PostConstruct 注解的方法或 init-method 属性指定的方法）。
实现 InitializingBean 接口的 afterPropertiesSet 方法。
4,使用：
Bean 准备就绪，可以被应用程序使用。
5,销毁：
调用销毁方法（如 @PreDestroy 注解的方法或 destroy-method 属性指定的方法）。
实现 DisposableBean 接口的 destroy 方法。


POJO（Plain Old Java Object）是指普通的 Java 对象，它没有遵循任何特定的框架规则，是非侵入性的。
在 Spring 框架中，POJO 被广泛用于定义业务逻辑和服务层对象，因为 Spring 容器可以轻松地管理和配置这些对象。
一个标准的POJO应该是一个纯粹的Java对象，只包含数据和对数据的访问和修改方法，不包含任何业务逻辑和特定框架的依赖。
1，公共构造函数：POJO需要有公共的无参构造函数。
2，私有属性：POJO中的所有属性都应该使用私有（private）修饰符，以确保数据的封装性和安全性。
3，公共方法：POJO应该提供一些公共的getter和setter方法，以便访问和修改属性的值。
4，无业务逻辑：POJO不应该包含复杂的业务逻辑或其他与数据模型无关的功能。
5，不依赖特定框架：POJO不应该直接或间接地依赖于任何特定的框架或库。
1，遵循 Java Bean 的命名规则（getter 和 setter 方法）；
2，没有实现任何框架相关的接口或类；
3，没有继承框架相关的类。

Java Bean类
1，类必须是公共的，并且具有一个公共的无参数构造函数，因为Java反射机制在创建Bean时需要使用无参构造函数。
2，所有属性都应该是私有的，并且通过公共的getter/setter方法来访问和修改属性的值。
3，属性名必须遵循标准的命名规范，即以小写字母开头，后面的每个单词首字母大写，例如firstName、lastName。
4，应该实现序列化接口（Serializable），这样Bean对象才能在网络中进行传输或者被存储到文件中。
5，根据需要可以实现其他接口，比如多线程接口（Runnable）等。

Java Bean可以看作是POJO的一种特殊实现，符合特定规范的POJO对象。
1、定义方式：
POJO定义时没有规范要求，可以灵活自由地定义其属性和方法；
Java Bean则要求遵循特定的属性和方法规范，需要实现特定的接口和构造方法等。
2、用途：
POJO通常用于业务逻辑编写，用于封装数据并进行业务处理；
Java Bean则通常用于数据传输和存储，例如在Web开发中，可以将从Servlet传递给JSP的数据封装成Bean对象进行传输。
3、依赖性：
POJO不依赖于任何第三方类库或框架，是一种独立的Java对象；
Java Bean则通常需要使用特定的框架或技术进行创建和使用，例如Spring框架。



*/
