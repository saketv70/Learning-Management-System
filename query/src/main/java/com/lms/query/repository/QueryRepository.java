package com.lms.query.repository;

import com.lms.query.Entity.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QueryRepository extends JpaRepository<Query,Long> {
}
