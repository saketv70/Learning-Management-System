package com.lms.courses.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoinerToCoursesDto {
    private Long joinerId;
    private Long courseId;
    private Boolean isCompleted;
}
