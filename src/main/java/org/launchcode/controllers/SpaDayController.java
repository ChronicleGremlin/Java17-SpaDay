package org.launchcode.controllers;

import org.launchcode.controllers.models.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class SpaDayController {


    @GetMapping
    public String customerForm () {
       return "serviceSelection";
    }

    @PostMapping
    public String spaMenu( Model model, @RequestParam String skintype, @RequestParam String manipedi) {

       Client newClient = new Client(skintype, manipedi);
       newClient.setAppropriateFacials(skintype);
       model.addAttribute("client", newClient);

        return "menu";
    }
}
