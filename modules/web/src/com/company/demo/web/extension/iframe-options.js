com_company_demo_web_extension_IframeOptions = function () {
    var self = this;

    this.onStateChange = function () {
        console.log("Sandbox onStateChange");
        var iframe = self.getElement(self.getParentId()).firstElementChild;

        if (this.getState().sandbox) {
            console.log("Sandbox is set");
            console.log(iframe);

            // set to iframe
            iframe.setAttribute("sandbox", this.getState().sandbox);
        }
    }
};