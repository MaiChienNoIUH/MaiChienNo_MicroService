package vn.edu.iuh.fit.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Configuration class named {@link GatewayConfig} for setting up API Gateway routes.
 */
@Configuration
public class GatewayConfig {

    // Define the list of public endpoints
    private static final List<String> PUBLIC_ENDPOINTS = List.of(
            "/api/v1/auth/register",
            "/api/v1/auth/login",
            "/api/v1/user/info",
            "/api/v1/user/find-id-by-phone-number/**"

    );


    /**
     * Configures the route locator to define the routing rules for the gateway.
     *
     * @param builder The RouteLocatorBuilder used to build the RouteLocator.
     * @return A RouteLocator with the defined routes.
     */
    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {

        return builder.routes()
                .route("CustomerService", r -> r.path("/customers/**")
                        .uri("lb://CustomerService"))
                .route("OrderService", r -> r.path("/orders/**")
                        .uri("lb://OrderService"))
                .route("ProductService", r -> r.path("/products/**")
                        .uri("lb://ProductService"))
                .build();
    }
}