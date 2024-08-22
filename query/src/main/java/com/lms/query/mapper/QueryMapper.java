package com.lms.query.mapper;

import com.lms.query.Entity.Query;
import com.lms.query.dto.QueryDto;

public class QueryMapper {
    public static Query mapToQuery(QueryDto queryDto, Query query){
        query.setDescription(queryDto.getDescription());
        query.setResponse(queryDto.getResponse());
        query.setJoiner_id(queryDto.getJoiner_id());
        query.setMentor_id(queryDto.getMentor_id());
        query.setIs_resolved(queryDto.getIs_resolved());
        return query;
    }
    public static QueryDto mapToQueryDto(Query query, QueryDto queryDto){
        queryDto.setDescription(query.getDescription());
        queryDto.setResponse(query.getResponse());
        queryDto.setJoiner_id(query.getJoiner_id());
        queryDto.setMentor_id(query.getMentor_id());
        queryDto.setIs_resolved(query.getIs_resolved());
        return queryDto;
    }

}
