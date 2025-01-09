package com.example.employee_service.util.Config;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import io.micrometer.tracing.Tracer;
import io.micrometer.tracing.propagation.Propagator;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder, Tracer tracer, Propagator propagator) {
        return builder
                .additionalInterceptors((request, body, execution) -> {
                    // Propagate trace headers
                    propagator.inject(tracer.currentSpan().context(), request.getHeaders(), (headers, key, value) -> headers.add(key, value));
                    return execution.execute(request, body);
                })
                .build();
    }
}
