package FirstProject.Controller;


import FirstProject.DTO.MessageDTO;
import FirstProject.DTO.Request.VotacaoRequestDTO;
import FirstProject.DTO.Response.VotacaoResponseDTO;
import FirstProject.Service.Impl.VotacaoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/create")
    public MessageDTO createVotacao(@RequestBody VotacaoRequestDTO requestDTO){
        return service.createVotacao(requestDTO);
    }
}
