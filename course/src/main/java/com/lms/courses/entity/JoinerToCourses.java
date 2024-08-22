package com.lms.courses.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="joinerXcourse")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoinerToCourses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long joinerId;
    private Long courseId;
    private Boolean isCompleted;
}
