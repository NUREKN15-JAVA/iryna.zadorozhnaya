package ua.nure.kn156.zadorozhnaya.db;

import java.sql.Connection;

public interface ConnectionFactory {
    Connection createConnection() throws DatabaseException;

}
