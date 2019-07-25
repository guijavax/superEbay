package com.api.superbay.security;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class TokenAuthenticationService {

	private static final Logger LOGGER = Logger.getLogger(TokenAuthenticationService.class);
	
	private static final long EXPIRATION_TIME = 864000000 + System.currentTimeMillis();;
    private static final String SECRET = "MySecreteApp";
    private static final String TOKEN_PREFIX = "Bearer";
    private static final String HEADER_STRING = "Authorization";
    
    public static void addAuthentication(HttpServletResponse res , String userName) {
    	String jwt = Jwts.builder()
    	.setSubject(userName)
    	.setExpiration(new Date(EXPIRATION_TIME))
    	.signWith(SignatureAlgorithm.HS512, SECRET)
    	.compact();
    	
    	String token = TOKEN_PREFIX + " " + jwt;
    	res.addHeader(HEADER_STRING, token);
    	try {
    		res.getOutputStream().print(token);
    	} catch(IOException e) {
    		LOGGER.error(e.getMessage());
    	}
    }
    
    public static Authentication getAuthentication(HttpServletRequest req) {
    	return req.getHeader(HEADER_STRING) != null ? getByToken(req.getHeader(HEADER_STRING)) : null;
    }
    
    private static Authentication getByToken(String token) {
    	String user = Jwts.parser()
    			.setSigningKey(SECRET)
    			.parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
    			.getBody()
    			.getSubject();
    	return user != null ? new UsernamePasswordAuthenticationToken(user, null, null) : null;
    }
}
