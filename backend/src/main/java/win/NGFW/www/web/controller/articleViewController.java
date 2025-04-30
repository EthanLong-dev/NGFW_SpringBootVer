package win.NGFW.www.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import win.NGFW.www.web.entity.Article;
import win.NGFW.www.web.service.ArticleService;

@RestController
@RequestMapping("articleview")
public class articleViewController {

	@Autowired
	private ArticleService service;
	
	@GetMapping
	public Article View(Integer articleId) {
		
		return service.findIndex(articleId);
	}
		
}
