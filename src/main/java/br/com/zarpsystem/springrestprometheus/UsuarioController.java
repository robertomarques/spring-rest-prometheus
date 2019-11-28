package br.com.zarpsystem.springrestprometheus;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
    @GetMapping
    public @ResponseBody  List<Usuario> get() {
        return StreamSupport.stream(usuarioRepository.findAll().spliterator(),false).map(usuario -> usuario ).collect(Collectors.toList());
    }
    
    @PostMapping
    public @ResponseBody  ResponseEntity<?> post(Usuario usuario) {
        usuarioRepository.save(usuario);
        return ResponseEntity.created(null).build();
    }

}
