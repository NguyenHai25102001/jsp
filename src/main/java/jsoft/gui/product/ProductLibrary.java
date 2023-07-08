package jsoft.gui.product;

import java.util.ArrayList;

import jsoft.objects.ProductObject;
import jsoft.library.*;

public class ProductLibrary {
	public static String viewProducts(ArrayList<ProductObject> items) {
		String tmp="";
		int count=0;
		for (ProductObject item : items) {
			
			tmp+="<div class=\"col-md-3 my-2\">";
			
			
			
			tmp+="<div class=\"card p-3\">";
			
			tmp+="<div class=\"text-center\">";
			
			tmp+="<img src=\""+item.getProduct_image()+"\" width=\"200\">";
			
			tmp+="</div>";
			
			tmp+="<div class=\"product-details\">";
			
			
			tmp+="<span class=\"font-weight-bold d-block\">$ 7.00</span> <span>"+Utilities.decodeFormHtml(item.getProduct_name())+"</span>";
			
			
			
			tmp+="<div class=\"buttons d-flex flex-row\">";
			tmp+="<div class=\"cart\">";
			tmp+="<i class=\"fa fa-shopping-cart\"></i>";
			tmp+="</div>";
			tmp+="<button class=\"btn btn-success cart-button btn-block\">";
			tmp+="<span class=\"dot\">1</span>Add to cart";
			tmp+="</button>";
			tmp+="</div>";
			
			tmp+="<div class=\"weight\">";
			
			tmp+="<small>1 piece 2.5kg</small>";
			
			tmp+="</div>";
			
			tmp+="</div>";
			
			
			
			tmp+="</div>";
			
			
			tmp+="</div>";
				
			
			
		}
		
		return tmp;
		
	}

}
