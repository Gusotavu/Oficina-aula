package br.com.digitalhouse.oficina.clientservices;

import br.com.digitalhouse.oficina.Repository.ClientRepository;
import br.com.digitalhouse.oficina.Repository.VeiculoRepository;
import br.com.digitalhouse.oficina.model.Cliente;
import br.com.digitalhouse.oficina.model.Veiculo;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {
    
    private static final Logger LOGGER = Logger.getLogger(VeiculoService.class.getName());
    private final ClientRepository clientRepository;
    private final VeiculoRepository veiculoRepository;
    
    public VeiculoService(VeiculoRepository veiculoRepository, ClientRepository clientRepository) {
        this.veiculoRepository = veiculoRepository;
        this.clientRepository = clientRepository;
    }
    
    public List<Veiculo> findAll() {
		return veiculoRepository.findAll();
    }

	public long count() {
		return veiculoRepository.count();
	}

	public void delete(Veiculo veiculo) {
		veiculoRepository.delete(veiculo);
	}

	public void save(Veiculo veiculo) {
		if (veiculo == null) { 
			LOGGER.log(Level.SEVERE,
                            "Veículo não encontrado. Tem certeza de que está buscancdo um veícuo cadastrado no sistema?");
			return;
		}
		clientRepository.save(veiculo);
	}
}
