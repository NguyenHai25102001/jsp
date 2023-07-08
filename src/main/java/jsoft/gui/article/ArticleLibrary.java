package jsoft.gui.article;

import java.util.ArrayList;

import jsoft.objects.ArticleObject;
import jsoft.library.*;

public class ArticleLibrary {

	public static String viewNews(ArrayList<ArticleObject> items, boolean isHomeView) {
		String tmp = "<div class=\"row row-cols-2 row-cols-md-3 g-4\">";
		int count = 0; // Đếm số bài viết đưuọc trình bày

		for (ArticleObject item : items) {

			if (++count > 3 && isHomeView) {
				break;
			}

			tmp += "<div class=\"col\">";
			tmp += "<a href=\"/home/news/?id=" + item.getArticle_id() + "\" class=\"link-primary\">";
			tmp += "<div class=\"card\">";
			tmp += "<div class=\"card-img-crop hovergallery\">";
			tmp += "<img src=\"" + item.getArticle_image() + "\" class=\"card-img-top\" alt=\"...\">";
			tmp += "</div>			  ";
			tmp += "<div class=\"card-body\">";
			tmp += "<h5 class=\"card-title\">" + item.getArticle_title() + "</h5>";
			tmp += "<p class=\"card-text\">" + item.getArticle_summary() + "</p>";
			tmp += "</div>";
			tmp += "</div>";
			tmp += "</a>";
			tmp += "</div>";
		}

		tmp += "</div>";

		return tmp;
	}

	public static String viewSubNews(ArrayList<ArticleObject> items) {
		String tmp = "";

		tmp += "<section id=\"blog\" class=\"blog\">";
		tmp += "<div class=\"container\" data-aos=\"fade-up\">";
		tmp += "";
		tmp += "<div class=\"row g-5\">";
		tmp += "";
		tmp += "<div class=\"col-lg-8\" data-aos=\"fade-up\" data-aos-delay=\"200\">";
		tmp += "";
		tmp += "<div class=\"row gy-5 posts-list\">";
		tmp += "";
		tmp += "";
		tmp += "";
		tmp += "";
		tmp += "";
		tmp += "";
		tmp += "";
		tmp += "";

		for (ArticleObject item : items) {
			tmp += "<div class=\"col-lg-6\">";
			tmp += "<article class=\"d-flex flex-column\">";
			tmp += "";
			tmp += "<div class=\"post-img\">";
			tmp += "<img src=\"" + item.getArticle_image() + "\" alt=\"\" class=\"img-fluid\">";
			tmp += "</div>";
			tmp += "";
			tmp += "<h2 class=\"title\">";
			tmp += "<a href=\"blog-details.html\">" + item.getArticle_title() + "</a>";
			tmp += "</h2>";
			tmp += "";
			tmp += "<div class=\"meta-top\">";
			tmp += "<ul>";
			tmp += "<li class=\"d-flex align-items-center\"><i class=\"bi bi-person\"></i> <a href=\"blog-details.html\">John Doe</a></li>";
			tmp += "<li class=\"d-flex align-items-center\"><i class=\"bi bi-clock\"></i> <a href=\"blog-details.html\"><time datetime=\"2022-01-01\">Jan 1, 2022</time></a></li>";
			tmp += "<li class=\"d-flex align-items-center\"><i class=\"bi bi-chat-dots\"></i> <a href=\"blog-details.html\">12 Comments</a></li>";
			tmp += "</ul>";
			tmp += "</div>";
			tmp += "";
			tmp += "<div class=\"content\">";
			tmp += "<p>";
			tmp += "" + item.getArticle_summary() + "";
			tmp += "</p>";
			tmp += "</div>";
			tmp += "";
			tmp += "<div class=\"read-more mt-auto align-self-end\">";
			tmp += "<a href=\"blog-details.html\">Read More <i class=\"bi bi-arrow-right\"></i></a>";
			tmp += "</div>";
			tmp += "";
			tmp += "</article>";
			tmp += "</div><!-- End post list item -->";
			tmp += "";

		}

		tmp += "</div><!-- End blog posts list -->";
		tmp += "";
		tmp += "<div class=\"blog-pagination\">";
		tmp += "<ul class=\"justify-content-center\">";
		tmp += "<li><a href=\"#\">1</a></li>";
		tmp += "<li class=\"active\"><a href=\"#\">2</a></li>";
		tmp += "<li><a href=\"#\">3</a></li>";
		tmp += "</ul>";
		tmp += "</div><!-- End blog pagination -->";
		tmp += "";
		tmp += "</div>";
		tmp += "";
		tmp += "<div class=\"col-lg-4\" data-aos=\"fade-up\" data-aos-delay=\"400\">";
		tmp += ArticleLibrary.sideBar();
		tmp += "";
		tmp += "";
		tmp += "";
		tmp += "</div>";
		tmp += "";
		tmp += "</div>";
		tmp += "";
		tmp += "</div>";
		tmp += "</section><!-- End Blog Section -->";

		return tmp;
	}

