package kg.kalys.petclinic.controllers;

import kg.kalys.petclinic.model.Owner;
import kg.kalys.petclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
public class OwnerController {
    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners", "/owners/index"})
    public String getListOfOwners(Model model){
        Set<Owner> owners = this.ownerService.findAll();
        model.addAttribute("owners",owners);

        return "owners/owners";
    }
}
