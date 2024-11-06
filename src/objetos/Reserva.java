package objetos;

public class Reserva {
	
	private String nomeHospede;
	private String checkin;
	private String checkout;
	private Quarto quarto;
	
	public String getNomeHospede() {
		return nomeHospede;
	}
	public void setNomeHospede(String nomeHospede) {
		this.nomeHospede = nomeHospede;
	}
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	public Quarto getQuarto() {
		return quarto;
	}
	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	
	public Reserva(String nomeHospede, String checkin, String checkout, Quarto quarto) {
		super();
		this.nomeHospede = nomeHospede;
		this.checkin = checkin;
		this.checkout = checkout;
		this.quarto = quarto;
	}
	public Reserva() {
		super();
	}
	
	@Override
	public String toString() {
		return "Reserva [nomeHospede=" + nomeHospede + ", checkin=" + checkin + ", checkout=" + checkout + ", quarto="
				+ quarto + "]";
	}
	
	

}
