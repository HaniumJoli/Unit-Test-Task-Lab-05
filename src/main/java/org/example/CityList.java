package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.lang.*;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if that city does not exist
     *
     * @param city This is the city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This removes a city from the list.If the city is not present then trows an exception
     *
     * @param city
     *      this is the city to be removed
     */
    public void delete(City city) throws IllegalArgumentException {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("no city available");

        } else {
            cities.remove(city);
        }

    }


    /**
     * This counts the total number of cities
     * @return
     *       Return the total number of cities.
     */

    public int count() {
        return cities.size();
    }

    /**
     * This returns a sorted list of cities
     * @param parameter
     *      this is the parameter the cities will be sorted based on
     * @return Return the sorted list of cities
     */
    public List<City> getCities(String parameter) {
        List<City> cityList = cities;
        if(parameter.equalsIgnoreCase("city")) {
            cityList.sort((c1,c2)->c1.getCityName().compareTo(c2.getCityName()));
        }
        else if(parameter.equalsIgnoreCase("province")){

            cityList.sort((c1,c2)->c1.getProvinceName().compareTo(c2.getProvinceName()));
        } else {
            throw new IllegalArgumentException();
        }

        return cityList;
    }
}
