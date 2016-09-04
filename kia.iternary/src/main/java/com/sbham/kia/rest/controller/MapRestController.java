package com.sbham.kia.rest.controller;

import com.sbham.kia.bz.IMapBZ;
import com.sbham.kia.bz.impl.MapBZ;
import com.sbham.kia.model.LocationTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapRestController
{
    @Autowired
    private IMapBZ mapBZ = new MapBZ();

    @RequestMapping(value = "map/{l1}/{l2}", method = RequestMethod.GET)
    public void findWaysToTravel(@PathVariable("l1") String location1, @PathVariable("l2") String location2) throws Exception
    {
        LocationTO locationTO = new LocationTO().setFirstLocation(location1).setSecondLocation(location2);
        System.out.println(locationTO);

        mapBZ.findWaysToTravel(locationTO);

        //Find the Way of travelling
        //

    }

    public MapRestController setMapBZ(MapBZ mapBZ)
    {
        this.mapBZ = mapBZ;
        return this;
    }
}
