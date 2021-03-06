package com.groupdocs.ui.viewer.model.response;

/**
 * RotatedPageEntity
 *
 * @author Aspose Pty Ltd
 */
public class RotatedPageEntity {
    private int pageNumber;
    private String angle;

    /**
     * Get page number
     * @return page number
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Set page number
     * @param pageNumber page number
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * Get rotation angle
     * @return angle (from 0 to 270 deg)
     */
    public String getAngle() {
        return angle;
    }

    /**
     * set rotation angle
     * @param angle angle (from 0 to 270 deg)
     */
    public void setAngle(String angle) {
        this.angle = angle;
    }
}
