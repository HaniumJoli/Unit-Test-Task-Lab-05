package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CityListTest {



    @Test
    void count() {
        CityList cityList=new CityList();
        City city=new City("a","b");
        cityList.add(city);
        assertEquals(1,cityList.count());

    }

    @Test
    void delete() {
        CityList cityList=new CityList();
        City city=new City("ab","bb");
        cityList.add(city);
        cityList.delete(city);
        assertEquals(0,cityList.count());
    }
    @Test
    void deleteexception(){
        CityList cityList=new CityList();
        City city=new City("a","b");
        assertThrows(IllegalArgumentException.class,()->cityList.delete(city));
    }


    @Test
    void getCities() {
        CityList cityList=new CityList();
        City c1=new City("a","b");
        City c2=new City("b","a");
        cityList.add(c1);
        cityList.add(c2);
        List<City> l1=cityList.getCities("city");
        List<City> l2=cityList.getCities("province");
        boolean check=l1.get(0).getCityName().equals("a") && l2.get(0).getCityName().equals("b");
        assertFalse(check);
    }
}