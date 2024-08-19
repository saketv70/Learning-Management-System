package com.lms.query.controller;


import com.lms.query.dto.QueryDto;
import com.lms.query.dto.ResponseDto;
import com.lms.query.service.IQueryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class QueryController {
    private IQueryService iQueryService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createQ(@RequestBody QueryDto queryDto) {
        iQueryService.createQuery(queryDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ResponseDto("Successfully Created", HttpStatus.CREATED));
    }

    @GetMapping("/fetch")
    public ResponseEntity<QueryDto> fetchQueryDetails(@RequestParam Integer queryId)
    {
        QueryDto queryDto= iQueryService.fetchQuery(queryId);
        return ResponseEntity.status(HttpStatus.OK)
                .body(queryDto);
    }
    @PutMapping("/update")
    public ResponseEntity<ResponseDto> updateDetails(@RequestBody QueryDto queryDto) {
        boolean isUpdated = iQueryService.updateQuery(queryDto);
        if (isUpdated) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseDto("Updated successfully", HttpStatus.ACCEPTED));
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ResponseDto("Unable to update", HttpStatus.BAD_REQUEST));
        }
    }
    @DeleteMapping("/delete")
    public ResponseEntity<ResponseDto> deleteAccounts(@RequestParam Integer queryId){
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
