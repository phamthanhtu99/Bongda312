package bongda.API;

import bongda.DTO.UserDTO;
import bongda.Service.UserServiec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api/")
@CrossOrigin(origins = "http://localhost:4200/")
public class UserAPI {
    @Autowired
    private UserServiec userServiec;
    @PostMapping("/UserAPI")
    public ResponseEntity<Object> Save(@RequestBody UserDTO dto){
        UserDTO dto1= userServiec.Save(dto);
        return new ResponseEntity<>(dto1, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping("/getAllUser")
    public  List<UserDTO> Finall(){
        List<UserDTO> dtos = userServiec.findAllByUsernameAndStatus();
        return dtos;
    }

}
