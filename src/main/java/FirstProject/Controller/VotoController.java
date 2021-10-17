package FirstProject.Controller;


import FirstProject.DTO.MessageDTO;
import FirstProject.DTO.Request.VotoRequestDTO;
import FirstProject.Service.Impl.VotoServiceImpl;
import FirstProject.Service.VotoService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v0/voto/")
public class VotoController {


    private VotoServiceImpl votoService;

    @Autowired
    public VotoController(VotoServiceImpl votoService) {
        this.votoService = votoService;
    }

    // Adicionar Voto
    @PostMapping
    public MessageDTO adicionarVoto(@RequestBody VotoRequestDTO requestDTO) {
        return votoService.addVoto(requestDTO);
    }
}
