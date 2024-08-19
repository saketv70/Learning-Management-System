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
    private Integer queryId;
    private String  description;
    private String  response;
    private Integer joinerId;
    private Integer mentorId;
}
