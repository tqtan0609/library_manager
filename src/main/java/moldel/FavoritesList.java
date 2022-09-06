package moldel;

public class FavoritesList {
    private int idBook;
    private int idAccount;

    public FavoritesList() {
    }

    public FavoritesList(int idBook, int idAccount) {
        this.idBook = idBook;
        this.idAccount = idAccount;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    @Override
    public String toString() {
        return "FavoritesList{" +
                "idBook=" + idBook +
                ", idAccount=" + idAccount +
                '}';
    }
}
