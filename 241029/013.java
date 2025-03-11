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
@Configuration和@ConfigurationProperties(prefix = "")是两个用于配置和管理应用程序设置的常用注解，它们扮演着不同但互补的角色。

@ConfigurationProperties注解：用于将配置文件中的属性绑定到一个POJO（Plain Old Java Object）上。
通过指定prefix属性，可以将配置文件中特定前缀的属性绑定到同名的POJO属性上。
这种方式简化了配置管理，使得配置数据的组织和使用变得更加方便。

注意：当你在类上使用 @ConfigurationProperties 注解时，你通常希望SpringBoot能够自动绑定配置文件中的属性到该类的字段上。
然而，仅仅使用 @ConfigurationProperties 注解并不足以让SpringBoot自动配置这些属性；
你还需要指示SpringBoot去寻找这些配置类并将其注册为Spring容器中的bean，
通常在配置类上使用@EnableConfigurationProperties注解
或直接在@ConfigurationProperties类上声明一个Spring组件注解（如 @Component、@Configuration等）。



IoC（Inversion of Control，控制反转）是一种软件设计原则，它将对象的创建和依赖关系的管理从应用程序代码中转移到容器或框架中。
在传统的编程模式中，对象之间的依赖关系通常由开发者手动创建和管理，但在IoC容器中，对象的创建和依赖关系的注入由容器负责。

IoC的核心思想是通过将对象的控制权反转给容器，实现了解耦和灵活性。
在IoC容器中，对象的创建和生命周期由容器管理，而不是由开发者直接控制。
开发者只需要定义对象之间的依赖关系，并通过容器来获取所需的对象实例。

IoC容器通常通过依赖注入（Dependency Injection，DI）来实现对象之间的依赖关系。
依赖注入可以通过构造函数注入、属性注入或方法注入等方式实现。
容器在创建对象时，会自动解析对象的依赖关系，并将所需的依赖对象注入到目标对象中。



读取Spring核心配置文件初始化容器对象切换为读取Java配置类初始化容器对象
//加载配置文件初始化容器
ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
切换为下面
//加载配置类初始化容器
ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

//声明当前类为Spring配置类
@Configuration
//Spring注解扫描，相当于<context:component-scan base-package="com.by"/>
@ComponentScan("com.by")
//设置bean扫描路径，多个路径书写为字符串数组格式
//@ComponentScan({"com.by.service","com.by.dao"})
public class SpringConfig {
}

 @Test
    public void AppForAnnotaion(){
        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfig.class);
        OrderDao orderDao=(OrderDao) ac.getBean("orderDao");
        System.out.println(orderDao);
        //按类型匹配bean
        OrderService orderService=ac.getBean(OrderService.class);
        System.out.println(orderService);
    }


使用@Qualifier注解指定要装配的bean名称
解决IOC容器中同类型Bean有多个装配哪一个的问题

@Service
public class BookServiceImpl implements BookService {
    //@Autowired：注入引用类型，自动装配模式，默认按类型装配
    @Autowired
    //@Qualifier：自动装配bean时按bean名称装配
    @Qualifier("bookDaoImpl")
    //单独使用和@Qualifier+@Autowired 一样 主要是根据名称注入
    @Resource(name="bookDao")
    private BookDao bookDao;
​
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}





*/
