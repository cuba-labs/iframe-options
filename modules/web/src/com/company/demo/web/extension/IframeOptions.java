package com.company.demo.web.extension;

import com.vaadin.annotations.JavaScript;
import com.vaadin.server.AbstractJavaScriptExtension;
import com.vaadin.ui.BrowserFrame;

@JavaScript("iframe-options.js")
public class IframeOptions extends AbstractJavaScriptExtension {

    public IframeOptions(BrowserFrame target) {
        super(target);
    }

    public void setSandbox(String sandbox) {
        getState().sandbox = sandbox;
    }

    @Override
    protected IframeOptionsState getState() {
        return (IframeOptionsState) super.getState();
    }

    @Override
    protected IframeOptionsState getState(boolean markAsDirty) {
        return (IframeOptionsState) super.getState(markAsDirty);
    }
}