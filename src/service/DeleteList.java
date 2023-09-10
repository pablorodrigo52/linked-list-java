package service;

import javax.management.AttributeNotFoundException;

public interface DeleteList {

    /**
     * Delete an element from head of list.
     */
    void delete();

    /**
     * Delete an element by value. If value not exists then returns a AttributeNotFoundException.
     * @param value String to be deleted from list.
     */
    void deleteByValue(String value)  throws AttributeNotFoundException;
}
