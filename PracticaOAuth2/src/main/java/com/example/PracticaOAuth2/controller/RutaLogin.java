package com.example.PracticaOAuth2.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class RutaLogin {
    @RequestMapping("/")
    public String Ruta01(){
        return "Ingreso autorizado, Google le ha reconocido exitosamente!";
    }

    @RequestMapping("/autentication")
    public Map<String, Object> DatosDelUsuario(OAuth2AuthenticationToken oAuth2AuthenticationToken){
        return oAuth2AuthenticationToken.getPrincipal().getAttributes();
    }
}

