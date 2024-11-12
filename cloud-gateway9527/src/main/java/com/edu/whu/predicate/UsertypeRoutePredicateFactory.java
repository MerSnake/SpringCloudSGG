package com.edu.whu.predicate;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.server.ServerWebExchange;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author yqx
 * @date 2024-10-31 10:45:10
 */
@Component
public class UsertypeRoutePredicateFactory extends AbstractRoutePredicateFactory<UsertypeRoutePredicateFactory.Config> {

    private static final String KEY = "usertype";

    public UsertypeRoutePredicateFactory() {
        super(UsertypeRoutePredicateFactory.Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Collections.singletonList(KEY);
    }

    @Override
    public Predicate<ServerWebExchange> apply(Config config) {
        return serverWebExchange -> {
            String userType = serverWebExchange.getRequest().getQueryParams().getFirst(KEY);
            if (userType == null) return false;
            if (userType.equalsIgnoreCase(config.getUsertype())) return true;
            return false;
        };
    }

    @Validated
    public static class Config{
        @Setter
        @Getter
        @NotEmpty
        private String usertype; //钻、金、银等用户等级
    }
}
