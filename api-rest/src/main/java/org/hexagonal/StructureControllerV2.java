package org.hexagonal;

import lombok.AllArgsConstructor;
import org.hexagonal.openapi.api.Example2Api;
import org.hexagonal.openapi.api.ExampleApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StructureControllerV2 implements Example2Api {

    @Override
    public ResponseEntity<Void> getVersionDetailsv2() {
        return Example2Api.super.getVersionDetailsv2();
    }
}
