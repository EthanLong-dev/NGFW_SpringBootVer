package win.NGFW.www.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import win.NGFW.www.web.entity.Article;
import win.NGFW.www.web.service.ArticleService;

import java.util.List;

@RestController
@RequestMapping("articleindex")
public class articleIndexController {

	@Autowired
	private ArticleService service;
	
	@GetMapping
	public List<Article> indexList(String articleType){
		
		if(articleType == null) {
			return service.findAll();
		}
		else {
			return service.categoryIndex(articleType);
		}
	}
	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////		resp.sendRedirect("newsf/news_fedit.html");
//		
//		resp.setContentType("application/json");
//		resp.setCharacterEncoding("UTF-8");
//
//        Article article = new Article();
//        List<Article> dataList = service.findAll();
//
//        String json = new Gson().toJson(dataList);
//        resp.getWriter().write(json);
//	}
	
}
