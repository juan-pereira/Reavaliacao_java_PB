package br.edu.infnet.appatpb.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appatpb.model.negocio.Cliente;
import br.edu.infnet.appatpb.model.negocio.Reserva;
import br.edu.infnet.appatpb.model.negocio.Usuario;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Integer>{
	@Query("from Cliente c where c.usuario.id = :userid")
	public List<Cliente> obterListaUser(Integer userid,  Sort sort);
}
