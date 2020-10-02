package br.com.digitalhouse.oficina.clientservices;

import br.com.digitalhouse.oficina.Repository.ClientRepository;
import br.com.digitalhouse.oficina.Repository.VeiculoRepository;
import br.com.digitalhouse.oficina.model.Cliente;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

@Service
public class ClientServices {
    
    private static final Logger LOGGER = Logger.getLogger(ClientServices.class.getName());
    private ClientRepository clientRepository;
    private VeiculoRepository veiculoRepository;
    
    public ClientServices(ClientRepository clientRepository, VeiculoRepository veiculoRepository) { 
		this.clientRepository = clientRepository;
		this.veiculoRepository = veiculoRepository;
    }
    
    public List<Cliente> findAll() {
		return clientRepository.findAll();
    }

	public long count() {
		return clientRepository.count();
	}

	public void delete(Cliente cliente) {
		clientRepository.delete(cliente);
	}

	public void save(Cliente cliente) {
		if (cliente == null) { 
			LOGGER.log(Level.SEVERE,
					"Cliente não encontrado. Tem certeza de que está buscancdo um cliente cadastrado no sistema?");
			return;
		}
		clientRepository.save(cliente);
	}
}