	private static String sideBar() {
		String tmp = "";

		tmp += "<div class=\"sidebar ps-lg-4\">";

		tmp += "<div class=\"sidebar-item categories\">";
		tmp += "<h3 class=\"sidebar-title\">Categories</h3>";
		tmp += "<ul class=\"mt-3\">";
		tmp += "<li><a href=\"#\">General <span>(25)</span></a></li>";
		tmp += "<li><a href=\"#\">Lifestyle <span>(12)</span></a></li>";
		tmp += "<li><a href=\"#\">Travel <span>(5)</span></a></li>";
		tmp += "<li><a href=\"#\">Design <span>(22)</span></a></li>";
		tmp += "<li><a href=\"#\">Creative <span>(8)</span></a></li>";
		tmp += "<li><a href=\"#\">Educaion <span>(14)</span></a></li>";
		tmp += "</ul>";
		tmp += "</div><!-- End sidebar categories-->";
		tmp += "";
		tmp += "<div class=\"sidebar-item recent-posts\">";
		tmp += "<h3 class=\"sidebar-title\">Recent Posts</h3>";
		tmp += "";
		tmp += "<div class=\"mt-3\">";
		tmp += "";
		tmp += "<div class=\"post-item mt-3\">";
		tmp += "<img src=\"/home/assets/img/blog/blog-recent-1.jpg\" alt=\"\" class=\"flex-shrink-0\">";
		tmp += "<div>";
		tmp += "<h4><a href=\"blog-post.html\">Nihil blanditiis at in nihil autem</a></h4>";
		tmp += "<time datetime=\"2020-01-01\">Jan 1, 2020</time>";
		tmp += "</div>";
		tmp += "</div><!-- End recent post item-->";
		tmp += "";
		tmp += "<div class=\"post-item\">";
		tmp += "<img src=\"/home/assets/img/blog/blog-recent-2.jpg\" alt=\"\" class=\"flex-shrink-0\">";
		tmp += "<div>";
		tmp += "<h4><a href=\"blog-post.html\">Quidem autem et impedit</a></h4>";
		tmp += "<time datetime=\"2020-01-01\">Jan 1, 2020</time>";
		tmp += "</div>";
		tmp += "</div><!-- End recent post item-->";
		tmp += "";
		tmp += "<div class=\"post-item\">";
		tmp += "<img src=\"/home/assets/img/blog/blog-recent-3.jpg\" alt=\"\" class=\"flex-shrink-0\">";
		tmp += "<div>";
		tmp += "<h4><a href=\"blog-post.html\">Id quia et et ut maxime similique occaecati ut</a></h4>";
		tmp += "<time datetime=\"2020-01-01\">Jan 1, 2020</time>";
		tmp += "</div>";
		tmp += "</div><!-- End recent post item-->";
		tmp += "";
		tmp += "<div class=\"post-item\">";
		tmp += "<img src=\"/home/assets/img/blog/blog-recent-4.jpg\" alt=\"\" class=\"flex-shrink-0\">";
		tmp += "<div>";
		tmp += "<h4><a href=\"blog-post.html\">Laborum corporis quo dara net para</a></h4>";
		tmp += "<time datetime=\"2020-01-01\">Jan 1, 2020</time>";
		tmp += "</div>";
		tmp += "</div><!-- End recent post item-->";
		tmp += "";
		tmp += "<div class=\"post-item\">";
		tmp += "<img src=\"/home/assets/img/blog/blog-recent-5.jpg\" alt=\"\" class=\"flex-shrink-0\">";
		tmp += "<div>";
		tmp += "<h4><a href=\"blog-post.html\">Et dolores corrupti quae illo quod dolor</a></h4>";
		tmp += "<time datetime=\"2020-01-01\">Jan 1, 2020</time>";
		tmp += "</div>";
		tmp += "</div><!-- End recent post item-->";
		tmp += "";
		tmp += "</div>";
		tmp += "";
		tmp += "</div><!-- End sidebar recent posts-->";
		tmp += "";
		tmp += "<div class=\"sidebar-item tags\">";
		tmp += "<h3 class=\"sidebar-title\">Tags</h3>";
		tmp += "<ul class=\"mt-3\">";
		tmp += "<li><a href=\"#\">App</a></li>";
		tmp += "<li><a href=\"#\">IT</a></li>";
		tmp += "<li><a href=\"#\">Business</a></li>";
		tmp += "<li><a href=\"#\">Mac</a></li>";
		tmp += "<li><a href=\"#\">Design</a></li>";
		tmp += "<li><a href=\"#\">Office</a></li>";
		tmp += "<li><a href=\"#\">Creative</a></li>";
		tmp += "<li><a href=\"#\">Studio</a></li>";
		tmp += "<li><a href=\"#\">Smart</a></li>";
		tmp += "<li><a href=\"#\">Tips</a></li>";
		tmp += "<li><a href=\"#\">Marketing</a></li>";
		tmp += "</ul>";
		tmp += "</div><!-- End sidebar tags-->";
		tmp += "";
		tmp += "</div><!-- End Blog Sidebar -->";

		return tmp;
	}

