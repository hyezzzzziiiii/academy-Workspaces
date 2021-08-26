package com.upload.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/upload.do")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// 웹브라우져에 직접 내용을 써넣기 위한 ContentType 타입 설정
		response.setContentType("text/html; charset=UTF-8");
		// jsp 파일을 만들어두고 foward 하는게 아니라 서블릿에서 직접 브라우져에 내용을 써넣습니다
		
		// 브라우저에 쓰기를 위한 객체를 생성
		PrintWriter out = response.getWriter();
		
		// 파일이 업로드 될 타겟 폴더 이름 설정
		String savePath = "fileUpload";
		
		// 업로드 되는 파일의 최대 용량을 제한가히 위한 설정
		int uploadFileSizeLimit = 5 * 1024 *1024;  // 5메가 바이트로 제한
		
		// 한글 인코딩 방법 설정
		String encType = "UTF-8";
		
		// 서버상의 실제로 파일이 저장되는 디렉토리 설정
		ServletContext context = getServletContext();  
		String uploadFilePath = context.getRealPath(savePath);
		System.out.println(uploadFilePath);
		try {
			MultipartRequest multi = new MultipartRequest(
					request,   // 현재의 request 객체 : 한페이지에 두개의 리퀘스트가 존재하게 하지 
					// 않기 위해 MultipartRequest 안에  request 객체를 담아서 사용합니다
					uploadFilePath,  // 서버상의 실제 디렉토리
					uploadFileSizeLimit,  //최대 업로드 파일 크기
					encType,  // 인코딩 방법
					new DefaultFileRenamePolicy()
					// 업로드 파일과 동일 이름이 이미 존재하면 새이름 부여
					);
			// 위 명령에서 MultipartRequest 객체가 만들어지는 순간 파일은 먼저 업로드 됩니다.
			
			// jsp 파일의 form 에서 전달된 파일의 이름 및 그 외 항목들을 파라미터로 추출
			String fileName = multi.getFilesystemName("uploadFile"); 
			String name = multi.getParameter("name");
			String title = multi.getParameter("title");
			out.println("<br> 글쓴이 : " + name);
			out.println("<br> 제목 : " + title);
			out.println("<br> 파일명 : " + fileName);
		}catch(Exception e) { 
			System.out.print("파일 업로드 되지 않았음 : " + e); 
		}
		
	}

}
