package com.wmgro.gant.web;

import com.wmgro.domain.Note;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @version 1.0
 * @Description TODD
 * @Author wmazh
 * @Date 2020-12-15 0015 21:00
 */
@Controller
@RequestMapping("gant")
@Slf4j
public class GanttCtl {
    @GetMapping("")
    public String list(ModelMap model){
        return "gantgraph/index";
    }

}
