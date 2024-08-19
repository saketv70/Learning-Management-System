package com.lms.courses.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseRequestDto {

    private String title;
    private String duration;
    private Long uploaded_by;
    private String category;
    private Boolean is_approved;
}
