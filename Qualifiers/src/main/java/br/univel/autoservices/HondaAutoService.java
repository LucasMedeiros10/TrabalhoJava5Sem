package br.univel.autoservices;

import br.univel.comum.AutoService;
import br.univel.qualifiers.Honda;

@Honda
public class HondaAutoService implements AutoService{

	@Override
	public String getService() {
		return "Honda auto service";
	}

}
