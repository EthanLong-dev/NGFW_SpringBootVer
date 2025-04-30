package win.NGFW.www.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;
import win.NGFW.www.web.entity.Article;
import win.NGFW.www.web.service.ArticleService;

@RestController
@RequestMapping("articlereview")
public class articleStaffReviewController{

	@Autowired
	private ArticleService service;
	

	@GetMapping
	public Article View(Integer articleId) {
		return service.findIndex(articleId);
	}
	
	@PostMapping
	public View articlereview(
			@RequestParam("articleid") Integer articleId,
			@RequestParam("reviewContent") String reviewContent,
			@RequestParam("status") String status
			) {
		
		
				
		Article article = new Article();
		article.setArticleId(articleId);
		article.setReviewContent(reviewContent);
		article.setStatus(status);
		
		String errMsg = service.updateReview(article);
		
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode respBody = mapper.createObjectNode();
		respBody.put("successfully", errMsg == null);
		respBody.put("errMsg", errMsg);
		
		return new RedirectView("/newsb/news_bmgrlist.html");

	}
	

}
