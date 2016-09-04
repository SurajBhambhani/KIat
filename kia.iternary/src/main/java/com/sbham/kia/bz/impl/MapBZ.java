package com.sbham.kia.bz.impl;

import com.google.maps.DirectionsApi;
import com.google.maps.DirectionsApiRequest;
import com.google.maps.GaeRequestHandler;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DirectionsLeg;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.DirectionsRoute;
import com.sbham.kia.bz.IMapBZ;
import com.sbham.kia.model.LocationTO;
import com.sbham.kia.util.KiaConstants;

public class MapBZ implements IMapBZ
{
    public void findWaysToTravel(LocationTO locationTO) throws Exception
    {
        GeoApiContext context = new GeoApiContext(new GaeRequestHandler()).setApiKey(KiaConstants.GMAP_API_KEY);

        DirectionsApiRequest directionsApiRequest = DirectionsApi.getDirections(context, locationTO.getSecondLocation(), locationTO.getSecondLocation()).alternatives(true);

        DirectionsResult directionsResult = directionsApiRequest.await();

        DirectionsRoute[] routes = directionsResult.routes;

        for (DirectionsRoute route : routes)
        {
            DirectionsLeg[] legs = route.legs;

        }



        /*StringBuilder url = new StringBuilder();
        url.append(KiaConstants.GMAP_API_KEY);

        try
        {
            HTTPHelper.sendGet(url.toString());
        }
        catch (Exception e)
        {
            throw new LocationNotFoundException();
        }*/
    }
}
