package com.example.springquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动类
@SpringBootApplication
public class SpringbootQuickstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootQuickstartApplication.class, args);
	}

}


/**
 * springboot开发web应用，http://localhost:8080/hello
 * 	创建Maven工程
 * 	导入spring-boot-starter-web起步依赖(spring web)
 * 	编写controller
 * 	提供启动类(包含main方法的java类)，
 * 		在类上加@ SpringBootApplication注解来标识当前这个java类是boot程序的入口，是启动类
 * 		main方法中，SpringApplication.run(SpringbootStartApplication.class,args)
 * 			两个参数，前者是当前类的字节码文件，后者是main方法的数组参数args
 * 		运行main时，这个springboot工程会启动，内置的tomcat也会自动启动起来，controller之类的写好的资源也会部署好
 * 
 */

//
//<!--web起步依赖-->
//<dependency>
//	<groupId>org.springframework.boot</groupId>
//	<artifactId>spring-boot-starter-web</artifactId>
//</dependency>

//<!--boot工程的父工程，用于管理起步依赖的版本-->
//<parent>
//	<groupId>org.springframework.boot</groupId>
//	<artifactId>spring-boot-starter-parent</artifactId>
//	<version>3.3.2</version>
//	<relativePath/> <!-- lookup parent from repository -->
//</parent>

/**
 * src/main下的resources文件
 * 	static、templates存放静态资源文件，
 * 	application.properties
 * 		springboot在写配置时需要在properties或yaml配置文件里来写
 * 
 * 在application.properties中输入
 * 	server.port=9090//端口改为9090
 *	server.servlet.context-path=/start//虚拟目录改为/start
 *		http://localhost:9090/start/hello
 *
 *	yaml配置文件后缀为yml或yaml,输入
 * 		server:
 * 			port:9191	
 * 			servlet:
 * 				context-path:/start
 * 
 * 	文件后缀加上.bak,暂时不让java识别这个文件
 * 
*/
/**
 * yml配置信息书写与获取
 * 	第三方配置信息
 * 		如果要使用redis
 * 			1，引入redis依赖，porn.xml
 * 			2，根据文档编写配置信息，application.yml
 * 	自定义配置信息
 * 			1，引入redis依赖，porn.xml
 * 			2，根据文档编写配置信息，application.yml
 * 			3，获取配置信息
 * 				将配置信息直接写在.java里不合适，因为配置信息和java代码耦合死了
 * 					配置信息发生变化，就不得不修改代码，重新编译，重新测试，重新打包，重新部署
 * 				而写在配置文件如yml中，修改配置信息后只需重启服务器，不需要重新编译等等
 * 					java代码中就要获取配置信息
 * 
 * 
 */
