package com.lms.courses.service.impl;

import com.lms.courses.dto.JoinerToCoursesDto;
import com.lms.courses.entity.JoinerToCourses;
import com.lms.courses.mapper.CourseMapper;
import com.lms.courses.repository.JoinerToCoursesRepository;
import com.lms.courses.service.IJoinerToCourses;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JoinerToCourseServiceImpl implements IJoinerToCourses {

    private JoinerToCoursesRepository joinerToCoursesRepository;

    @Override
    public JoinerToCoursesDto createJoinerToCourse(JoinerToCoursesDto joinerToCoursesDto) {
        JoinerToCourses data = CourseMapper.mapToJoinerToCourses(joinerToCoursesDto, new JoinerToCourses());
        JoinerToCourses response = joinerToCoursesRepository.save(data);
        return  CourseMapper.mapToJoinerToCoursesDto(response, new JoinerToCoursesDto());
    }

    @Override
    public JoinerToCoursesDto getAssignedCourse(Long joinerId, Long courseId) {
        JoinerToCourses response = joinerToCoursesRepository.findByJoinerIdAndCourseId(joinerId, courseId).orElseThrow();
        return  CourseMapper.mapToJoinerToCoursesDto(response, new JoinerToCoursesDto());
    }

    @Override
    public JoinerToCoursesDto updateJoinerToCourse(JoinerToCoursesDto joinerToCoursesDto, Long joinerId, Long courseId) {
        JoinerToCourses assignedCourseData = joinerToCoursesRepository.findByJoinerIdAndCourseId(joinerId, courseId).orElseThrow();
        CourseMapper.mapToJoinerToCourses(joinerToCoursesDto, assignedCourseData);
        JoinerToCourses updatedData = joinerToCoursesRepository.save(assignedCourseData);
        return CourseMapper.mapToJoinerToCoursesDto(updatedData, new JoinerToCoursesDto());
    }

    @Override
    public Boolean deleteJoinerToCourse(Long id) {
        return null;
    }
}
