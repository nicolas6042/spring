package com.domain.stream.world;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mbaranowicz
 */
public final class Continent {

    private final String continent;
    private final Set<Country> countries = new HashSet<>();

    public Continent(String continent) {
        this.continent = continent;
    }


    public Set<Country> getCountries() {
        return countries;
    }
    public void addCountry(Country country){
        countries.add(country);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent1 = (Continent) o;

        return continent.equals(continent1.continent);
    }

}
