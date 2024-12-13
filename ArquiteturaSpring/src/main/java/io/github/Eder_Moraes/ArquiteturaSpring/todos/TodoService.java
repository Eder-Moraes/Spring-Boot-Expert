package io.github.Eder_Moraes.ArquiteturaSpring.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository todoRepository){
        this.repository = todoRepository;
    }

    public TodoEntity salvar(TodoEntity todoEntity){
        return repository.save(todoEntity);
    }

    public void atualizarStatus(TodoEntity todoEntity){
        repository.save(todoEntity);
    }

    public TodoEntity buscarPorId(int id){
        return repository.findById(id).orElse(null);
    }

}
