package service;

public interface UpdateList {

    /**
     * update a value node by index.
     * @param index position node to be updated.
     * @param value new value for node
     */
    void updateByIndex(int index, String value);
}
