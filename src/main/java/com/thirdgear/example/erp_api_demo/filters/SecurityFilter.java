package com.thirdgear.example.erp_api_demo.filters;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.thirdgear.example.erp_api_demo.service.SecurityService;
import com.thirdgear.example.erp_api_demo.constants.SecurityConstants;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

class SecurityFilter extends HttpFilter {

	@Autowired 
	SecurityService securityService;
	
	@Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {

        String authToken = request.getHeader(SecurityConstants.AUTH_TOKEN_HEADER);

        if (!securityService.isTokenValid(authToken)) {  // (2)
            // either no or wrong username/password
            // unfortunately the HTTP status code is called "unauthorized", instead of "unauthenticated"
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED); // HTTP 401.
            return;
        }

        // allow the HttpRequest to go to Spring's DispatcherServlet
        // and @RestControllers/@Controllers.
        chain.doFilter(request, response); // (4)
    }
	
}