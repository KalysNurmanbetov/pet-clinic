package kg.kalys.petclinic.controllers;

import kg.kalys.petclinic.model.Vet;
import kg.kalys.petclinic.services.map.VetMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
public class VetsController {

    private final VetMapService vetMapService;

    @Autowired
    public VetsController(VetMapService vetMapService) {
        this.vetMapService = vetMapService;
    }

    @RequestMapping({"/vets", "/vets/index"})
    public String getListOfVets(Model model){
        Set<Vet> vets = this.vetMapService.findAll();
        model.addAttribute("vets", vets);

        return "vets/vets";
    }
}
