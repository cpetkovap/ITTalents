package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class CreateJSON
 */
@WebServlet("/CreateJSON")
public class CreateJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1 = "sss";
		String s2 = "aaa";
		JSONObject obj = new JSONObject();
		obj.put("name", s1);
		obj.put("pass", s2);
		JSONObject obj2 = new JSONObject();
		obj2.put("name", "llll");
		obj2.put("pass", "zzzz");
		//System.out.println(obj.toJSONString());
		JSONArray arr = new JSONArray();
		arr.add(obj);
		arr.add(obj2);
		//System.out.println(arr.toJSONString());
		JSONObject obj3 = new JSONObject();
		obj3.put("name", "Tsvety");
		obj3.put("friend", arr);
		System.out.println(obj3.toJSONString());
	}

}
