package hibernate.entity;

public class Candidato {
	
	private Integer id;
	private String nome;
	private Cargo Cargo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cargo getCargo() {
		return Cargo;
	}
	public void setCargo(Cargo cargo) {
		Cargo = cargo;
	}
}
