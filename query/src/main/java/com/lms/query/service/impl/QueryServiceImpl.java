package com.lms.query.service.impl;

import com.lms.query.Entity.Query;
import com.lms.query.exceptions.ResourceNotFoundException;
import com.lms.query.mapper.QueryMapper;
import com.lms.query.repository.QueryRepository;
import com.lms.query.service.IQueryService;
import com.lms.query.dto.QueryDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class QueryServiceImpl implements IQueryService {

    private QueryRepository queryRepository;

    @Override
    public void createQuery(QueryDto queryDto) {

        Query query = QueryMapper.mapToQuery(queryDto, new Query());
        queryRepository.save(query);
    }
    @Override
    public QueryDto fetchQuery(Integer queryId)
    {
         Query query = queryRepository.findByQueryId(queryId)
                .orElseThrow(
                () -> new ResourceNotFoundException("Query ", "queryId",queryId)
        );
        return QueryMapper.mapToQueryDto(query, new QueryDto());
    }
    @Override
    public boolean updateQuery(QueryDto queryDto) {

        boolean isUpdated = false;

        Query query = queryRepository.findByQueryId(queryDto.getQueryId()).orElseThrow(
                () -> new ResourceNotFoundException("Query", "Id", queryDto.getQueryId())
        );

        if (query != null) {
            QueryMapper.mapToQuery(queryDto, query);

            queryRepository.save(query);
            isUpdated = true;
        }
        return isUpdated;
    }

    @Override
    public boolean deleteQuery(Integer queryid) {

        boolean isDeleted = false;

        Query query = queryRepository.findByQueryId(queryid).orElseThrow(
                () -> new ResourceNotFoundException("Query", "Id", queryid)
        );
        if (query != null) {
            queryRepository.delete(query);
            isDeleted = true;
        }
        return isDeleted;
    }
}

