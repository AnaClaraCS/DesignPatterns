package Composite;

public class TarefaFolha implements InterfaceTarefa{
    private String descricao;
    private boolean status;

    public TarefaFolha(String descricao){
        this.descricao=descricao;
        status=false;
    }

    public String getDescricao() {
        String descricao = this.descricao;
        descricao += (getStatus())? " - concluida" : " - não concluida";
        return descricao;
    }

    public boolean getStatus() {
        return status;
    }

    public void conclui(){
        status=true;
    }

    public void desconclui(){
        status=false;
    }

}
