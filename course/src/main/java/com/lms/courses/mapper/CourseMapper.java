package com.lms.courses.mapper;

import com.lms.courses.dto.CourseRequestDto;
import com.lms.courses.entity.Course;

public class CourseMapper {

    public static Course mapToCourse(CourseRequestDto courseRequestDto, Course course) {
        course.setTitle(courseRequestDto.getTitle());
        course.setCategory(courseRequestDto.getCategory());
        course.setDuration(courseRequestDto.getDuration());
        course.setUploaded_by(courseRequestDto.getUploaded_by());
        course.setIs_approved(courseRequestDto.getIs_approved());
        return course;
    }

    public static CourseRequestDto mapToCourseRequestDto(Course course, CourseRequestDto courseRequestDto) {
        courseRequestDto.setTitle(course.getTitle());
        courseRequestDto.setCategory(course.getCategory());
        courseRequestDto.setDuration(course.getDuration());
        courseRequestDto.setUploaded_by(course.getUploaded_by());
        courseRequestDto.setIs_approved(course.getIs_approved());
        return courseRequestDto;
    }

}
