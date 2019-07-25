package com.api.superbay.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.servlet4preview.GenericFilter;
import org.springframework.security.core.context.SecurityContextHolder;

public class AuthenticationFilter extends GenericFilter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		SecurityContextHolder.getContext().setAuthentication(TokenAuthenticationService.getAuthentication((HttpServletRequest) request));
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {}

}
