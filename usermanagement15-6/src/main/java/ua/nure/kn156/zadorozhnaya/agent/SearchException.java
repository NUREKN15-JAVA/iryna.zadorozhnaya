package ua.nure.kn156.zadorozhnaya.agent;

import ua.nure.kn156.zadorozhnaya.db.DatabaseException;

public class SearchException extends Exception {

    public SearchException(DatabaseException e) {
        super(e);
    }
}