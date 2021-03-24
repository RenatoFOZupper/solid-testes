package converter;

import java.util.List;
import java.util.stream.Collectors;

import com.renato.demo.pessoa.Pessoa;
import com.renato.demo.pessoa.PessoaRequest;


public class ListaDePessoasParaListaDePessoasDto implements Converter {

	public List<PessoaRequest> converter(List<Pessoa> pessoas) {
		List<PessoaRequest> pessoasDto = pessoas.stream().map(pessoa -> new PessoaRequest(pessoa)).collect(Collectors.toList());
		return pessoasDto;
	}

	public PessoaRequest converter(Pessoa pessoa) {
		PessoaRequest pessoaRequest = new PessoaRequest(pessoa);
		return pessoaRequest;
	}
	
}
