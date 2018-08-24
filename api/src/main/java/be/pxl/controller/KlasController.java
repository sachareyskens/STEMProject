package be.pxl.controller;

import be.pxl.entity.Klas;
import be.pxl.service.IKlasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(KlasController.BASE_URL)
public class KlasController {
    public static final String BASE_URL = "/klas";


    @Autowired
    private IKlasService service;


    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces="application/json;charset=utf-8")
    public ResponseEntity<Klas> getKlasById(@PathVariable("id") int id) {

        HttpStatus status = HttpStatus.OK;
        Klas klas = service.getKlas(id);

        if (klas == null)
            status = HttpStatus.NOT_FOUND;

        return new ResponseEntity<Klas>(klas, status);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces="application/json;charset=utf-8")
    public List<Klas> getAllKlass() {
        return service.getAll();
    }

    @RequestMapping(value = "/add", method=RequestMethod.POST)
    @ResponseStatus (value = HttpStatus.CREATED)
    public void addKlas(@RequestBody Klas klas) {

        service.addKlas(klas);
    }

    @RequestMapping(value = "/delete/{id}", method=RequestMethod.DELETE)
    public void deleteKlas(@PathVariable("id") int id) {
        service.deleteKlas(id);
    }

}
