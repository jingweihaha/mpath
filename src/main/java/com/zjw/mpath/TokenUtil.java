package com.zjw.mpath;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.stream.Collectors;

/**
 * @author jingw
 * @created 11/3/2021 11:28 PM
 * @project mpath
 */
@Component
public class TokenUtil {

    @Value("${token.signature}")
    private String signature;

    @Value("${token.authKey}")
    private String authKey;

    @Value("${token.expiration}")
    private Long expiration;
    
    public String generateJWToken(Authentication authentication){
        String authorities = authentication.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(","));

        return Jwts.builder()
                .setSubject(authentication.getName())
                .claim(authKey, authorities)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expiration*1000))
                .signWith(SignatureAlgorithm.HS256, signature)
                .compact();
    }

    public Boolean isTokenExpired(String token){
        Date expiration = Jwts.parser()
                .setSigningKey(signature)
                .parseClaimsJws(token)
                .getBody().getExpiration();
        return expiration.before(new Date());
    }

    public String getUsernameFromToken(String token){
        String username = Jwts.parser().setSigningKey(signature)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
        return username;
    }

    public Boolean validateToken(String token, UserDetails userDetails){
        return getUsernameFromToken(token).equals(userDetails.getUsername()) && !isTokenExpired(token);
    }

}
