package bongda.API;

import bongda.DTO.NewDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewAPI {
    @PostMapping(value = "/new")
    public NewDTO createNew(@RequestBody NewDTO model) {
        return model;
    }

}
