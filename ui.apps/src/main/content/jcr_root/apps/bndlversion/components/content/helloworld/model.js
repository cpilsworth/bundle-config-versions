"use strict";
use(function() {
  propsky: function() {
    var config = sling.getService(Packages.bndlversion.core.service.DataEndpointConfiguration);
    return config.getProperty();
  }
});