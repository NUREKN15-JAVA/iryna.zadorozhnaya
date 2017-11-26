package ua.nure.kn156.zadorozhnaya.web;

import java.util.Properties;

import com.mockobjects.dynamic.Mock;
import com.mockrunner.servlet.BasicServletTestCaseAdapter;

import ua.nure.kn156.zadorozhnaya.db.DaoFactory;
import ua.nure.kn156.zadorozhnaya.db.MockDAOFactory;

public abstract class MockServletTestCase extends BasicServletTestCaseAdapter {

    private Mock mockUserDao;

    public Mock getMockUserDao() {
        return mockUserDao;
    }

    public void setMockUserDao(Mock mockUserDao) {
        this.mockUserDao = mockUserDao;
    }

    protected void setUp() throws Exception {
        super.setUp();
        Properties properties = new Properties();
        properties.setProperty("dao.factory", MockDAOFactory.class.getName());
        DaoFactory.init(properties);
        setMockUserDao(((MockDAOFactory) DaoFactory.getInstance()).getMockUserDAO());
    }

    protected void tearDown() throws Exception {
        //getMockUserDao().verify();
        super.tearDown();
    }

}