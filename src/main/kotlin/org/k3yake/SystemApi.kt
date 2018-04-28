package org.k3yake

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import javax.annotation.PostConstruct

/**
 * Created by katsuki-miyake on 18/04/28.
 */
@Controller
class SystemApi {
    private var redy = false;

    @PostConstruct
    fun init() {
        println("sleep start")
        Thread.sleep(10 * 1000)
        println("sleep end")
        redy = true
    }

    @GetMapping("/ready")
    fun reday():String {
        println("call ready")
        while (true) {
            if(redy){
                return "ready"
            }
        }
    }

}