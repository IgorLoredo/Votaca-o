package FirstProject.exceptions;

public class VotacaoExpiradaException extends  Exception{
    public VotacaoExpiradaException(Long id){
        super("A votacao " + id +"Expirou");
    }
}
