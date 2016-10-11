package com.sbham.kia.service.impl;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.maps.DirectionsApi;
import com.google.maps.DirectionsApiRequest;
import com.google.maps.GaeRequestHandler;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DirectionsLeg;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.DirectionsRoute;
import com.sbham.kia.helper.HTTPHelper;
import com.sbham.kia.model.Itinerary;
import com.sbham.kia.service.IMapService;
import com.sbham.kia.model.LocationTO;
import com.sbham.kia.util.KiaConstants;
import org.springframework.stereotype.Service;

@Service
public class MapService implements IMapService
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

    @Override public void findItinerary(LocationTO locationTO) throws Exception
    {
        String response = HTTPHelper.sendGet("http://free.rome2rio.com/api/1.4/"+KiaConstants.JSON+"/Search?key="+KiaConstants.RIO_KEY+"&oName="+locationTO.getFirstLocation()+"&dName="+locationTO.getSecondLocation());
        Gson gson = new Gson();

        // JSON to JsonElement, convert to String later.
        Itinerary itinerary = gson.fromJson(response, Itinerary.class);
        String result = gson.toJson(itinerary);
        System.out.println(result);
        System.out.println(itinerary.toString());
    }

}
