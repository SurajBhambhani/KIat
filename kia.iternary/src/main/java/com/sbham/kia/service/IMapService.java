package com.sbham.kia.service;

import com.sbham.kia.model.LocationTO;

public interface IMapService extends IService
{
    void findWaysToTravel(LocationTO locationTO) throws Exception;

    void findItinerary(LocationTO locationTO) throws Exception;
}
