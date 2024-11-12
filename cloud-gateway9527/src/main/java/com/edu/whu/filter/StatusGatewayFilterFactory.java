package com.edu.whu.filter;

import lombok.Getter;
import lombok.Setter;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yqx
 * @date 2024-11-01 14:44:30
 */
@Component
public class StatusGatewayFilterFactory extends AbstractGatewayFilterFactory<StatusGatewayFilterFactory.Config> {

    private static final String KEY = "status";

    public StatusGatewayFilterFactory() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            String status = exchange.getRequest().getQueryParams().getFirst(KEY);
            System.out.println("进入自定义网关过滤器MyGatewayFilterFactory，status===="+config.getStatus());
            if (status != null && status.equalsIgnoreCase(config.getStatus())) {
                return chain.filter(exchange);
            } else {
                exchange.getResponse().setStatusCode(HttpStatus.BAD_REQUEST);
                return exchange.getResponse().setComplete();
            }
        };
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return List.of(KEY);
    }

    public static class Config {

        @Setter
        @Getter
        String status;
    }
}
