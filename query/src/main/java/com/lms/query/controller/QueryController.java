package com.lms.query.controller;


import com.lms.query.dto.QueryDto;
import com.lms.query.dto.ResponseDto;
import com.lms.query.service.IQueryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/queries")
@AllArgsConstructor
public class QueryController {
    private IQueryService iQueryService;

    @PostMapping("")
    public ResponseEntity<ResponseDto> createQ(@RequestBody QueryDto queryDto) {
        iQueryService.createQuery(queryDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ResponseDto("Successfully Created", HttpStatus.CREATED));
    }

    @GetMapping("/{queryId}")
    public ResponseEntity<QueryDto> fetchQueryDetails(@PathVariable Long queryId)
    {
        QueryDto queryDto= iQueryService.fetchQuery(queryId);
        return ResponseEntity.status(HttpStatus.OK)
                .body(queryDto);
    }

    @PutMapping("/{queryId}")
    public ResponseEntity<ResponseDto> updateDetails(@PathVariable Long queryId, @RequestBody QueryDto queryDto) {
        boolean isUpdated = iQueryService.updateQuery(queryId, queryDto);
        if (isUpdated) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseDto("Updated successfully", HttpStatus.ACCEPTED));
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ResponseDto("Unable to update", HttpStatus.BAD_REQUEST));
        }
    }

    @DeleteMapping("/{queryId}")
    public ResponseEntity<ResponseDto> deleteAccounts(@PathVariable Long queryId){
        boolean isDeleted = iQueryService.deleteQuery(queryId);
        if (isDeleted) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseDto("Deleted successfully", HttpStatus.OK));
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ResponseDto("Unable to delete", HttpStatus.BAD_REQUEST));
        }
    }

    @GetMapping("/test")
    public String test(){
        return "Hello Test";
    }
}