	public static String viewSubNewsV2(ArrayList<ArticleObject> items) {
		String tmp = "";

		tmp += "<!-- ======= Blog Section ======= -->";
		tmp += "<section id=\"blog\" class=\"blog\">";
		tmp += "<div class=\"container\" data-aos=\"fade-up\" data-aos-delay=\"100\">";

		tmp += "<div class=\"row gy-4 posts-list\">";
		for (ArticleObject item : items) {

			tmp += "<div class=\"col-xl-4 col-md-6\">";
			tmp += "<div class=\"post-item position-relative h-100\">";

			tmp += "<div class=\"post-img position-relative overflow-hidden\">";
			tmp += "<img src=\"" + item.getArticle_image() + "\" class=\"img-fluid\" alt=\"\">";
			tmp += "<span class=\"post-date\">" + item.getArticle_created_date() + "</span>";
			tmp += "</div>";

			tmp += "<div class=\"post-content d-flex flex-column\">";

			tmp += "<h3 class=\"post-title\">" + item.getArticle_title() + "</h3>";

			tmp += "<div class=\"meta d-flex align-items-center\">";
			tmp += "<div class=\"d-flex align-items-center\">";
			tmp += "<i class=\"bi bi-person\"></i> <span class=\"ps-2\">" + item.getArticle_author_name() + "</span>";
			tmp += "</div>";
			tmp += "<span class=\"px-3 text-black-50\">/</span>";
			tmp += "<div class=\"d-flex align-items-center\">";
			tmp += "<i class=\"bi bi-folder2\"></i> <span class=\"ps-2\">" + item.getCategory_name() + "</span>";
			tmp += "</div>";
			tmp += "</div>";

			tmp += "<p>";
			tmp += item.getArticle_summary();
			tmp += "</p>";

			tmp += "<hr>";

			tmp += "<a href=\"/home/news/?id=" + item.getArticle_id()
					+ "\" class=\"readmore stretched-link\"><span>Read More</span><i class=\"bi bi-arrow-right\"></i></a>";

			tmp += "</div>";

			tmp += "</div>";
			tmp += "</div><!-- End post list item -->";
		}

		tmp += "</div><!-- End blog posts list -->";

		tmp += "<div class=\"blog-pagination\">";
		tmp += "<ul class=\"justify-content-center\">";
		tmp += "<li><a href=\"#\">1</a></li>";
		tmp += "<li class=\"active\"><a href=\"#\">2</a></li>";
		tmp += "<li><a href=\"#\">3</a></li>";
		tmp += "</ul>";
		tmp += "</div><!-- End blog pagination -->";

		tmp += "</div>";
		tmp += "</section><!-- End Blog Section -->";

		return tmp;
	}

