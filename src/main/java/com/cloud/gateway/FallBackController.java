package com.cloud.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallBackController {

    @RequestMapping("/orderFallback")
    public Mono<String> orderServiceFallback() {
        return Mono.just("Order service is taking too long to respond or its down.Please try again later");
    }

    @RequestMapping("/paymentFallback")
    public Mono<String> paymentServiceFallback() {
        return Mono.just("Payment service is taking too long to respond or its down.Please try again later");
    }

    @RequestMapping("/bookingFallback")
    public Mono<String> bookingServiceFallback() {
        return Mono.just("Booking service is taking too long to respond or its down.Please try again later");
    }

}
