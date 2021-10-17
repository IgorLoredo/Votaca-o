package FirstProject.Controller;


import FirstProject.DTO.Response.VotacaoResponseDTO;
import FirstProject.Service.Impl.VotacaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/votacao")
public class VotacaoController {

    @Autowired
    VotacaoImpl service;

    @GetMapping("/{id}")
    public VotacaoResponseDTO findVotacao(@PathVariable
    int id) {
        return service.findVotacao(id);
    }
}
