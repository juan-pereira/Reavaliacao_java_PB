package br.edu.infnet.appatpb.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appatpb.model.negocio.Cliente;
import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.repository.IClienteRepository;
import br.edu.infnet.appatpb.model.repository.IUsuarioRepository;

@Service
public class ClienteService {
	
	@Autowired
	private IClienteRepository clienteRepository;
	
	
	public void incluir(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	public List<Cliente> obterLista() {
		
		return (List<Cliente>) clienteRepository.findAll();
	}
	
	public List<Cliente> obterListaUser(Usuario usuario) {
		
		return (List<Cliente>) clienteRepository.obterListaUser(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}
	
	public void excluir (Integer id) {
		clienteRepository.deleteById(id);
	}
	
}
