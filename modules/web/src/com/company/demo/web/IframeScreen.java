package com.company.demo.web;

import com.company.demo.web.extension.IframeOptions;
import com.haulmont.cuba.gui.components.BrowserFrame;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("demo_IframeScreen")
@UiDescriptor("iframe-screen.xml")
public class IframeScreen extends Screen {
    @Inject
    protected BrowserFrame wikiFrame;

    @Subscribe
    protected void onInit(InitEvent event) {
        IframeOptions options = new IframeOptions(wikiFrame.unwrap(com.vaadin.ui.BrowserFrame.class));
        options.setSandbox("allow-popups");
    }
}