package ua.nure.kn156.zadorozhnaya.db;

import junit.framework.TestCase;

public class DaoFactoryTest extends TestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testGetUserDao() {
        try {
            DaoFactory daoFactory = DaoFactory.getInstance();
            assertNotNull("DaoFactory instance is null", daoFactory);
            UserDAO userDAO = daoFactory.getUserDao();
            assertNotNull("UserDao instance is null", userDAO);
        } catch (RuntimeException e) {
            e.printStackTrace();
            fail(e.toString());
        }
    }

}