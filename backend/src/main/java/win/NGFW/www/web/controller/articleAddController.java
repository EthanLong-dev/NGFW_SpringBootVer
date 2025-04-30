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
@RequestMapping("articleadd")
public class articleAddController{

	@Autowired
	private ArticleService service;
	

	@GetMapping
	public View redirect(){
		return new RedirectView("newsf/news_fadd.html");
	}
	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.sendRedirect("newsf/news_fedit.html");
//	}
	
	@PostMapping
	public View articleadd(
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
		

//		String newsPhoto = req.getParameter("titleimage");
//		String mainTitle = req.getParameter("maintitle");
//		String subTitle = req.getParameter("subtitle");
//		String content = req.getParameter("summernote");
//		String pDate = req.getParameter("publishDate");
//		pDate = pDate + " 00:00:00";
//		Timestamp publishDate = Timestamp.valueOf(pDate);
		
		Article article = new Article();
		article.setArticleType(articleType);
		article.setNewsPhoto(newsPhoto);
		article.setMainTitle(mainTitle);
		article.setSubTitle(subTitle);
		article.setContent(content);
		article.setPublishDate(publishDate);
		article.setStatus(status);
		article.setUserId(userId);
		
		String errMsg = service.add(article);
		
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode respBody = mapper.createObjectNode();
		respBody.put("successfully", errMsg == null);
		respBody.put("errMsg", errMsg);
		
//		JsonObject respBody = new JsonObject();
//		respBody.addProperty("successfully", errMsg == null);
//		respBody.addProperty("errMsg", errMsg);
////		resp.getWriter().write(respBody.toString());
		
//		return respBody;
		return new RedirectView("/newsf/news_fmgr.html");
	}
	
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////		@RequestParam("titleimage") String newsPhoto;		
//		String newsPhoto = req.getParameter("titleimage");
//		String mainTitle = req.getParameter("maintitle");
//		String subTitle = req.getParameter("subtitle");
//		String content = req.getParameter("summernote");
//		String pDate = req.getParameter("publishDate");
//		pDate = pDate + " 00:00:00";
//		Timestamp publishDate = Timestamp.valueOf(pDate);
//		
//		Article article = new Article();
//		article.setNewsPhoto(newsPhoto);
//		article.setMainTitle(mainTitle);
//		article.setSubTitle(subTitle);
//		article.setContent(content);
//		article.setPublishDate(publishDate);
//
//		
////		Gson gson = new Gson();
////		Article article = gson.fromJson(req.getReader(), Article.class);
//		
//		String errMsg = service.add(article);
//		
//		JsonObject respBody = new JsonObject();
//		respBody.addProperty("successfully", errMsg == null);
//		respBody.addProperty("errMsg", errMsg);
//		resp.getWriter().write(respBody.toString());
//	}
}
