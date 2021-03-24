package converter;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.renato.demo.pessoa.Pessoa;
import com.renato.demo.pessoa.PessoaRequest;

@Service
public interface Converter {

	public List<PessoaRequest> converter(List<Pessoa> pessoas);
	
	public PessoaRequest converter(Pessoa pessoa);
	
}
