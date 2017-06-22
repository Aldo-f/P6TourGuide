package com.aldofieuw.android.p6tourguide;

/**
 * {@link Location} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the default translation, Miwok translation, audio file, and
 * optional image file for that word.
 */
public class Location {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * String resource ID for the default translation of the word
     */
    private int mTitle;
    /**
     * String for Location
     */
    private int mLocation;
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Location object.
     *
     * @param titleId   is the string resource ID for the word in a language that the
     *                  user is already familiar with (such as English)
     * @param locationId is the string resource Id for the word in the Miwok language
     */
    public Location(int titleId, int locationId) {
        mTitle = titleId;
        mLocation = locationId;
    }

    /**
     * Create a new Location object.
     *
     * @param titleId         is the string resource ID for the word in a language that the
     *                        user is already familiar with (such as English)
     * @param locationId      is the string resource Id for the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Location(int titleId, int locationId, int imageResourceId,
                    int audioResourceId) {
        mTitle = titleId;
        mLocation = locationId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new Location object.
     *
     * @param titleId         is the string resource ID for the word in a language that the
     *                        user is already familiar with (such as English)
     * @param locationId      is the string resource Id for the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Location(int titleId, int locationId, int imageResourceId) {
        mTitle = titleId;
        mLocation = locationId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public int getTitleId() {
        return mTitle;
    }

    /**
     * Get the string resource ID for the Miwok translation of the word.
     */
    public int getLocationId() {
        return mLocation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}