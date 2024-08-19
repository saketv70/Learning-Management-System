package com.lms.query.mapper;

import com.lms.query.Entity.Query;
import com.lms.query.dto.QueryDto;

public class QueryMapper {
    public static Query mapToQuery(QueryDto queryDto, Query query){
        query.setQueryId(queryDto.getQueryId());
        query.setDescription(queryDto.getDescription());
        query.setResponse(queryDto.getResponse());
        query.setJoinerId(queryDto.getJoinerId());
        query.setMentorId(queryDto.getMentorId());
        return query;
    }
    public static QueryDto mapToQueryDto(Query query, QueryDto queryDto){
        queryDto.setQueryId(query.getQueryId());
        queryDto.setDescription(query.getDescription());
        queryDto.setResponse(query.getResponse());
        queryDto.setJoinerId(query.getJoinerId());
        queryDto.setMentorId(query.getMentorId());
        return queryDto;
    }

}
