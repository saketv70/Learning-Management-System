package com.lms.query.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QueryDto {
    private Integer queryId;
    private String description;
    private String response;
    private Integer joinerId;
    private Integer mentorId;
}
