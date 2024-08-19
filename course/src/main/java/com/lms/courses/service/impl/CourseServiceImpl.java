package com.lms.courses.service.impl;

import com.lms.courses.dto.CourseRequestDto;
import com.lms.courses.entity.Course;
import com.lms.courses.mapper.CourseMapper;
import com.lms.courses.repository.CourseRepository;
import com.lms.courses.service.ICourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements ICourseService {

    private CourseRepository courseRepository;

    @Override
    public CourseRequestDto createCourse(CourseRequestDto courseRequestDto) {
        Course courseData = CourseMapper.mapToCourse(courseRequestDto, new Course());
        Course response = courseRepository.save(courseData);
        return CourseMapper.mapToCourseRequestDto(response, new CourseRequestDto());
    }

    @Override
    public CourseRequestDto getCourseById(Long id) {
        Course response = courseRepository.findById(id).orElseThrow();
        return CourseMapper.mapToCourseRequestDto(response, new CourseRequestDto());
    }

    @Override
    public CourseRequestDto updateCourse(CourseRequestDto courseRequestDto, Long id) {
        Course courseData = courseRepository.findById(id).orElseThrow();
        CourseMapper.mapToCourse(courseRequestDto, courseData);
        Course updatedData = courseRepository.save(courseData);
        return CourseMapper.mapToCourseRequestDto(updatedData, new CourseRequestDto());
    }

    @Override
    public Boolean deleteCourse(Long id) {
        Course courseData = courseRepository.findById(id).orElseThrow();
        courseRepository.deleteById(id);
        return true;
    }
}
