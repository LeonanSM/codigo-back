package com.sistema.core.security;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class JWTController {

	@GetMapping("/jwt")
	public String jwtTest(@RequestParam String username) {

		String JWT = Jwts.builder().setSubject(username).setExpiration(new Date(System.currentTimeMillis() + 3000000))
				.signWith(SignatureAlgorithm.HS512, "aljazira").compact();

		return JWT;
	}

}
