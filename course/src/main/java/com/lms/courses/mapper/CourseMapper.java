package com.lms.courses.mapper;

import com.lms.courses.dto.CourseRequestDto;
import com.lms.courses.dto.JoinerToCoursesDto;
import com.lms.courses.entity.Course;
import com.lms.courses.entity.JoinerToCourses;

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

    public static JoinerToCourses mapToJoinerToCourses(JoinerToCoursesDto joinerToCoursesDto, JoinerToCourses joinerToCourses) {
        joinerToCourses.setCourseId(joinerToCoursesDto.getCourseId());
        joinerToCourses.setJoinerId(joinerToCoursesDto.getJoinerId());
        joinerToCourses.setIsCompleted(joinerToCoursesDto.getIsCompleted());
        return joinerToCourses;
    }

    public static JoinerToCoursesDto mapToJoinerToCoursesDto(JoinerToCourses joinerToCourses, JoinerToCoursesDto joinerToCoursesDto) {
        joinerToCoursesDto.setCourseId(joinerToCourses.getCourseId());
        joinerToCoursesDto.setJoinerId(joinerToCourses.getJoinerId());
        joinerToCoursesDto.setIsCompleted(joinerToCourses.getIsCompleted());
        return joinerToCoursesDto;
    }
}
