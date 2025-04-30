package win.NGFW.www.web.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import win.NGFW.www.core.pojo.CoreMsg;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
//@NoArgsConstructor
public class Article extends CoreMsg {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "article_id")
	private Integer articleId;
	@Column(name = "user_id")
	private Integer userId;
	@Column(name = "staff_id")
	private Integer staffId;
	@Column(name = "news_photo")
	private String newsPhoto;
//	@Column(name = "maintitle")
	private String mainTitle;
//	@Column(name = "subtitle")
	private String subTitle;
//	@Column(name = "content")
	private String content;
	private String reviewContent;
	@Column(name = "publish_date")
	@JsonFormat(pattern = "yyyy/MM/dd", timezone = "GMT+8")
	private Timestamp publishDate;
//	@Column(name = "status")
	private String status;
	@Column(name = "article_type")
	private String articleType;
	@Column(name = "create_time", insertable = false)
	@JsonFormat(pattern = "yyyy/MM/dd", timezone = "GMT+8")
	private Timestamp createTime; // Corresponds to CREATED_DATE (Timestamp of creation)

//	預設建構子
	public Article() {
//		this.userId = 6;
		this.staffId = 1;
	}
	
	@Transient
	private String name;

//	public Integer getArticleId() {
//		return articleId;
//	}
//	
//	public void setArticleId(Integer articleId) {
//		this.articleId = articleId;
//	}
//	
//	public Integer getUserId() {
//		return userId;
//	}
//	
//	public void setUserId(Integer userId) {
//		this.userId = userId;
//	}
//	
//	public Integer getStaffId() {
//		return staffId;
//	}
//	
//	public void setStaffId(Integer staffId) {
//		this.staffId = staffId;
//	}
//	
//	public String getNewsPhoto() {
//		return newsPhoto;
//	}
//	
//	public void setNewsPhoto(String newsPhoto) {
//		this.newsPhoto = newsPhoto;
//	}
//	
//	public String getMainTitle() {
//		return mainTitle;
//	}
//
//	public void setMainTitle(String mainTitle) {
//		this.mainTitle = mainTitle;
//	}
//	
//	public String getSubTitle() {
//		return subTitle;
//	}
//
//	public void setSubTitle(String subTitle) {
//		this.subTitle = subTitle;
//	}
//	
//	public String getContent() {
//		return content;
//	}
//
//	public void setContent(String content) {
//		this.content = content;
//	}
//	
//	public Timestamp getPublishDate() {
//		return publishDate;
//	}
//
//	public void setPublishDate(Timestamp publishDate) {
//		this.publishDate = publishDate;
//	}
//
//	public Boolean getStatus() {
//		return status;
//	}
//
//	public void setStatus(Boolean status) {
//		this.status = status;
//	}
//	
//	public String getArticleType() {
//		return articleType;
//	}
//
//	public void setArticleType(String articleType) {
//		this.articleType = articleType;
//	}
//
//	public Timestamp getCreatedTime() {
//		return createdTime;
//	}
//
//	public void setCreatedTime(Timestamp createdTime) {
//		this.createdTime = createdTime;
//	}


}
