package FirstProject.Service.Impl;

import FirstProject.DTO.MessageDTO;
import FirstProject.DTO.Request.VotoRequestDTO;
import FirstProject.Service.VotoService;
import FirstProject.Repository.Integration_external.ValidateIntegration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VotoServiceImpl implements VotoService {
    private static Logger logger = LoggerFactory.getLogger(VotoServiceImpl.class);


    private ValidateIntegration integration;

    @Autowired
    public VotoServiceImpl(ValidateIntegration integration){
        this.integration = integration;
    }
///     //"cpf":"19839091069",
    public MessageDTO addVoto(VotoRequestDTO requestDTO){
        try{
            logger.info("{}",requestDTO.getCPF());

            if(integration.podeVotar(requestDTO.getCPF())){
                var message = new MessageDTO();
                message.setStatus("Voto Confirmado");
                return message;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


}
