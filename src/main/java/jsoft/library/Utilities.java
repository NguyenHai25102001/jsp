package jsoft.library;

import net.htmlparser.jericho.*;
import javax.servlet.*;
public class Utilities {
	/**
	 * phương thức lấy ra thông tin tên tác giả hoặc tên người quản lí đc nối thêm vào mô tả chi tiết
	 * phương thức này được dùng trong sectionLibrary, CategoryLibrary
	 * 
	 * 23/10/2022
	 * 
	 * @param notes
	 * @param index
	 * @return
	 */
	public static String getInfo(String notes, byte index) {
		String tmp = "";
		if(notes != null && !notes.equalsIgnoreCase("")) {
			String[] note_name = notes.split("@@@"); // maảng chỉ có 2 phần tử note và name: note chỉ só là 0 name chỉ số là 1
			
			if(note_name != null && note_name.length > 0 && index < note_name.length) {
				tmp = note_name[index];
			}
		}
		
		return tmp;
	}
	
	
	public static String encodeToHtml(String uni) {
		return CharacterReference.encode(uni);
	}
	
	public static String decodeFormHtml(String html) {
		return CharacterReference.decode(html);
	}
	
	/**
	 * Phương thức lấy ra giá trị của tham số trên URL<br>
	 * 
	 * @param request
	 * @param name
	 * @return
	 */
	public static int getIntParam(ServletRequest request, String name) {
		int value = 0;
		
		String strValue = request.getParameter(name);
		if(strValue != null && !strValue.equalsIgnoreCase("")) {
			value = Integer.parseInt(strValue);
		}
		
		
		return value;
	}
	
	
	public static byte getByteParam(ServletRequest request, String name) {
		byte value = 0;
		
		String strValue = request.getParameter(name);
		if(strValue != null && !strValue.equalsIgnoreCase("")) {
			value = Byte.parseByte(strValue);
		}
		
		
		return value;
	}
	
	
	
}
