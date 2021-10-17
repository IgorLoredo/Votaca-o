package FirstProject.Controller;


import FirstProject.DTO.Response.VotacaoResponseDTO;
import FirstProject.Service.Impl.VotacaoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/votacao/v0")
public class VotacaoController {

    @Autowired
    VotacaoServiceImpl service;

    @GetMapping("/{id}")
    public VotacaoResponseDTO findVotacao(@PathVariable
    long id) {
        return service.findVotacao(id);
    }
}
