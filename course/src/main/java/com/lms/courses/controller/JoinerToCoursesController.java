package com.lms.courses.controller;

import com.lms.courses.dto.JoinerToCoursesDto;
import com.lms.courses.dto.ResponseDto;
import com.lms.courses.service.IJoinerToCourses;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/joinerToCourses")
public class JoinerToCoursesController {
    private IJoinerToCourses iJoinerToCourses;

    @PostMapping("")
    public ResponseEntity<JoinerToCoursesDto> createJoinerToCourse(@RequestBody JoinerToCoursesDto joinerToCoursesDto) {
        JoinerToCoursesDto response = iJoinerToCourses.createJoinerToCourse(joinerToCoursesDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    @GetMapping("/{joinerId}/{courseId}")
    public ResponseEntity<JoinerToCoursesDto> getAssignedCourse(@PathVariable Long joinerId, @PathVariable Long courseId) {
        JoinerToCoursesDto response = iJoinerToCourses.getAssignedCourse(joinerId, courseId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(response);
    }

    @PutMapping("/{joinerId}/{courseId}")
    public ResponseEntity<JoinerToCoursesDto> updateAssignedCourse(@RequestBody JoinerToCoursesDto joinerToCoursesDto, @PathVariable Long joinerId, @PathVariable Long courseId){
        JoinerToCoursesDto response = iJoinerToCourses.updateJoinerToCourse(joinerToCoursesDto, joinerId, courseId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(response);
    }
}
