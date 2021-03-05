package com.sanyau.repair.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;

/**
 * @author helen
 * @since 2019/10/16
 */
public class JwtUtils {

    public static final long EXPIRE = 1000 * 60 * 60 * 24; //设置token过期时间
    public static final String APP_SECRET = "e358.*4&70~-b@56%268fb44!65129a4f"; // 加密的密钥

    /* 生成token字符串的方法 */
    public static String getJwtToken(String id, String role){

        /* 构建方法 */
        String JwtToken = Jwts.builder()
                /* 设置jwt的头部信息 */
                .setHeaderParam("typ", "JWT")
                .setHeaderParam("alg", "HS256")

                /* 设置token字符串的过期时间 */
                .setSubject("zone-user")
                .setIssuedAt(new Date()) //得到当前时间
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE))

                /* 设置token的主题部分，储存用户信息 */
                .claim("id", id)
                .claim("role", role)
                /* 签名hash */
                .signWith(SignatureAlgorithm.HS256, APP_SECRET)
                .compact();

        return JwtToken;
    }

    /**
     * 判断token是否存在与有效
     * @param jwtToken
     * @return
     */
    public static boolean checkToken(String jwtToken) {
        if(StringUtils.isEmpty(jwtToken)) return false;
        try {
            Jwts.parser().setSigningKey(APP_SECRET).parseClaimsJws(jwtToken);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 判断token是否存在与有效
     * @param request
     * @return
     */
    public static boolean checkToken(HttpServletRequest request) {
        try {
            String jwtToken = request.getHeader("token");
            if(StringUtils.isEmpty(jwtToken)) return false;
            Jwts.parser().setSigningKey(APP_SECRET).parseClaimsJws(jwtToken);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 根据token获取id和role
     * @param request
     * @return
     */
    public static HashMap<String,String> getMapByJwtToken(HttpServletRequest request) throws Exception {
        String jwtToken = request.getHeader("token");
        if(StringUtils.isEmpty(jwtToken)) throw new Exception("token值为空");
        Jws<Claims> claimsJws = Jwts.parser().setSigningKey(APP_SECRET).parseClaimsJws(jwtToken);
        Claims claims = claimsJws.getBody();
        HashMap<String, String> map = new HashMap<>();
        map.put("id",(String)claims.get("id"));
        map.put("role",(String)claims.get("role"));
        return map;
    }
}
