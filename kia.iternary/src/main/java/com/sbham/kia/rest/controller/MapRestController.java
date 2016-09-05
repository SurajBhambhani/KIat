package com.sbham.kia.rest.controller;

import com.sbham.kia.service.IMapService;
import com.sbham.kia.service.impl.MapService;
import com.sbham.kia.model.LocationTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapRestController
{

    private IMapService mapBZ;

    @RequestMapping(value = "map/{l1}/{l2}", method = RequestMethod.GET)
    public void findWaysToTravel(@PathVariable("l1") String location1, @PathVariable("l2") String location2) throws Exception
    {
        LocationTO locationTO = new LocationTO().setFirstLocation(location1).setSecondLocation(location2);
        System.out.println(locationTO);

        mapBZ.findWaysToTravel(locationTO);

        //Find the Way of travelling
        //

    }

@Autowired
    public MapRestController setMapBZ(MapService mapBZ)
    {
        this.mapBZ = mapBZ;
        return this;
    }
}
