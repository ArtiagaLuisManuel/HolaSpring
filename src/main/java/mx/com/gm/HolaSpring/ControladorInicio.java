package mx.com.gm.HolaSpring;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio() {
        log.info("Ejecutando el controlador Rest");
        return "Hola mundo desde Spring!!";
    }

}
