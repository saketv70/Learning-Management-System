package com.lms.query.service;

import com.lms.query.dto.QueryDto;

public interface IQueryService {

    void createQuery(QueryDto queryDto);

    QueryDto fetchQuery(Long queryId);

    boolean updateQuery(Long queryId, QueryDto queryDto);

    boolean deleteQuery(Long queryId);
}
