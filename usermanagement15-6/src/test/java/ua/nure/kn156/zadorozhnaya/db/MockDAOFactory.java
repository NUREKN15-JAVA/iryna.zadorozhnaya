package ua.nure.kn156.zadorozhnaya.db;

import com.mockobjects.dynamic.Mock;

public class MockDAOFactory extends DaoFactory {

    private Mock mockUserDAO;

    public MockDAOFactory() {
        mockUserDAO = new Mock(UserDAO.class);
    }

    public Mock getMockUserDAO() {
        return mockUserDAO;
    }

    @Override
    public UserDAO getUserDao() {
        return (UserDAO) mockUserDAO.proxy();
    }

}
