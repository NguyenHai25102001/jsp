package jsoft.gui.article;

import java.sql.ResultSet;

import jsoft.ShareControl;
import jsoft.objects.ArticleObject;

public interface Article extends ShareControl {

	
	public ResultSet getArticle(int id);
	public ResultSet getArticles(ArticleObject similar, ArticleSort as, int at, byte total);
	
}
