package org.hexagonal;

import lombok.AllArgsConstructor;
import org.hexagonal.openapi.api.FixedTablesChangeListApi;
import org.hexagonal.openapi.model.FixedTablesChangeListAddRq;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StructureController implements FixedTablesChangeListApi {

    @Override
    public ResponseEntity<Void> addChangeToChangeList(String changeListId, String jobId, FixedTablesChangeListAddRq fixedTablesChangeListAddRq) {
        return FixedTablesChangeListApi.super.addChangeToChangeList(changeListId, jobId, fixedTablesChangeListAddRq);
    }
}
