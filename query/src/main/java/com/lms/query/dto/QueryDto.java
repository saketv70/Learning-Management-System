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
    private Long joiner_id;
    private Long mentor_id;
    private String description;
    private String response;
    private Boolean is_resolved;
}
