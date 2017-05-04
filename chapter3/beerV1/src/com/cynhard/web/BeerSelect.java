package com.cynhard.web;

import com.cynhard.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class BeerSelect extends HttpServlet {
    public void doPost(HttpServletRequest request, 
            HttpServletResponse response) 
            throws IOException, ServletException {
                
        String c = request.getParameter("color");
        // ʵ����BeerExpert�࣬����getBrands()
        BeerExpert be = new BeerExpert();  
        List result = be.getBrands(c);
        
        // Ϊ�����������һ�����ԣ���JSPʹ�á�
        request.setAttribute("styles",  result);
        // ΪJSPʵ����һ�������������
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        // ʹ�����������Ҫ������׼����JSP������JSP�����������Ӧ��
        view.forward(request, response);
    }
}