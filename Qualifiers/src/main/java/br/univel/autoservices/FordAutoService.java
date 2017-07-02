package br.univel.autoservices;

import br.univel.comum.AutoService;
import br.univel.qualifiers.Ford;

@Ford
public class FordAutoService implements AutoService{

	@Override
	public String getService() {
		return "Ford auto service";
	}

}
