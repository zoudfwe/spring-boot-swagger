package com.my.project4.apiController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.my.project4.model.MUser;
import com.my.project4.serviceImpl.IMUserService;
import com.my.project4.serviceImpl.IUserService;

@RestController
@RequestMapping("/api/rest")
public class HomeRestController {
	@Autowired
	private IUserService UserService;
	@Autowired
	private IMUserService MUserService;
	
	/* 
	 * 通过 @ApiOperation 注解来给API增加说明
	 * 通过 @ApiImplicitParams 、 @ApiImplicitParam 注解来给参数增加说明
	 * 访问 http://localhost:8080/swagger-ui.html，进入swagger2接口页面,
	 * 这里无效，访问下面地址
	 * http://localhost:8080/swagger/dist/index.html
	 */
	
	@ApiOperation(value = "获取主rest API数据", notes="")
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homeRest(){
		String userName = UserService.getUsernameById(0);
		return userName + ", welcome to use restController !";
	}
	
	@ApiOperation(value = "获取M用户信息", notes = "根据M用户的id获取")
	/*@ApiImplicitParams({
		@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String")
	})*/
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String")
	@RequestMapping(value="/get/{id}", method = RequestMethod.GET)
	public MUser getMUser(@PathVariable String id) {
		MUser Muser = MUserService.selectByPrimaryKey(id);
		return Muser;
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
	public String remove(@PathVariable int id){
		return "remove";
	}
	
}
