package win.NGFW.www.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import win.NGFW.www.web.entity.Article;
import win.NGFW.www.web.service.ArticleService;

import java.util.List;

@RestController
@RequestMapping("articleumgr")
public class articleUserMgController {

	@Autowired
	private ArticleService service;
	
	@GetMapping
	public List<Article> indexList(@RequestParam(name = "uId") Integer uid){
		return service.userMgrList(uid);
	}
	
//	@GetMapping
//	public List<Article> indexList(String articleType){
//		
//		if(articleType == null) {
//			return service.findAll();
//		}
//		else {
//			return service.categoryIndex(articleType);
//		}
//	}
	

	
}
