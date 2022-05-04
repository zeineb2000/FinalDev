package tn.spring.projet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.projet.Entity.Reglement;
import tn.spring.projet.Service.ReglementService;

@RestController
public class ReglementController {

    @Autowired
    ReglementService reglementService;

    @PostMapping("/addReglement/{idVisite}")
    public Reglement createReglemnt(@RequestBody Reglement reglement, @PathVariable(value = "idVisite")Long idVisite ) {
        return  reglementService.createReglement(reglement, idVisite);
        /* Post post1=new Post();
        BadWordConfig badWordConfig = new BadWordConfig();
        post1.setDescription(badWordConfig.filterText2(post1.getDescription()));
        System.out.println(post1.getDescription());
        return post1;*/

    }

    @PutMapping("/updateReglement")
    public Reglement updatePost(@RequestBody Reglement reglement){
        return reglementService.updateReglement(reglement);
    }

    @DeleteMapping("/deletePoste/{id_post}")
    public String deletePost(@PathVariable Long idVsite){
        return reglementService.deleteReglement(idVsite);
    }



}
