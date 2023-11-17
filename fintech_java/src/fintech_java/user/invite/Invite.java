package fintech_java.user.invite;

public class Invite {
	private String numInvite;
	private int quantityGuests;
	
	public Invite(String numInvite, int quantityGuests) {
        this.numInvite = numInvite;
        this.quantityGuests = quantityGuests;
    }

    public void sendInvite() {
        System.out.println("Convite #" + numInvite + " enviado com sucesso para " + quantityGuests + " convidados.");
    }

    public String getNumInvite() {
        return numInvite;
    }

    public void setNumInvite(String numInvite) {
        this.numInvite = numInvite;
    }

    public int getQuantityGuests() {
        return quantityGuests;
    }

    public void setQuantityGuests(int quantityGuests) {
        this.quantityGuests = quantityGuests;
    }
}
