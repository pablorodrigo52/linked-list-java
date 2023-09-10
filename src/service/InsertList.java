package service;

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
