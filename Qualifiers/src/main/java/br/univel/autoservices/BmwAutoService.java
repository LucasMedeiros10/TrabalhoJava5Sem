package br.univel.autoservices;

import br.univel.comum.AutoService;
import br.univel.qualifiers.Bmw;

@Bmw
public class BmwAutoService implements AutoService{

	@Override
	public String getService() {
		return "Bmw auto service";
	}

}
