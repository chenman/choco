package org.choco.configuration;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

@SuppressWarnings("deprecation")
@ControllerAdvice(basePackages = {"org.choco.api"})
public class JSONPConfiguration extends AbstractJsonpResponseBodyAdvice {
    public JSONPConfiguration() {
        super("callback", "jsonp");
    }
}
