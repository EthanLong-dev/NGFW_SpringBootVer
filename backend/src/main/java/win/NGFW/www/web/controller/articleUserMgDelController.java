package win.NGFW.www.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import win.NGFW.www.web.service.ArticleService;

@RestController
@RequestMapping("articleumgrdel")
public class articleUserMgDelController {

	@Autowired
	private ArticleService service;
	
	@GetMapping
	public Integer userArticleDel(@RequestParam(name = "uId") Integer uid,@RequestParam(name = "articleId") Integer articleId){
		return service.userMgrDel(uid,articleId);
	}
}
