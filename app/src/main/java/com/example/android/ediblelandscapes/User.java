package com.example.android.ediblelandscapes;

public class User {

    private String name; // user's name
    private String address; // user's location
    private int imageResource; // user's image

    /**
     * Creates a new Store object
     *
     * @param name          store's name
     * @param address       store's address
     * @param imageResource store's image
     */
    public User(String name, String address, int imageResource) {
        this.name = name;
        this.address = address;
        this.imageResource = imageResource;
    }

    /**
     * Returns the name of the user
     *
     * @return user's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the address of the user
     *
     * @return user's address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Returns the image of the user
     *
     * @return user's image
     */
    public int getImageResource() {
        return imageResource;
    }
}
