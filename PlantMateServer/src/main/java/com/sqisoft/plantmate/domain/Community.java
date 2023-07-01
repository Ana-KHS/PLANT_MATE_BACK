/*
 * 
 */
package com.sqisoft.plantmate.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.ToString;

/**
 * table tb_community
 * 
 * @author jynius
 */
@Data
@ToString
public class Community implements Serializable {
	
	private static final long serialVersionUID = -6491914742239738230L;

	public static enum Category {
		
		ASK("A", "질문해요"),
		BRAG("B", "자랑해요"),
		LIVING("L", "생활정보");
		
		private String id;
		private String title;
		private Category(String id, String title) {
			this.id = id;
			this.title = title;
		}
		
		public String getId() {
			return this.id;
		}
		
		public String getTitle() {
			return this.title;
		}

		static Category of(String id) {
			
			for(Category c: values()) {
				if(c.getId().equals(id)) {
					return c;
				}
			}

			return null;
		}
	}
	
    /**
     * column tb_community.COMMUNITYID
     */
    private Integer id;

    /**
     * column tb_community.TITLE
     */
    private String title;

    /**
     * column tb_community.CONTENT
     */
    private String content;

    /**
     * column tb_community.CREATE_DATE
     */
    private Date createDate;

    /**
     * column tb_community.MODIFY_DATE
     */
    private Date modifyDate;

    /**
     * column tb_community.CATEGORYID
     */
    private Category category;

    /**
     * column tb_community.FILEID
     */
    private Integer fileId;

    /**
     * column tb_community.PLANTID
     */
    private Integer plantId;
    
    /**
     * @return
     */
    public String getCategoryId() {
    	return category==null? null: category.getId();
    }
    
    public void setCategoryId(String id) {
    	this.category = Category.of(id);
    }
}