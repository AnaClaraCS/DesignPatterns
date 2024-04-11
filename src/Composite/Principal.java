package Composite;

public class Principal {
    public static void main(String[] args) {
        TarefaComposite tarefasEmpresa = new TarefaComposite("Tarefas de gestão da empresa");

// O chat-gpt escreveu as descrições das tarefas

// Planejar Lançamento do Produto
        TarefaComposite lancamento = new TarefaComposite("1 - Planejar Lançamento do Produto");
        tarefasEmpresa.addTarefa(lancamento);
//     Elaborar Plano de Marketing
        TarefaComposite marketing = new TarefaComposite("1.1 - Elaborar Plano de Marketing");
        lancamento.addTarefa(marketing);
//         Pesquisar Mercado
        marketing.addTarefa(new TarefaFolha("Pesquisar Mercado"));
//         Definir Estratégias de Publicidade
        marketing.addTarefa(new TarefaFolha("Definir Estratégias de Publicidade"));
//     Preparar Logística de Distribuição
        TarefaComposite logistica = new TarefaComposite("1.2 - Preparar Logística de Distribuição");
        lancamento.addTarefa(logistica);
//         Estabelecer Parcerias com Transportadoras
        logistica.addTarefa(new TarefaFolha("Estabelecer Parcerias com Transportadoras"));
//         Organizar Armazenamento em Centros de Distribuição
        logistica.addTarefa(new TarefaFolha("Organizar Armazenamento em Centros de Distribuição"));

// O chat-gpt escreveu o código daqui pra baixo (de acordo como código acima)

// Desenvolver Novo Recurso de Software
    TarefaComposite desenvolvimento = new TarefaComposite("2 - Desenvolver Novo Recurso de Software");
    tarefasEmpresa.addTarefa(desenvolvimento);

    // Analisar Requisitos do Cliente
    TarefaComposite requisitos = new TarefaComposite("2.1 - Analisar Requisitos do Cliente");
    desenvolvimento.addTarefa(requisitos);
        // Realizar Entrevistas com Usuários
    requisitos.addTarefa(new TarefaFolha("Realizar Entrevistas com Usuários"));
        // Documentar Requisitos Funcionais
    requisitos.addTarefa(new TarefaFolha("Documentar Requisitos Funcionais"));

    // Implementar Funcionalidades
    TarefaComposite implementacao = new TarefaComposite("2.2 - Implementar Funcionalidades");
    desenvolvimento.addTarefa(implementacao);
        // Programar Módulos Principais
    implementacao.addTarefa(new TarefaFolha("Programar Módulos Principais"));
        // Realizar Testes de Integração
    implementacao.addTarefa(new TarefaFolha("Realizar Testes de Integração"));

// Realizar Treinamento de Funcionários
    TarefaComposite treinamento = new TarefaComposite("3 - Realizar Treinamento de Funcionários");
    tarefasEmpresa.addTarefa(treinamento);

    // Identificar Necessidades de Capacitação
    TarefaComposite necessidades = new TarefaComposite("3.1 - Identificar Necessidades de Capacitação");
    treinamento.addTarefa(necessidades);
        // Avaliar Competências dos Colaboradores
    necessidades.addTarefa(new TarefaFolha("Avaliar Competências dos Colaboradores"));
        // Levantar Temas de Interesse
    necessidades.addTarefa(new TarefaFolha("Levantar Temas de Interesse"));

    // Organizar Programação de Cursos
    TarefaComposite programacao = new TarefaComposite("3.2 - Organizar Programação de Cursos");
    treinamento.addTarefa(programacao);
        // Contratar Instrutores Especializados
    programacao.addTarefa(new TarefaFolha("Contratar Instrutores Especializados"));
        // Agendar Salas de Treinamento
    programacao.addTarefa(new TarefaFolha("Agendar Salas de Treinamento"));

        System.out.println(tarefasEmpresa.getDescricao());
    }

}
