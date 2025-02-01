package com.pawan.controller;

import com.pawan.dto.ProductRequest;
import com.pawan.dto.StripeResponse;
import com.pawan.service.StripeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product/v1")
public class ProductCheckOutController {

    private StripeService stripeService;

    public ProductCheckOutController(StripeService stripeService) {
        this.stripeService = stripeService;
    }

    @PostMapping("/checkout")
    public ResponseEntity<StripeResponse> checkOutProduct(@RequestBody ProductRequest productRequest){

        /*StripeResponse stripeResponse = stripeService.checkoutProducts(productRequest);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(stripeResponse);*/

        return ResponseEntity.ok(stripeService.checkoutProducts(productRequest));
    }
}
