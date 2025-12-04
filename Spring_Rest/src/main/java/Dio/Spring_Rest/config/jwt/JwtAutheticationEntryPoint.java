package Dio.Spring_Rest.config.jwt;

import java.io.IOException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;

import org.springframework.stereotype.Component;

@Component
public class JwtAutheticationEntryPoint {
    private static final long serialVersionUID = -8651187579837792070L;

	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException {

		response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
	}
}
