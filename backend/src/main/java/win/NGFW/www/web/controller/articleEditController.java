package win.NGFW.www.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;
import win.NGFW.www.web.entity.Article;
import win.NGFW.www.web.service.ArticleService;

import java.sql.Timestamp;

@RestController
@RequestMapping("articleedit")
public class articleEditController{

	@Autowired
	private ArticleService service;
	

	@GetMapping
	public Article View(Integer articleId) {
		return service.findIndex(articleId);
	}
	
	@PostMapping
	public View articleedit(
			@RequestParam("articleid") Integer articleId,
			@RequestParam("articletype") String articleType,
			@RequestParam("titleimage") String newsPhoto,
			@RequestParam("maintitle") String mainTitle,
			@RequestParam("subtitle") String subTitle,
			@RequestParam("summernote") String content,
			@RequestParam("publishDate") String pDate,
			@RequestParam("status") String status,
			@RequestParam("uId") Integer userId
			) {
		
		
		pDate = pDate + " 00:00:00";
		Timestamp publishDate = Timestamp.valueOf(pDate);
				
		Article article = new Article();
		article.setArticleId(articleId);
		article.setArticleType(articleType);
		article.setNewsPhoto(newsPhoto);
		article.setMainTitle(mainTitle);
		article.setSubTitle(subTitle);
		article.setContent(content);
		article.setPublishDate(publishDate);
		article.setStatus(status);
		article.setUserId(userId);
		
		String errMsg = service.update(article);
		
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode respBody = mapper.createObjectNode();
		respBody.put("successfully", errMsg == null);
		respBody.put("errMsg", errMsg);
		
		return new RedirectView("/newsf/news_fmgr.html");

//		return respBody;
	}
	

}
