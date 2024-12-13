package io.github.Eder_Moraes.ArquiteturaSpring.todos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("todos")
public class TodoController {

    private TodoService service;

    public TodoController(TodoService todoService){
        this.service = todoService;
    }

    @PostMapping
    public TodoEntity salvar(@RequestBody TodoEntity todoEntity){
        return this.service.salvar(todoEntity);
    }

    @PutMapping("{id}")
    public void atualizarStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity todoEntity){
        todoEntity.setId(id);
        service.atualizarStatus(todoEntity);
    }

    @GetMapping("{id}")
    public TodoEntity buscar(@PathVariable("id") Integer id){
        return service.buscarPorId(id);
    }
}
