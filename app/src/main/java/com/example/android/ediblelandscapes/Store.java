package com.example.android.ediblelandscapes;

public class Store {

    // instance fields
    private String name; // store's name
    private String address; // store's address
    private int imageResource; // store's image

    /**
     * Creates a new Store object
     *
     * @param name          store's name
     * @param address       store's address
     * @param imageResource store's image
     */
    public Store(String name, String address, int imageResource) {
        this.name = name;
        this.address = address;
        this.imageResource = imageResource;
    }

    /**
     * Returns the name of the store
     *
     * @return store's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the address of the store
     *
     * @return store's address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Returns the image of the store
     *
     * @return store's image
     */
    public int getImageResource() {
        return imageResource;
    }

}
