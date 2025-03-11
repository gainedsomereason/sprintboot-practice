package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/god/{variable1}")
public class HelloController {
	@ResponseBody
	@RequestMapping("*/dead/{variable2}")
	public String hello(@PathVariable String variable1,@PathVariable int variable2) {
		return "hello "+variable1+" come to home, dear "+variable2;}

}

/**
定义了两个URI 变量，一个是控制器类上的variable1 ，一个是showView 方法上的variable2 ，
然后在showView 方法的参数里面使用@PathVariable 标记使用了这两个变量。
所以当我们使用/test/hello/showView/2.do 来请求的时候就可以访问到MyController 的showView 方法，这个时候variable1 就被赋予值hello ，
variable2 就被赋予值2 ，然后我们在showView 方法参数里面标注了参数variable1 和variable2 是来自访问路径的path 变量，
这样方法参数variable1 和variable2 就被分别赋予hello 和2 。方法参数variable1 是定义为String 类型，variable2 是定义为int 类型

在上面的代码中我们可以看到在标记variable1 为path 变量的时候我们使用的是@PathVariable ，
而在标记variable2 的时候使用的是@PathVariable(“variable2”) 。这两者有什么区别呢？第一种情况就默认去URI 模板中找跟参数名相同的变量，
但是这种情况只有在使用debug 模式进行编译的时候才可以，而第二种情况是明确规定使用的就是URI 模板中的variable2 变量。当不是使用debug 模式进行编译，
或者是所需要使用的变量名跟参数名不相同的时候，就要使用第二种方式明确指出使用的是URI 模板中的哪个变量。

除了在请求路径中使用URI 模板，定义变量之外，@RequestMapping 中还支持通配符“* ”。

*/
