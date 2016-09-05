package com.sbham.kia.service;

import com.sbham.kia.model.LocationTO;

public interface IMapService
{
    void findWaysToTravel(LocationTO locationTO) throws Exception;
}
