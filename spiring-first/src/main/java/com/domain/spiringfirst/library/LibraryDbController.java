package com.domain.spiringfirst.library;

import org.springframework.stereotype.Repository;

/**
 * @author mbaranowicz
 */
@Repository
public class LibraryDbController {

    public void saveData() {
        System.out.println("Saving...");
    }

    public void loadData() {
        System.out.println("Loading");
    }
}
