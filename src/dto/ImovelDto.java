package dto;

public class ImovelDto {
	String endereco,cidade,bairro,estado;
	int valor;
	int cd_Imovel;
	public int getCd_Imovel() {
		return cd_Imovel;
	}
	public void setCd_Imovel(int cd_Imovel) {
		this.cd_Imovel = cd_Imovel;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
}
