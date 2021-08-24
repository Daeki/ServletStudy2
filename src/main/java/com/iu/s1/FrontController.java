package com.iu.s1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iu.s1.bankbook.BankBookController;
import com.iu.s1.member.MemberController;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private MemberController memberController;
	private BankBookController bankBookController;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
        memberController = new MemberController();
        bankBookController = new BankBookController();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Front Controller 실행");
		String uri = request.getRequestURI();
		//String url = request.getRequestURL().toString();
		System.out.println("uri : "+uri);
		//System.out.println("uri : "+url);
		
		String path="";
		//subString
	
		System.out.println(request.getContextPath());
		int startIndex = request.getContextPath().length();
		int lastIndex = uri.lastIndexOf("/");
		path = uri.substring(startIndex, lastIndex);
		System.out.println(path);
		if(path.equals("/member")) {
			memberController.start(request);
		}else if(path.equals("/bankbook")) {
			bankBookController.start(request, response);
		}else {
			System.out.println("없는 URL");
		}
		
		System.out.println("path : "+path);//bankbook, member
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
