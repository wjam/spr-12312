package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ExampleMvc {

    private static final Logger LOG = LoggerFactory.getLogger(ExampleMvc.class);

    @RequestMapping(value = "/foo", method = RequestMethod.POST)
    public void insertFoos(@Valid @RequestBody List<Foo> foos) {
        LOG.info("Got {}", foos);
    }

}
