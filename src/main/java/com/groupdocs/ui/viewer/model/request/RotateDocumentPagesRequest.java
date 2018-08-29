package com.groupdocs.ui.viewer.model.request;

import com.groupdocs.ui.model.request.LoadDocumentRequest;

import java.util.List;

public class RotateDocumentPagesRequest extends LoadDocumentRequest {
    private Integer angle;
    private List<Integer> pages;

    public Integer getAngle() {
        return angle;
    }

    public void setAngle(Integer angle) {
        this.angle = angle;
    }

    public List<Integer> getPages() {
        return pages;
    }

    public void setPages(List<Integer> pages) {
        this.pages = pages;
    }
}