	/**
	 * Phương thức xem chi tiết bài viết
	 * 
	 * @param item
	 * @return
	 */
	public static String viewArticleDetail(ArticleObject item) {
		String tmp = "";

		tmp += "<!-- ======= Blog Details Section ======= -->";
		tmp += "<section id=\"blog\" class=\"blog\">";
		tmp += "<div class=\"container\" data-aos=\"fade-up\" data-aos-delay=\"100\">";
		tmp += "";
		tmp += "<div class=\"row g-5\">";
		tmp += "";
		tmp += "<div class=\"col-lg-8\">";
		tmp += "";

		tmp += "";
		tmp += "<article class=\"blog-details\">";
		tmp += "";
		tmp += "<div class=\"post-img\">";
		tmp += "<img src=\"" + item.getArticle_image() + "\" alt=\"\" class=\"img-fluid\">";
		tmp += "</div>";
		tmp += "";
		tmp += "<h2 class=\"title\">" + item.getArticle_title() + "</h2>";
		tmp += "";
		tmp += "<div class=\"meta-top\">";
		tmp += "<ul>";
		tmp += "<li class=\"d-flex align-items-center\"><i class=\"bi bi-person\"></i> <a href=\"#post_author\">"
				+ item.getArticle_author_name() + "</a></li>";
		tmp += "<li class=\"d-flex align-items-center\"><i class=\"bi bi-clock\"></i> <a href=\"blog-details.html\"><time datetime=\"2020-01-01\">Jan 1, 2022</time></a></li>";
		tmp += "<li class=\"d-flex align-items-center\"><i class=\"bi bi-chat-dots\"></i> <a href=\"blog-details.html\">12 Comments</a></li>";
		tmp += "</ul>";
		tmp += "</div><!-- End meta top -->";
		tmp += "";
		tmp += "<div class=\"content\">";
		tmp += "";
		tmp += "<blockquote>";
		tmp += "<p>";
		tmp += item.getArticle_summary();
		tmp += "</p>";
		tmp += "</blockquote>";

		tmp += "</div><!-- End post content -->";
		tmp += "";
		tmp += "<div class=\"meta-bottom\">";
		tmp += "<i class=\"bi bi-folder\"></i>";
		tmp += "<ul class=\"cats\">";
		tmp += "<li><a href=\"#\">" + item.getCategory_name() + "</a></li>";
		tmp += "</ul>";
		tmp += "";
		tmp += "<i class=\"bi bi-tags\"></i>";
		tmp += "<ul class=\"tags\">";
		tmp += "<li><a href=\"#\">" + item.getArticle_tag() + "</a></li>";

		tmp += "</ul>";
		tmp += "</div><!-- End meta bottom -->";
		tmp += "";
		tmp += "</article><!-- End blog post -->";
		tmp += "";
		tmp += "<div class=\"post-author d-flex align-items-center\" id=\"post_author\">";
		tmp += "<img src=\"assets/img/blog/blog-author.jpg\" class=\"rounded-circle flex-shrink-0\" alt=\"\">";
		tmp += "<div>";
		tmp += "<h4>" + item.getArticle_author_name() + "</h4>";
		tmp += "<div class=\"social-links\">";
		tmp += "<a href=\"https://twitters.com/#\"><i class=\"bi bi-twitter\"></i></a>";
		tmp += "<a href=\"https://facebook.com/#\"><i class=\"bi bi-facebook\"></i></a>";
		tmp += "<a href=\"https://instagram.com/#\"><i class=\"biu bi-instagram\"></i></a>";
		tmp += "</div>";
		tmp += "<p>";
		tmp += "Itaque quidem optio quia voluptatibus dolorem dolor. Modi eum sed possimus accusantium. Quas repellat voluptatem officia numquam sint aspernatur voluptas. Esse et accusantium ut unde voluptas.";
		tmp += "</p>";
		tmp += "</div>";
		tmp += "</div><!-- End post author -->";
		tmp += "";
		tmp += "";
		tmp += "";
		tmp += "</div>";
		tmp += "";
		tmp += "<div class=\"col-lg-4\">";
		tmp += "";
		tmp += "<div class=\"sidebar\">";
		tmp += "";
		tmp += "<div class=\"sidebar-item search-form\">";
		tmp += "<h3 class=\"sidebar-title\">Search</h3>";
		tmp += "<form action=\"\" class=\"mt-3\">";
		tmp += "<input type=\"text\">";
		tmp += "<button type=\"submit\"><i class=\"bi bi-search\"></i></button>";
		tmp += "</form>";
		tmp += "</div><!-- End sidebar search formn-->";
		tmp += "";
		tmp += "<div class=\"sidebar-item categories\">";
		tmp += "<h3 class=\"sidebar-title\">Categories</h3>";
		tmp += "<ul class=\"mt-3\">";
		tmp += "<li><a href=\"#\">General <span>(25)</span></a></li>";
		tmp += "<li><a href=\"#\">Lifestyle <span>(12)</span></a></li>";
		tmp += "<li><a href=\"#\">Travel <span>(5)</span></a></li>";
		tmp += "<li><a href=\"#\">Design <span>(22)</span></a></li>";
		tmp += "<li><a href=\"#\">Creative <span>(8)</span></a></li>";
		tmp += "<li><a href=\"#\">Educaion <span>(14)</span></a></li>";
		tmp += "</ul>";
		tmp += "</div><!-- End sidebar categories-->";
		tmp += "";
		tmp += "<div class=\"sidebar-item recent-posts\">";
		tmp += "<h3 class=\"sidebar-title\">Recent Posts</h3>";
		tmp += "";
		tmp += "<div class=\"mt-3\">";
		tmp += "";
		tmp += "<div class=\"post-item mt-3\">";
		tmp += "<img src=\"assets/img/blog/blog-recent-1.jpg\" alt=\"\">";
		tmp += "<div>";
		tmp += "<h4><a href=\"blog-details.html\">Nihil blanditiis at in nihil autem</a></h4>";
		tmp += "<time datetime=\"2020-01-01\">Jan 1, 2020</time>";
		tmp += "</div>";
		tmp += "</div><!-- End recent post item-->";
		tmp += "";
		tmp += "<div class=\"post-item\">";
		tmp += "<img src=\"assets/img/blog/blog-recent-2.jpg\" alt=\"\">";
		tmp += "<div>";
		tmp += "<h4><a href=\"blog-details.html\">Quidem autem et impedit</a></h4>";
		tmp += "<time datetime=\"2020-01-01\">Jan 1, 2020</time>";
		tmp += "</div>";
		tmp += "</div><!-- End recent post item-->";
		tmp += "";
		tmp += "<div class=\"post-item\">";
		tmp += "<img src=\"assets/img/blog/blog-recent-3.jpg\" alt=\"\">";
		tmp += "<div>";
		tmp += "<h4><a href=\"blog-details.html\">Id quia et et ut maxime similique occaecati ut</a></h4>";
		tmp += "<time datetime=\"2020-01-01\">Jan 1, 2020</time>";
		tmp += "</div>";
		tmp += "</div><!-- End recent post item-->";
		tmp += "";
		tmp += "<div class=\"post-item\">";
		tmp += "<img src=\"assets/img/blog/blog-recent-4.jpg\" alt=\"\">";
		tmp += "<div>";
		tmp += "<h4><a href=\"blog-details.html\">Laborum corporis quo dara net para</a></h4>";
		tmp += "<time datetime=\"2020-01-01\">Jan 1, 2020</time>";
		tmp += "</div>";
		tmp += "</div><!-- End recent post item-->";
		tmp += "";
		tmp += "<div class=\"post-item\">";
		tmp += "<img src=\"assets/img/blog/blog-recent-5.jpg\" alt=\"\">";
		tmp += "<div>";
		tmp += "<h4><a href=\"blog-details.html\">Et dolores corrupti quae illo quod dolor</a></h4>";
		tmp += "<time datetime=\"2020-01-01\">Jan 1, 2020</time>";
		tmp += "</div>";
		tmp += "</div><!-- End recent post item-->";
		tmp += "";
		tmp += "</div>";
		tmp += "";
		tmp += "</div><!-- End sidebar recent posts-->";
		tmp += "";
		tmp += "<div class=\"sidebar-item tags\">";
		tmp += "<h3 class=\"sidebar-title\">Tags</h3>";
		tmp += "<ul class=\"mt-3\">";
		tmp += "<li><a href=\"#\">App</a></li>";
		tmp += "<li><a href=\"#\">IT</a></li>";
		tmp += "<li><a href=\"#\">Business</a></li>";
		tmp += "<li><a href=\"#\">Mac</a></li>";
		tmp += "<li><a href=\"#\">Design</a></li>";
		tmp += "<li><a href=\"#\">Office</a></li>";
		tmp += "<li><a href=\"#\">Creative</a></li>";
		tmp += "<li><a href=\"#\">Studio</a></li>";
		tmp += "<li><a href=\"#\">Smart</a></li>";
		tmp += "<li><a href=\"#\">Tips</a></li>";
		tmp += "<li><a href=\"#\">Marketing</a></li>";
		tmp += "</ul>";
		tmp += "</div><!-- End sidebar tags-->";
		tmp += "";
		tmp += "</div><!-- End Blog Sidebar -->";
		tmp += "";

		tmp += "</div>";
		tmp += "</div>";

		return tmp;
	}

}
