package br.edu.ifpb.infra.memory;

import br.edu.ifpb.domain.Dependente;
import br.edu.ifpb.domain.Pessoa;
import br.edu.ifpb.domain.Pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PessoasEmMemoria implements Pessoas {

    private List<Pessoa> pessoas = new ArrayList<>();
    @Override
    public void nova(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    @Override
    public List<Pessoa> todas() {
        return Collections.
                unmodifiableList(this.pessoas);
    }

    @Override
    public void excluir(Pessoa pessoa) {

    }

    @Override
    public void atualizar(Pessoa pessoa) {

    }

    @Override
    public Pessoa localizarPessoaComId(long id) {
        return null;
    }

    @Override
    public List<Dependente> todosOsDepentendes() {
        return null;
    }

    @Override
    public Dependente localizarDependenteComId(String uuid) {
        return null;
    }

    @Override
    public void novo(Dependente dependente) {

    }
}
