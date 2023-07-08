package jsoft.gui.article;

import java.sql.*;

import java.sql.SQLException;
import java.sql.ResultSet;

import jsoft.gui.basic.*;
import jsoft.*;
import jsoft.objects.ArticleObject;

public class ArticleImpl extends BasicImpl implements Article {

	public ArticleImpl(ConnectionPool cp) {
		super("Article", cp);
	}

	@Override
	public ResultSet getArticle(int id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tblarticle a ";
		sql += "LEFT JOIN tblcategory c ON a.article_category_id = c. category_id ";
		sql += "LEFT JOIN tblsection s ON c.category_section_id=s.section_id ";
		;
		sql += "WHERE a.article_id=?";
		return this.get(sql, id);

	}

	@Override
	public ResultSet getArticles(ArticleObject similar, ArticleSort as, int at, byte total) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tblarticle a ";
		sql += "LEFT JOIN tblcategory c ON a.article_category_id = c. category_id ";
		sql += "LEFT JOIN tblsection s ON c.category_section_id=s.section_id ";
		

		sql += this.createConditions(similar);

		switch (as) {
		case ID:
			sql += "ORDER BY article_id DESC ";
			break;
		case TITLE:
			sql += "ORDER BY article_title ASC ";
			break;
		case CATEGORY:
			sql += "ORDER BY article_category_id DESC ";
			break;
		case SECTION:
			sql += "ORDER BY article_section_id DESC ";
			break;
		case AUTHOR:
			sql += "ORDER BY article_author_name ASC ";
			break;
		case MANAGER:
			sql += "ORDER BY article_manager_id DESC ";
			break;
		case VISITED:
			sql += "ORDER BY article_visited DESC ";
			break;
		}
		sql += "LIMIT " + at + ", " + total;
		return this.gets(sql);
	}

	private String createConditions(ArticleObject similar) {
		String tmp = "";

		if (similar != null) {
			// lây chuyên muc bài viêt
			short sid = similar.getSection_id();
			if (sid == 0) {
				sid = similar.getCategory_section_id();
			}
			if (sid == 0) {
				sid = similar.getArticle_section_id();
			}

			// khi tồn tại sid
			if (sid > 0) {
				tmp = "(article_section_id=" + sid + ")";
			}

			// Lấy thể loại
			short cid = similar.getCategory_id();
			if (cid == 0) {
				cid = similar.getArticle_category_id();
			}

			// Khi tồn tại
			if (cid > 0) {
				if (!tmp.equalsIgnoreCase("")) {
					tmp += " AND (article_category_id=" + cid + ")";
				} else {
					tmp = "(article_category_id=" + cid + ")";
				}
			}

			// Lọc những bài viết không xóa và hiển thị
			if (!similar.isArticle_delete()) {
				if (!tmp.equalsIgnoreCase("")) {
					tmp += " AND ((article_delete=0) AND (article_enable=1) )";
				} else {
					tmp += "(article_delete=0) AND (article_enable=1) ";
				}
			}

		}
		if (!tmp.equalsIgnoreCase("")) {
			tmp = "WHERE (" + tmp + ")";
		}

		return tmp;
	}
	
	

}
