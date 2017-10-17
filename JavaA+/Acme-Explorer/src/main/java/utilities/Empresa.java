
package utilities;

import domain.DomainEntity;

public class Empresa extends DomainEntity {

	private String	nombre;

	private String	empresa;


	public String getNombre() {
		return this.nombre;
	}

	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(final String empresa) {
		this.empresa = empresa;
	}
}
