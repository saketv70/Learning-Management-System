package com.lms.courses.service;

import com.lms.courses.dto.CourseRequestDto;

public interface ICourseService {
    CourseRequestDto createCourse(CourseRequestDto coursesDto);

    CourseRequestDto getCourseById(Long id);

    CourseRequestDto updateCourse(CourseRequestDto courseRequestDto, Long id);

    Boolean deleteCourse(Long id);
}
