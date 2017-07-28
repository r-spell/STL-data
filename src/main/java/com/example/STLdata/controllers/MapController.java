package com.example.STLdata.controllers;

/**
 * Created by Rosanna on 7/28/17.
 */

import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"map"})
public class MapController {
    public MapController() {

    }

    @RequestMapping({""})
    public String map(Model model) {
        return "map/index";
    }


}
