package entities;

public class Rent {
	String ClientName;
	String ClientEmail;
	int ClientRoom;
	
	public Rent(String clientName, String clientEmail, int clientRoom) {
		this.ClientName = clientName;
		this.ClientEmail = clientEmail;
		this.ClientRoom = clientRoom;
	}
	
	public String getClientName() {
		return this.ClientName;
	}
	public void setClientName(String clientName) {
		ClientName = clientName;
	}
	public String getClientEmail() {
		return ClientEmail;
	}
	public void setClientEmail(String clientEmail) {
		ClientEmail = clientEmail;
	}
	public int getClientRoom() {
		return ClientRoom;
	}
	public void setClientRoom(int clientRoom) {
		ClientRoom = clientRoom;
	}
	
	
}
