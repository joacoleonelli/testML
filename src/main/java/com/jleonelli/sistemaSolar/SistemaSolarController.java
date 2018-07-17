package com.jleonelli.sistemaSolar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/clima")
public class SistemaSolarController {

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  @ResponseBody
  public String obtenerClimaPorDia(@RequestParam("dia") String dia) {
      return "Hola";
  }
}
