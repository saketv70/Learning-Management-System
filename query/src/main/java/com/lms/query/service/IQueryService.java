package com.lms.query.service;

import com.lms.query.dto.QueryDto;

public interface IQueryService {

    void createQuery(QueryDto queryDto);

    QueryDto fetchQuery(Integer queryId);

    boolean updateQuery(QueryDto queryDto);

    boolean deleteQuery(Integer queryId);
}
