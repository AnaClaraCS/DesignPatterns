package Composite;

import java.util.ArrayList;
import java.util.List;

public class TarefaComposite implements InterfaceTarefa{
    private List<InterfaceTarefa> subtarefas;
    private String descricao;

    public TarefaComposite(String descricao){
        this.descricao = descricao;
        subtarefas = new ArrayList<InterfaceTarefa>();
    }

    public String getDescricao() {
        String descricao = this. descricao;
        descricao += (getStatus())? " - concluida" : " - não concluida";
        
        if(subtarefas.isEmpty()){
            return descricao;
        }
        else{
            descricao+= " { \n";
            for (InterfaceTarefa tarefa : subtarefas) {
                descricao+= "\t" + tarefa.getDescricao() + "\n";
            }
            descricao+= " }";
            return descricao;
        }
    }

    public boolean getStatus() {
        for (InterfaceTarefa tarefa : subtarefas) {
            if(!tarefa.getStatus())
                return false;
        }
        return true;  
    }

    public void addTarefa(InterfaceTarefa tarefa){
        subtarefas.add(tarefa);
    }

    public void removeTarefa(InterfaceTarefa tarefa){
        subtarefas.remove(tarefa);
    }

    public List<InterfaceTarefa> getSubtarefas(){
        return subtarefas;
    }

}
