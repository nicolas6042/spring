package com.domain.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mbaranowicz
 */
public class World {

    private final Set<Continent> continentList = new HashSet<>();

    public Set<Continent> getContinentList() {
        return continentList;
    }
    public void addContinent(Continent continent){
        continentList.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return continentList.stream()
                .flatMap(n -> n.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }
}
