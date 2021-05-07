package com.servletdata.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet매소드 호출");
		request.setCharacterEncoding("utf-8");//모든 요청을 처리할때 설정을 함.
		//기본적인 클라이언트가 보낸 데이터 가져오기
		//클라이언트가 전송한 데이터는 parameter라고 함.
		//클라이언트가 전송한 데이터는 HttpServletRequest객체에 저장이 됨
		//저장된 파라미터값은 getParameter()매소드를 이용해서 가져옴.
		//request.getParameter("key(input태그 name속성의 값)")
		//getParameter()매소드의 반환형 String -> 클라이언트가 보낸 값을 무조건 String반환됨.
		// 전송 data를 파싱처리해야함.
		String userId=request.getParameter("userId");
		String pw=request.getParameter("password");
		System.out.println("userId : "+userId+" pw : "+pw);
	
		//응답페이지 구성하기 -> 문자열(코드, 데이터)을 스트림으로 보냄
		//응답하는 내용에 대한 형식을 알려주기 -> setContentType()매소드이용(MIME type설정)/인코딩도 설정
		response.setContentType("text/html;charset=utf-8");
		//응답을 위한 스트림을 가져옴 -> getWriter()/getOutputStream();
		PrintWriter out=response.getWriter();
		String html="<html>";
		html+="<body>";
		html+="<h1>당신이 입력한 아이디는 "+userId+" 비밀번호는 "+pw+"</h1>";
		html+="</body>";
		html+="</html>";
		out.write(html);		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost매소드 호출");
		doGet(request, response);
//		request.setCharacterEncoding("utf-8");
//		String userId=request.getParameter("userId");
//		String password=request.getParameter("password");
//		System.out.println(userId+" "+password);		
		
	}

}
