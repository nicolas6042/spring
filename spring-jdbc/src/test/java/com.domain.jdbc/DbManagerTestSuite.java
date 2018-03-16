package com.domain.jdbc;

import org.junit.Test;

import java.sql.SQLException;

import static junit.framework.TestCase.assertNotNull;

/**
 * @author mbaranowicz
 */
public class DbManagerTestSuite {

    @Test
    public void testConnect() throws SQLException{
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }
}
