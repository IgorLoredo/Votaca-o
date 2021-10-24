package FirstProject.Controller;


import FirstProject.DTO.MessageDTO;
import FirstProject.DTO.Request.PautaRequestDTO;
import FirstProject.DTO.Response.PautaResponseDTO;
import FirstProject.Service.Impl.PautaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v0/pauta")
public class PautaController {

    private  PautaServiceImpl pautaService;

    @Autowired
    public PautaController(PautaServiceImpl pautaService) {
        this.pautaService = pautaService;
    }

    @PostMapping
    public MessageDTO createPauta(@RequestBody PautaRequestDTO requestDTO){
        return pautaService.createPauta(requestDTO);
    }
}
