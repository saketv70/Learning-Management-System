package com.lms.query.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "query")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Query {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long query_id;
    private Long joiner_id;
    private Long mentor_id;
    private String description;
    private String response;
    private Boolean is_resolved;
}
