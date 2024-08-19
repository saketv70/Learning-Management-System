package com.lms.courses.controller;

import com.lms.courses.dto.CourseRequestDto;
import com.lms.courses.dto.ResponseDto;
import com.lms.courses.service.ICourseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/courses")
public class CourseController {
    private ICourseService iCourseService;

    @PostMapping()
    public ResponseEntity<CourseRequestDto> createCourse(@RequestBody CourseRequestDto coursesDto){
        CourseRequestDto response = iCourseService.createCourse(coursesDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(response);
    }

    @GetMapping("/{courseId}")
    public ResponseEntity<CourseRequestDto> getCourseByID(@PathVariable Long courseId){
        CourseRequestDto response = iCourseService.getCourseById(courseId);
        return ResponseEntity.status(HttpStatus.OK)
                .body(response);
    }

    @PutMapping("/{courseId}")
    public ResponseEntity<CourseRequestDto> updateCourse(@RequestBody CourseRequestDto courseRequestDto, @PathVariable Long courseId){
        CourseRequestDto response = iCourseService.updateCourse(courseRequestDto, courseId);
        return  ResponseEntity.status(HttpStatus.OK)
                .body(response);
    }

    @DeleteMapping("/{courseId}")
    public ResponseEntity<ResponseDto> deleteCourse(@PathVariable Long courseId){
        Boolean isDeleted = iCourseService.deleteCourse(courseId);
        if(isDeleted != null){
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseDto("Deleted Successfully", HttpStatus.OK));
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ResponseDto("Deleted Successfully", HttpStatus.BAD_REQUEST));
        }
    }
}
