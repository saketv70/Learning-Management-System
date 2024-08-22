package com.lms.courses.repository;

import com.lms.courses.entity.JoinerToCourses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JoinerToCoursesRepository extends JpaRepository<JoinerToCourses, Long> {
    Optional<JoinerToCourses> findByJoinerIdAndCourseId(Long joinerId, Long courseId);
}
