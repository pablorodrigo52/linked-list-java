Default linked list in java.

INITIAL CHANGES: 10/09/2023

Functions:
**Insert:**
```
public interface InsertList {
    /**
     * Add function. Adds an element on head of linked list.
     * @param value String node value
     */
    void add(String value);

    /**
     * Add a node on determinated position on linked list.
     * @param value String node value
     * @param index position to be added
     */
    void addAtIndex(String value, int index);

    /**
     * Append an element on linked list.
     * @param value String node value
     */
    void append(String value);
}
```

**Delete:**
```
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
```

**Update:**
```
public interface UpdateList {

    /**
     * update a value node by index.
     * @param index position node to be updated.
     * @param value new value for node
     */
    void updateByIndex(int index, String value);
}
```
