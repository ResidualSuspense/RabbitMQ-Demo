package com.xs.web;

import com.xs.service.HelloSender1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by www on 2017/9/28.
 */
@RestController
@RequestMapping("/rabbit")
public class RabbitController {

    @Autowired
    private HelloSender1 helloSender1;
    @Autowired
    private HelloSender1 helloSender2;

    @PostMapping("/hello")
    public void hello() {
        helloSender1.send();
    }
}
