package io.github.Eder_Moraes.ArquiteturaSpring.todos;

import jakarta.persistence.*;


@Entity
@Table(name = "tb_todo")
public class TodoEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "fl_concluido")
    private Boolean concluir;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getConcluir() {
        return concluir;
    }

    public void setConcluir(Boolean concluir) {
        this.concluir = concluir;
    }
}
