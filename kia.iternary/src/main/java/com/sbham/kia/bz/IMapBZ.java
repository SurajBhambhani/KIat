package com.sbham.kia.bz;

import com.sbham.kia.model.LocationTO;

public interface IMapBZ
{
    void findWaysToTravel(LocationTO locationTO) throws Exception;
}
