package com.lms.courses.service;

import com.lms.courses.dto.JoinerToCoursesDto;

public interface IJoinerToCourses {
    JoinerToCoursesDto createJoinerToCourse(JoinerToCoursesDto joinerToCoursesDto);

    JoinerToCoursesDto getAssignedCourse(Long joinerId, Long courseId);

    JoinerToCoursesDto updateJoinerToCourse(JoinerToCoursesDto joinerToCoursesDto, Long joinerId, Long courseId);

    Boolean deleteJoinerToCourse(Long id);
}
