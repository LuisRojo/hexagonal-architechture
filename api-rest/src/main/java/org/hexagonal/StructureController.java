package org.hexagonal;

import lombok.AllArgsConstructor;
import org.hexagonal.openapi.api.Example2Api;
import org.hexagonal.openapi.api.ExampleApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StructureController implements ExampleApi {

    @Override
    public ResponseEntity<Void> listVersionsv2() {
        return ExampleApi.super.listVersionsv2();
    }
}
