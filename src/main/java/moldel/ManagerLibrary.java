package moldel;



import java.util.ArrayList;
import java.util.List;

public class ManagerLibrary {
    List<Book> listbook;
    List<Book> listlikebook;

    public ManagerLibrary() {
        this.listbook = new ArrayList<>();
        this.listlikebook = new ArrayList<>();
    }

    public ManagerLibrary(ArrayList<Book> listbook) {
        this.listbook = listbook;
    }

    //them sach vao danh sach
    public void addbook(Book book) {
        this.listbook.add(book);
    }
    //them sach vao muc yeu thich
//    public  void addlikebook(Book book){
//        this.listlikebook.add(book);
//    }

    public void displaybook() {
        for (Book book : listbook) {
            System.out.println(book);
        }
    }

    public boolean deletebook(String idbook) {
        Book book = this.listbook.stream().filter(document -> document.getIdBook().equals(idbook)).findFirst().orElse(null);
        if (book == null) return false;
        this.listbook.remove(book);
        return true;
    }

    //    public void searchbook(String id) {
//        this.listbook.stream().filter(listbook -> listbook instanceof Book).forEach(listbook -> System.out.println(listbook.toString()));
//    }
    public void searchlikebook(String name) {
        for (Book book : listlikebook) {
            if (book.getNameBook().indexOf(name) >= 0) {
                System.out.println(book);
            }
            if (book.getAuthorBook().indexOf(name) >= 0) {
                System.out.println(book);
            }
        }
    }

    //them sach vao muc yeu thich thong qua id
    public void addlike(String id) {
        for (Book book : listbook) {
            if (book.getIdBook().indexOf(id) >= 0) {
                System.out.println("Cam on ban da them sach vao muc yeu thich" + book);
                listlikebook.add(book);
            }
        }
    }

    //in ra man hinh danh sach book yeu thich
    public void displaylikebook() {
        for (Book book : listlikebook) {
            System.out.println(book);
        }
    }

    //xoa book khoi danh sach yeu thich
    public boolean deletelikebook(String idbook1) {
        Book book1 = this.listlikebook.stream().filter(document -> document.getIdBook().equals(idbook1)).findFirst().orElse(null);
        if (book1 == null) return false;
        this.listlikebook.remove(book1);
        return true;
    }


}

