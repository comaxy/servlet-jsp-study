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
        // 实例化BeerExpert类，调用getBrands()
        BeerExpert be = new BeerExpert();  
        List result = be.getBrands(c);
        
        // 为请求对象增加一个属性，供JSP使用。
        request.setAttribute("styles",  result);
        // 为JSP实例化一个请求分派器。
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        // 使用请求分派器要求容器准备好JSP，并向JSP发送请求和响应。
        view.forward(request, response);
    }
}